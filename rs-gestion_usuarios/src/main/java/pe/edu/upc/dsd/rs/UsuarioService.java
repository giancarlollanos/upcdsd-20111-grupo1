package pe.edu.upc.dsd.rs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/Usuario")
public class UsuarioService {

	@GET
	@Path("/registrar/{codigo}/{nombre}/{idlogin}/{password}/{direccion}/{telefono}")
	@Produces("text/plain")
	public String registrarUsuario(@PathParam("codigo") String codigo,
			@PathParam("nombre") String nombre,
			@PathParam("idlogin") String idlogin,
			@PathParam("password") String password,
			@PathParam("direccion") String direccion,
			@PathParam("telefono") String telefono) {
		String msj = "";
		if (codigo == "") {
			msj = "Completar codigo";
			if (nombre == "") {
				msj = "Completar nombre";
				if (idlogin == "") {
					msj = "Completar idlogin";
					if (password == "") {
						msj = "Completar password";
						if (direccion == "") {
							msj = "Completar direccion";
							if (telefono == "") {
								msj = "Completar telefono";
							} else {
								msj = "Registro de Usuario Satisfactorio";
							}
						}
					}
				}
			}
		}
		return msj;
	}

	@GET
	@Path("/login/{idlogin}/{password}")
	@Produces("text/plain")
	public String loginUsuario(@PathParam("idlogin") String idlogin,
			@PathParam("password") String password) {
		String msj = "";
		if (idlogin.equals("rhumire") && password.equals("1234")) {
			msj = "Login Satisfactorio";
		} else {
			msj = "Usuario Invalido";
		}
		return msj;
	}

	@GET
	@Path("/listar/{tiporecurso}")
	@Produces("text/plain")
	public String listarRecursos(@PathParam("tiporecurso") int tipoRecurso) {
		String lista = "";
		switch (tipoRecurso) {
		case 0:
			// Recurso - Despachador
			lista = "RD001,RD002,RD003,RD004";
			break;
		case 1:
			// Recurso - Movilidad
			lista = "RM001,RM002";
			break;
		default:
			// Recurso - Libre
			lista = "RL001";
			break;
		}
		return lista;
	}

}
