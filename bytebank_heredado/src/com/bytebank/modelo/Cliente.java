package com.bytebank.modelo;

public class Cliente implements Autenticable {
	private String nombre;
	private String documento;
	private String profesion;
	private AutenticacionUtil util;
	
	public Cliente() {
		this.util = new AutenticacionUtil();
	}
	
	public Cliente(String nombre) {
		this.util = new AutenticacionUtil();
		this.setNombre(nombre);
	}

	public Cliente(String nombre, String documento, String profesion) {
		this.util = new AutenticacionUtil();
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

	@Override
	public String getClave() {
		return this.util.getClave();
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);

	}

	@Override
	public boolean autenticar(String clave) {
		return this.util.autenticacion(clave);
	}

}
