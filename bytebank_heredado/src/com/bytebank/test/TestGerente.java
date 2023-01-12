package com.bytebank.test;

import com.bytebank.modelo.Gerente;

public class TestGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();

		gerente.setSalario(5000);
		
		gerente.setClave("clave");

		System.out.println("Bonificacion de Gerente: " + gerente.getBonificacion());
		System.out.println(gerente.getClave());
		System.out.println(gerente.autenticar("clave"));
		
		Gerente jose = new Gerente ();
		System.out.println(jose.getBonificacion());
	}
}
