package pe.edu.upc.dsd.ws;

import javax.jws.WebService;

@WebService
public interface GestionStock {
	
	public String saludar(String nombre);
	
	public Producto consultarProducto(int codigo);
	
	public int consultarStock(int codigo);
	
	public boolean actualizarStock(int codigo, int cantidad);
	
}