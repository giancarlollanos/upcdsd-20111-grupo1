package pe.edu.upc.dsd.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "pe.edu.upc.dsd.ws.Disponibilidad")
public class DisponibilidadImpl implements Disponibilidad {

	public String consultarRecurso(String codigo, String fecha, String Hora) {
		String mensaje="";
		if (codigo=="RD001") mensaje="Disponible"; 
		if (codigo=="RD002") mensaje="Disponible"; 
		if (codigo=="RD003") mensaje="Disponible"; 
		if (codigo=="RD004") mensaje="No Disponible"; 
		if (codigo=="RD005") mensaje="No Disponible"; 
		if (codigo=="RD006") mensaje="Disponible"; 
		if (codigo=="RD007") mensaje="No Disponible"; 
		if (codigo=="RD008") mensaje="Disponible"; 
		if (codigo=="RD009") mensaje="Disponible"; 
		return mensaje;
	}
	
	public String listarRecursos(int tipoRecurso) {
		switch (tipoRecurso)
		{
		case 0: 
			//Recurso - Despachador
			return "RD001; RD002; RD003; RD003; RD004; RD005; RD006; RD007; RD008; RD009";
		case 1:
			//Recurso - Movilidad
			return "RM001; RM002; RM003; RM003; RM004; RM005; RM006; RM007; RM008; RM009";
		default:
			return "RL001; RL002; RL003; RL003; RL004";
		}
	}
	
	public String asignarRecurso(String codigo, String codigoPedido) {
		return "Asignado";
	}
	
}
