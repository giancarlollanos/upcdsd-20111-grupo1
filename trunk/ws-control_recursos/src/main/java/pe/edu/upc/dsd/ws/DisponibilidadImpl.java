package pe.edu.upc.dsd.ws;

import java.util.ArrayList;
import javax.jws.WebService;

@WebService(endpointInterface = "pe.edu.upc.dsd.ws.Disponibilidad")
public class DisponibilidadImpl implements Disponibilidad {

	public String consultarRecurso(String codigo, String fecha, String hora) {
		String msj="";
		if (codigo.equals("RD001")) {
			msj="Disponible";
		} else { 
			if (codigo.equals("RD002")) {
				msj="Disponible";
			} else {
				if (codigo.equals("RD003")) {
					msj="Disponible"; 
				} else {
					if (codigo.equals("RD004")) {
						msj="No Disponible"; 
					} else {
						if (codigo.equals("RM001")) {
							msj="No Disponible"; 
						} else {
							if (codigo.equals("RM002")) {
								msj="Disponible"; 
							} else {
								msj="Recurso " + codigo + " no Encontrado";
							}
						}
					}
				}
			}
		}
		return msj;
	}
	
	public ArrayList listarRecursos(int tipoRecurso) {
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
	
	public String asignarRecurso(String codigo, String codigoPedido) {
		return "Asignado";
	}
	
}
