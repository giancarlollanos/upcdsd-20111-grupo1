package pe.edu.upc.dsd.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "pe.edu.upc.dsd.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	public String saludar(String nombre) {
		return "Hola " + nombre;
	}
}