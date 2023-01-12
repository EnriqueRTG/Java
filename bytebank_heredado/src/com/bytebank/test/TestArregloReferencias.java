package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.CuentaAhorro;
import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {

	public static void main(String[] args) {
		
		int tamanoArray = 5;
		Object[] referencias = new Object[tamanoArray];
		
		CuentaCorriente cc = new CuentaCorriente(23, 44);
		referencias[1] = cc;
		
		Cliente cliente = new Cliente();
		referencias[4] = cliente;
		
		Cliente obtenido = (Cliente) referencias[4];
		System.out.println(obtenido);
		
		CuentaAhorro ca = new CuentaAhorro(11, 11);
		referencias[3] = ca;
		
		// primera linea
		System.out.println(cc);
		System.out.println("\n");
		
		//segunda, tercera, cuarta y quinta linea
		System.out.println(referencias[1]);
		referencias[0] = new CuentaCorriente(22, 12);
		System.out.println(referencias[0]);
		
		// Cast
		CuentaCorriente cuenta = (CuentaCorriente) referencias[1];
		System.out.println(cuenta + " --");
		
		System.out.println(referencias[2]);
		System.out.println("\n");
		
		//6, 7, 8, 9 y 10 lineas
		for (int i = 0; i < referencias.length; i++) {
			System.out.println(referencias[i]);
		}
		System.out.println("\n");
		
		// 11 y 12 lineas
		CuentaCorriente cc1 = new CuentaCorriente(22, 11);
        CuentaCorriente cc2 = new CuentaCorriente(22, 22);

        referencias[0] = cc1;
        referencias[1] = cc2;

        System.out.println(referencias[0]);
        System.out.println(referencias[1]);
				
	}

}
