package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.GuardaCuentas;

public class TestGuardaCuentas {

	public static void main(String[] args) {
		
		GuardaCuentas guardaCuentas = new GuardaCuentas();
		Cuenta cc = new CuentaCorriente(11, 22);
		guardaCuentas.adicionar(cc);
		
		Cuenta cc2 = new CuentaCorriente(22, 33);
		guardaCuentas.adicionar(cc2);
		
		guardaCuentas.obtner(1);
		
		System.out.println(guardaCuentas.obtner(0));
		System.out.println(guardaCuentas.obtner(1));
	}
}
	