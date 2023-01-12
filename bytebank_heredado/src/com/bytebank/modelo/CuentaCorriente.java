package com.bytebank.modelo;

public class CuentaCorriente extends Cuenta implements Tributacion {
	
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		double comision = 0.2;
		super.retirar(valor + comision);
	}
	
	@Override
	public void depositar(double valor) {
		super.setSaldo(super.getSaldo() + valor);
	}
	
	@Override
	public double getValorImpuesto() {
		return super.getSaldo() * 0.1;
	}
	
	@Override
	public String toString() {
	    return "CuentaCorriente, " + super.toString();
	}

}
