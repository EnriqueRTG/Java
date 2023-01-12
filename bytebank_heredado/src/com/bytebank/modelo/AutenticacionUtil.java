package com.bytebank.modelo;

public class AutenticacionUtil {

	private String clave;

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean autenticacion(String clave) {
		return this.clave == clave;
	}

}
