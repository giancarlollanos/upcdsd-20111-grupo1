package pe.edu.upc.dsd.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "pe.edu.upc.dsd.ws.Verificacion")
public class VerificacionImpl implements Verificacion {
	public String saludar(String nombre) {
		return "Usted tiene " + nombre;
	}
}  
