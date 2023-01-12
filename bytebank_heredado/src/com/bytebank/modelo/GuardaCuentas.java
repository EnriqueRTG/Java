package com.bytebank.modelo;

public class GuardaCuentas {

	//crear un objeto para guardar muchas cuentas
	//permitir agregar cuentas con un metodo
	//remover cuentas
	//obtener cuentas
	
	Cuenta[] cuentas = new Cuenta[10];
	
	int indice = 0;

	public void adicionar(Cuenta cc) {
		cuentas[indice] = cc;
		indice ++;
	}

	public Cuenta obtner(int indice) {
		return cuentas[indice];
	} 
}
