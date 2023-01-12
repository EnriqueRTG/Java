package com.bytebank.modelo;

public abstract class Funcionario {
	private String nombre;
	private String documento;
	private double salario;

	public Funcionario() {

	}

	public Funcionario(String nombre, String documento, double salario) {
		this.setNombre(nombre);
		this.setDocumento(documento);
		this.setSalario(salario);
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public abstract double getBonificacion();

}
