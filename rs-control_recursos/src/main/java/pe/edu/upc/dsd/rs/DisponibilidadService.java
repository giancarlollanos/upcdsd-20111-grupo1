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
	public String listarRecursos(@PathParam("tiporecurso") int tipoRecurso) {
		String lista="";
		switch (tipoRecurso)
		{
		case 0: 
			//Recurso - Despachador
			lista="<br>RD001<br>RD002<br>RD003<br>RD004";
			/*
			rec=new Recurso();rec.setCodigo("RD001");lista.add(rec);
			rec=new Recurso();rec.setCodigo("RD002");lista.add(rec);
			rec=new Recurso();rec.setCodigo("RD003");lista.add(rec);
			rec=new Recurso();rec.setCodigo("RD004");lista.add(rec);
			*/	
			break;
		case 1:
			//Recurso - Movilidad
			lista="RM001,RM002";
			/*
			rec=new Recurso();rec.setCodigo("RM001");lista.add(rec);
			rec=new Recurso();rec.setCodigo("RM002");lista.add(rec);
				*/		
			break;			
		default:
			//Recurso - Libre
			lista="RL001";
			//rec=new Recurso();rec.setCodigo("RL001");lista.add(rec);
			break;
		}
		return lista;
	}


}
