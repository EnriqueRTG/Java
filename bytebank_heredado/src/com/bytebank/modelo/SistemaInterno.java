package com.bytebank.modelo;

public class SistemaInterno {

	private String clave = "12345";

	public boolean autentica(Autenticable funcionario) {
		boolean puedeIniciarSesion = funcionario.autenticar(this.clave);
		if (puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		} else {
			System.out.println("Error de login");
			return false;
		}
	}

}
