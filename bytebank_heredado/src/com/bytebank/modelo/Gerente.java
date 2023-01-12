package com.bytebank.modelo;

public class Gerente extends Funcionario implements Autenticable {

	private AutenticacionUtil util;
	
	public Gerente() {
		this.util = new AutenticacionUtil();
	}

	@Override
	public double getBonificacion() {
		return super.getSalario() + (this.getSalario() * 0.05);
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
