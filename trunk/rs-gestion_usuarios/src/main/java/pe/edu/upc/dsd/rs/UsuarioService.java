package pe.edu.upc.dsd.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/Usuario")
public class UsuarioService {

	@GET
	@Path("/registrar/{codigo}/{nombre}/{idlogin}/{password}/{direccion}/{telefono}")
	@Produces("text/plain")
	public String registrarUsuario
		   (@PathParam("codigo") String codigo,
			@PathParam("nombre") String nombre,
			@PathParam("idlogin") String idlogin,
			@PathParam("password") String password,
			@PathParam("direccion") String direccion,
			@PathParam("telefono") String telefono) {
		String msj = "";
		if (codigo.equals("")) {
			msj = "Completar codigo";
		}
		else
		{ 
			if (nombre.equals("")) {
				msj = "Completar nombre";
			}
		else 
		{
			if (idlogin.equals("")) {
					msj = "Completar idlogin";
			}
		else 
		{
			if (password.equals("")) {
						msj = "Completar password";
			}
		else 
		{
			if (direccion.equals("")) {
							msj = "Completar direccion";
			}
		else if (telefono.equals("")) {
								msj = "Completar telefono";
							} else {
								msj = "Registro de Usuario Satisfactorio";
							}
			}
			}
		}
		}
		return msj;
	}
/*
	@GET
	@Path("/actualizar/{codigo}/{nombre}/{idlogin}/{password}/{direccion}/{telefono}")
	@Produces("text/plain")
	public String actualizarUsuario
		   (@PathParam("codigo") String codigo,
			@PathParam("nombre") String nombre,
			@PathParam("idlogin") String idlogin,
			@PathParam("password") String password,
			@PathParam("direccion") String direccion,
			@PathParam("telefono") String telefono) {
		String msj = "";
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
								msj = "Actualizacion de Usuario Satisfactoria";
							}
						}
					}
				}
			}
		return msj;
	}*/
	
	
	@GET
	@Path("/login/{idlogin}/{password}")
	@Produces("text/plain")
	public String loginUsuario
		   (@PathParam("idlogin") String idlogin,
			@PathParam("password") String password) {
		String msj = "";
		if (idlogin.equals("admin") && password.equals("1234")) {
			msj = "Login Satisfactorio";
		} else {
			msj = "Usuario Invalido";
		}
		return msj;
	}
}
