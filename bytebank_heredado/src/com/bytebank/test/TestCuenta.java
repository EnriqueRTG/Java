package com.bytebank.test;

import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.CuentaAhorro;

public class TestCuenta {

	public static void main(String[] args) {
		CuentaCorriente cc = null;
		CuentaAhorro ca = new CuentaAhorro(2, 3);
		
		cc.depositar(2000);
		cc.transferir(1000, ca);
		System.out.println(cc.getSaldo());
		
		
		ca.depositar(5000);
		System.out.println(ca.getSaldo());
	}
}
