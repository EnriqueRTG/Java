package com.bytebank.modelo;

public class ControlBonificacion {

	private double sumaBonificaciones;
	
	public double registrarSalario (Funcionario funcionario) {
		this.sumaBonificaciones = funcionario.getBonificacion() + this.sumaBonificaciones;
		System.out.println("Calculo actual: " + sumaBonificaciones);
 		return this.sumaBonificaciones;
	}
}
