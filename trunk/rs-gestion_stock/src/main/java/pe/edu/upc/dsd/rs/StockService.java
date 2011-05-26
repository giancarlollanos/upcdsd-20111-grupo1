package pe.edu.upc.dsd.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/Stock")
public class StockService {

	@GET
	@Path("/consultar/{codigolibro}")
	@Produces("text/plain")
	public String consultarStock(@PathParam("codigolibro") String codigolibro) {
		String msj="";
	
		if (codigolibro.equals("L001")) {
			msj="25";
		} else { 
			if (codigolibro.equals("L002")) {
				msj="19";
			} else {
				if (codigolibro.equals("L003")) {
					msj="45"; 
				} else {
					if (codigolibro.equals("L004")) {
						msj="11"; 
					} else {
						if (codigolibro.equals("L005")) {
							msj="0"; 
						} else {
							msj="Libro " + codigolibro + " no Encontrado";
						}
					}
				}
			}
		}
		return msj;
	}

	@GET
	@Path("/actualizar/{codigolibro}/{cantidad}")
	@Produces("text/plain")
	public String listarRecursos(@PathParam("codigolibro") String codigolibro,@PathParam("cantidad") int cantidad) {
		String msj="";
		if(!codigolibro.equals("") && cantidad!=0)
		{
			msj="Registro Actualizado";			
		}
		else
		{			
			msj="Error de Actualizacion";
		}
		return msj;
	}


}
