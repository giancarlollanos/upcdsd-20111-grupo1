package pe.edu.upc.dsd.rs;

public class Recurso {

	public Recurso(){
		
		
	}
	
	private String codigo;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	private String nombres;
	private String apellidos;
	
	
	
}
