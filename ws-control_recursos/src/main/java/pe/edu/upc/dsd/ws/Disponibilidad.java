package pe.edu.upc.dsd.ws;

import javax.jws.WebService;

@WebService
public interface Disponibilidad {
	public String consultar(String codigo);
}
