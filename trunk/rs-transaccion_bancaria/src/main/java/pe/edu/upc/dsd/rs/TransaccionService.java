package pe.edu.upc.dsd.rs;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/Transaccion")
public class TransaccionService {

	@GET
	@Path("/validar/{tarjeta}/{titular}/{pin}/{monto}")
	@Produces("text/plain")
	public String validarTarjeta(@PathParam("tarjeta") String tarjeta, @PathParam("titular") String titular, @PathParam("pin") String pin,@PathParam("monto") int monto) {
		String msj="";
		if (tarjeta.equals(" ") && titular.equals(" ") && pin.equals(" ")){
			msj="Por favor llene todos los casilleros";
		} else {
		if (tarjeta.equals(" ") || titular.equals(" ") || pin.equals(" ")){
			msj="Por favor verfique que todos los casilleros esten correctamente llenados";
		}else {
		if (tarjeta.equals("102030") && titular.equals("Dante Maldonado") && pin.equals("1512") && monto<100) {
			msj="Transaccion Correcta";
		} else { 
			if (tarjeta.equals("102040") && titular.equals("Luisa Delgadillo") && pin.equals("2058")&& monto<100) {
				msj="Transaccion Correcta";
			} else {
				if (tarjeta.equals("102050") && titular.equals("Juan Perez") && pin.equals("3591")&& monto<100) {
					msj="Transaccion Correcta"; 
				} else {
					if (tarjeta.equals("102060") && titular.equals("Mario Moran") && pin.equals("4682")&& monto<100) {
						msj="Transaccion Correcta"; 
					} else {
						if (tarjeta.equals("102070") && titular.equals("Gian Carlo Suarez") && pin.equals("6014")&& monto<100) {
							msj="Transaccion Correcta"; 
						} else {
							if (tarjeta.equals("102080") && titular.equals("Jenny Angulo") && pin.equals("7033")&& monto<100) {
								msj="Transaccion Correcta"; 
							} else {
								msj="Tarjeta " + tarjeta + " : Transaccion Incorrecta";
							}
						}
					}
				}
			}
		}
		}
		}
		return msj;

	}
}