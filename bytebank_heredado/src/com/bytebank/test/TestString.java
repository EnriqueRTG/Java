package com.bytebank.test;

import com.bytebank.modelo.CuentaCorriente;

public class TestString {
	public static void main(String[] args) {
		String nombre = "Alura";
		//no utilizada
		//String nombre2 = new String("Alura");
		
		System.out.println("Antes de replace: " +  nombre);
		
		System.out.println("Despues del replace: " + nombre.replace("A", "a"));
		
		nombre = nombre.concat(" cursos online");
		
		System.out.println("Despues del concat: " + nombre);
		
		nombre = nombre.toUpperCase();
		
		System.out.println("Despues del UpperCase: " + nombre);
		
		nombre = nombre.toLowerCase();
		
		System.out.println("Despues del LowerCase: " + nombre);
		
		int index = 3;
		char letra = nombre.charAt(index);
		
		System.out.println("Letra retornada por charAt en la " + index + " posicion dada por el valor del index: " + letra);
		
		char letraBuscada = 'c';
		int indice = nombre.indexOf(letraBuscada);
		
		System.out.println("Indice de la letra '" + letraBuscada + "' es: " + indice);
		
		Object cc = new CuentaCorriente(22, 33);
        Object cp = new CuentaCorriente(33, 22);

        System.out.println(cc);
        System.out.println(cp);
		
	}
}
