package pe.edu.upc.dsd.ws;

import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(endpointInterface = "pe.edu.upc.dsd.ws.GestionStock")
public class GestionStockImpl implements GestionStock {
	
	public String saludar(String nombre)
	{
		return "Hola"+nombre;		
	}
	
	public Producto consultarProducto(int codigo) {		
		Producto x=new Producto();
		x.setCodigo(1);
		x.setNombre("Producto 1");
		return x;
	}
	
	public int consultarStock(@WebParam(name="codigo") int codigo) {
		int cantidad=0;
		
		switch(codigo)
		{
		case 1:
			cantidad=10;
			break;
		case 2:
			cantidad=20;
			break;
		case 3:
			cantidad=30;
			break;		
		}
		System.out.println("xxxxxxxx");
		return cantidad;
	}

public boolean actualizarStock(@WebParam(name="codigo")int codigo,@WebParam(name="cantidad") int cantidad) {
	
	boolean proceso=false;
	
	switch(codigo)
	{
	case 1:
		proceso=true;
		break;
	case 2:
		proceso=true;
		break;
	case 3:
		proceso=true;
		break;		
	}

	return proceso;
}

}