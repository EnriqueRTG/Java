package com.bytebank.test;

import com.bytebank.modelo.Gerente;
import com.bytebank.modelo.SistemaInterno;

public class TestDeSistemaInterno {
	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente = new Gerente();

		gerente.setClave("12345");

		sistema.autentica(gerente);

	}
}
