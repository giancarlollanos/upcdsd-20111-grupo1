package pe.edu.upc.dsd.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "pe.edu.upc.dsd.ws.Disponibilidad")
public class DisponibilidadImpl implements Disponibilidad {
	public String consultar(String codigo) {
		return "El c�digo " + codigo + " est� habilitado.";
	}
}
