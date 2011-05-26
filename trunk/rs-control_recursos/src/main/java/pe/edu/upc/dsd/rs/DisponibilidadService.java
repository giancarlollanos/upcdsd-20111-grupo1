package pe.edu.upc.dsd.rs;

import java.util.ArrayList;
import java.util.List;

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
		String msj="";
		if (codigorecurso.substring(0, 2).equals("RD")) {
			if (codigorecurso.equals("RD001")) msj="Asignado";
			if (codigorecurso.equals("RD002")) msj="Asignado";
			if (codigorecurso.equals("RD003")) msj="Asignado";
			if (codigorecurso.equals("RD004")) msj="No Asignado";
		} else {
			msj="Recurso " + codigorecurso + " no encontrado";		
		}
		return msj;
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
	public String listarRecursos(@PathParam("tiporecurso") int tipoRecurso) {
		String lista="";
		switch (tipoRecurso)
		{
		case 0: 
			//Recurso - Despachador
			lista="RD001,RD002,RD003,RD004";
			break;
		case 1:
			//Recurso - Movilidad
			lista="RM001,RM002";
			break;			
		default:
			//Recurso - Libre
			lista="RL001";
			break;
		}
		return lista;
	}


}
