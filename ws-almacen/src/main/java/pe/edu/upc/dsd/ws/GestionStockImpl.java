package pe.edu.upc.dsd.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "pe.edu.upc.dsd.ws.GestionStock")
public class GestionStockImpl implements GestionStock {
	
	public int consultarStock(int codigo) {
		int cantidad=0;
		
		
		return cantidad;
	}

}