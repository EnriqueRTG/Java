package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.GuardaObjetos;

public class TestGuardarReferencias {

	public static void main(String[] args) {

		GuardaObjetos objetos = new GuardaObjetos();

		int uno = 1;
		char eme = 'm';
		String palabra = "palabra";
		Cuenta cc = new CuentaCorriente(11, 22);
		Cliente cliente = new Cliente("Luis", "123456789", "Docente");

		objetos.adicionar(uno);
		objetos.adicionar(eme);
		objetos.adicionar(palabra);
		objetos.adicionar(cc);
		objetos.adicionar(cliente);

		for (int i = 0; i < objetos.tamanio(); i++) {
			System.out.println(objetos.obtener(i));
		}

	}

}
