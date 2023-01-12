package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {

	public static void main(String[] args) {
		
		List<Cliente> listaClientes = new ArrayList<Cliente	>();

		ArrayList<Cuenta> lista = new ArrayList<Cuenta>();
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(33, 44);
		Cuenta cc3 = new CuentaCorriente(11, 22);

		lista.add(cc);
		lista.add(cc2);

		// Cliente cliente = new Cliente();
		// lista.add(cliente);

		Cuenta cuentaObtenida = lista.get(0);
		System.out.println(cuentaObtenida + "\n");

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		// foreach
		// por cada cuenta en la lista...
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}

		// constains busca si contiene el objeto pasado por parametro
		// lo que busca es si contiene la referencia del objeto pasado
		// no compara los valores sino la referencia
		if (lista.contains(cc3)) {
			System.out.println("si (sobreescribiendo equals)"); //ahora si compara los valores de sus atributos y no la referencia en memoria
		} else {
			System.out.println("no (sobreescribiendo equals)");
		}
		
		//comparacion de valores de sus atributos
		//por metodo perzonalizado en Cuenta
		if(cc.esIgual(cc3)) {
			System.out.println("si son iguales");
		} else {
			System.out.println("no son iguales");
		}
	}

}
