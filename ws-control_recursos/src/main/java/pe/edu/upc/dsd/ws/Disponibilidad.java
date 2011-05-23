package pe.edu.upc.dsd.ws;

import javax.jws.WebService;

@WebService
public interface Disponibilidad {
	public String consultarRecurso(String codigo, String fecha, String Hora);
	public String listarRecursos(int tipoRecurso);
	public String asignarRecurso(String codigo, String codigoPedido);
}
