package pe.edu.upc.dsd.ws;

import java.util.ArrayList;
import javax.jws.WebService;

@WebService
public interface Disponibilidad {
	public String consultarRecurso(String codigo, String fecha, String hora);
	public String asignarRecurso(String codigo, String codigoPedido);
	public ArrayList listarRecursos(int tipoRecurso);
}
