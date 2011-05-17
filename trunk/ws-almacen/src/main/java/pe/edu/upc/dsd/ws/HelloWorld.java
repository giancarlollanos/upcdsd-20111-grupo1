package pe.edu.upc.dsd.ws;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
	public String saludar(String nombre);
}