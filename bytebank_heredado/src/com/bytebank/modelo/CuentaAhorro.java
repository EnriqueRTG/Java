package com.bytebank.modelo;

public class CuentaAhorro extends Cuenta {

	public CuentaAhorro(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void depositar(double valor) {
		super.setSaldo(super.getSaldo() + valor);
	}
	
	@Override
	public String toString() {
	    return "CuentaAhorros, " + super.toString();
	}

}
