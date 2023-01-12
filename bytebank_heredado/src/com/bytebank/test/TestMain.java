package com.bytebank.test;

public class TestMain {

	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		int edad = 20;
		int edad2 = 15;
		int edad3 = 65;

		// quiero agruparlas en una sola referencia
		int tamanioArray = 5;
		int[] edades = new int[tamanioArray];

		for (int i = 0; i < edades.length; i++) {
			edades[i] += i;
		}

		for (int i = 0; i < edades.length; i++) {
			System.out.println(edades[i]);
		}
	}

}
