package pe.edu.upc.dsd.ws;

//import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {

        private HelloWorld helloWorld;

        public HelloWorldTest() {
                ApplicationContext context = new ClassPathXmlApplicationContext(
                                "/applicationContext.xml");
                this.helloWorld = context.getBean("helloWorldClient", HelloWorld.class);
        }

        @Test
        public void testSaludar() {
                //Assert.assertEquals("Hola Rafael", helloWorld.saludar("Rafael"));
        		System.out.println(helloWorld.saludar("Rafael"));
        }
}