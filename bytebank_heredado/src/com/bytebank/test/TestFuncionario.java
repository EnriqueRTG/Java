package com.bytebank.test;

import com.bytebank.modelo.Contador;

public class TestFuncionario {

	public static void main(String[] args) {
		Contador diegoFun = new Contador();

		diegoFun.setNombre("Diego");
		diegoFun.setDocumento("37698363");
		diegoFun.setSalario(2000);

		System.out.println(diegoFun.getNombre());
		System.out.println(diegoFun.getDocumento());
		System.out.println(diegoFun.getSalario());

		System.out.println("Bonificacion: " + diegoFun.getBonificacion());
	}
}
