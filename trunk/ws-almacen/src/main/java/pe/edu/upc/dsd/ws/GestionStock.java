package pe.edu.upc.dsd.ws;

import javax.jws.WebService;

@WebService
public interface GestionStock {
	
	
	public int cantidadLibros(int codigo);
	
	
}