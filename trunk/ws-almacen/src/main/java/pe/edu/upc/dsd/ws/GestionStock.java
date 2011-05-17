package pe.edu.upc.dsd.ws;

import javax.jws.WebService;

@WebService
public interface GestionStock {
	
	
	public int consultarStock(int codigo);
	
	
}