package com.bytebank.modelo;

public class CalculadoraDeImpuesto {

	private double totalImpuesto;

	public void registra(Tributacion t) {
		double valor = t.getValorImpuesto();
		this.totalImpuesto += valor;
	}

	public double getTotalImpuesto() {
		return this.totalImpuesto;
	}
}
