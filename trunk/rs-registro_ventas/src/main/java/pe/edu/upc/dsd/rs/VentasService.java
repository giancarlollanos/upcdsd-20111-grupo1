package pe.edu.upc.dsd.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/Ventas")
public class VentasService {

	@GET
	@Path("/registrar/{codigolibro}/{codigousuario}/{cantidad}/")
	@Produces("text/plain")
	public String registrarVenta(@PathParam("codigolibro") String codigolibro,@PathParam("codigousuario") String codigousuario,@PathParam("cantidad") int cantidad) {
		String msj="";
		if(!codigolibro.equals("") && !codigousuario.equals("") && cantidad!=0)
		{
			msj="Registro Correcto";			
		}
		else
		{			
			msj="Error de Registro";
		}
		return msj;
	}


}
