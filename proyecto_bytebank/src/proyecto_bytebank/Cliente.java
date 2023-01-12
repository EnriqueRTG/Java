package proyecto_bytebank;

public class Cliente {
	private String nombre;
	private String documento;
	private String profesion;

	public Cliente() {

	}

	public Cliente(String nombre, String documento, String profesion) {
		this.setNombre(nombre);
		this.setDocumento(documento);
		this.setProfesion(profesion);
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	private void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getDocumento() {
		return this.documento;
	}

	private void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getProfesion() {
		return this.profesion;
	}
	
	public void asignarNombre(String nombre) {
		this.setNombre(nombre);
	}

}
