package pe.edu.upc.dsd.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

//import org.apache.log4j.Logger;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class RequestResponseServer implements MessageListener {
//	private static final Logger logger = Logger
//			.getLogger(MessageConsumer.class);
	private JmsTemplate jmsTemplate;
	private String responseDestination;

	public void onMessage(final Message message) {
		if (message instanceof TextMessage) {
			final TextMessage requestMessage = (TextMessage) message;
			try {
				final String mensaje;
				String tmp=requestMessage.getText();
				mensaje="Usuario " + tmp + " aceptado";
//				logger.debug(mensaje);
				jmsTemplate.send(responseDestination, new MessageCreator() {
					@Override
					public Message createMessage(Session session)
							throws JMSException {
						TextMessage responseMessage = session
								.createTextMessage();
						responseMessage.setJMSCorrelationID(requestMessage
								.getJMSCorrelationID());
						responseMessage.setText(mensaje);
						System.out.println("Servidor (enviado): " + mensaje);
						return responseMessage;
					}
				});
			} catch (final JMSException e) {
//				e.printStackTrace();
			}
		}
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public void setResponseDestination(String destinationName) {
		this.responseDestination = destinationName;
	}
}