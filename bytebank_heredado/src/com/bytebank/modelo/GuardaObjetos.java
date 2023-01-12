package com.bytebank.modelo;

public class GuardaObjetos {

	Object[] coleccion = new Object[5];
	
	int indice = 0;

	public void adicionar(Object objeto) {
		coleccion[indice] = objeto;
		indice ++;
	}

	public int tamanio() {
		return coleccion.length;
	}

	public Object obtener(int i) {
		return coleccion[i];
	}

}
