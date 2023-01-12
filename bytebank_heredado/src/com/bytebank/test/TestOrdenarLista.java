package com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorro;
import com.bytebank.modelo.CuentaCorriente;

public class TestOrdenarLista {

	public static void main(String[] args) {

		Cuenta cc1 = new CuentaCorriente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.asignarNombre("Diego");
		cc1.asignarTitular(clienteCC1);
		cc1.depositar(333.0);

		Cuenta cc2 = new CuentaAhorro(20, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.asignarNombre("Renato");
		cc2.asignarTitular(clienteCC2);
		cc2.depositar(444.0);

		Cuenta cc3 = new CuentaCorriente(15, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.asignarNombre("Lian");
		cc3.asignarTitular(clienteCC3);
		cc3.depositar(111.0);

		Cuenta cc4 = new CuentaAhorro(50, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.asignarNombre("Noel");
		cc4.asignarTitular(clienteCC4);
		cc4.depositar(222.0);

		List<Cuenta> lista = new ArrayList<>();

		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		System.out.println("Antes de ordenar: ");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta + ", Titular: " + cuenta.getTitular().getNombre());
		}

		System.out.println("\n");

		// ordenar las cuentas
		// cualquier clase hija de Cuenta
		// Comparator <? extend Cuenta>
		Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
		lista.sort(comparator);

		System.out.println("Despues de ordenar: ");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta + ", Titular: " + cuenta.getTitular().getNombre());
		}

		System.out.println("\n");

		// Comparator<Cuenta> comparatorNombreTitular = new OrdenadorPorNombreTitular();
		// lista.sort(new OrdenadorPorNombreTitular());

		// Collections.sort(lista, new OrdenadorPorNombreTitular());
		Collections.sort(lista);

		System.out.println("Despues de ordenar por orden natural (saldo): ");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta + ", Titular: " + cuenta.getTitular().getNombre());
		}
		
		System.out.println("\n");
		Collections.reverse(lista);
		
		System.out.println("Despues de invertir el orden: ");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta + ", Titular: " + cuenta.getTitular().getNombre());
		}
		
		System.out.println("\n");
		Collections.shuffle(lista);
		
		System.out.println("Despues de mezclar el orden: ");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta + ", Titular: " + cuenta.getTitular().getNombre());
		}
		
		System.out.println("\n");
		Collections.rotate(lista, 3); // rotar 3 posiciones
		
		System.out.println("Despues de rotar el orden: ");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta + ", Titular: " + cuenta.getTitular().getNombre());
		}

		Collections.sort(lista, new OrdenadorPorNombreTitular());
		
		

	}

}

class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		// FORMA BASICA
//		if (o1.getNumero() == o2.getNumero()) {
//			return 0;
//		} else if (o1.getNumero() > o2.getNumero()) {
//			return 1;
//		} else {
//			return -1;
//		}

		// FORMA INTERMEDIA
//		return o1.getNumero() - o2.getNumero();

		// FORMA WRAPPER
		return Integer.compare(o1.getNumero(), o2.getNumero());
	}
}

class OrdenadorPorNombreTitular implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
	}

}
