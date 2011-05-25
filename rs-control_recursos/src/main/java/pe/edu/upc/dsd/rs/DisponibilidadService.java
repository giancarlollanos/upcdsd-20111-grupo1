package pe.edu.upc.dsd.rs;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/Disponibilidad")
public class DisponibilidadService {

	@GET
	@Path("/asignar/{codigorecurso}/{codigopedido}")
	@Produces("text/plain")
	public String asignarRecurso(@PathParam("codigorecurso") String codigorecurso, @PathParam("codigopedido") String codigopedido) {
		return "Asignado";
	}
	
	@GET
	@Path("/consultar/{codigorecurso}/{fecha}/{hora}")
	@Produces("text/plain")
	public String consultarRecurso(@PathParam("codigorecurso") String codigorecurso, @PathParam("fecha") String fecha, @PathParam("hora") String hora) {
		String msj="";
		if (codigorecurso.equals("RD001")) {
			msj="Disponible";
		} else { 
			if (codigorecurso.equals("RD002")) {
				msj="Disponible";
			} else {
				if (codigorecurso.equals("RD003")) {
					msj="Disponible"; 
				} else {
					if (codigorecurso.equals("RD004")) {
						msj="No Disponible"; 
					} else {
						if (codigorecurso.equals("RM001")) {
							msj="No Disponible"; 
						} else {
							if (codigorecurso.equals("RM002")) {
								msj="Disponible"; 
							} else {
								msj="Recurso " + codigorecurso + " no Encontrado";
							}
						}
					}
				}
			}
		}
		return msj;
	}

	@GET
	@Path("/listar/{tiporecurso}")
	@Produces("text/plain")
	public ArrayList listarRecursos(@PathParam("tiporecurso") int tipoRecurso) {
		ArrayList<String> lista = new ArrayList<String>();
		switch (tipoRecurso)
		{
		case 0: 
			//Recurso - Despachador
			lista.add("RD001");
			lista.add("RD002");
			lista.add("RD003");
			lista.add("RD004");
			return lista;
		case 1:
			//Recurso - Movilidad
			lista.add("RM001");
			lista.add("RM002");
			return lista;
		default:
			//Recurso - Libre
			lista.add("RL001");
			return lista;
		}
	}

}
