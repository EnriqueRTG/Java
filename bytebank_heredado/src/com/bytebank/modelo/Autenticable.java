package com.bytebank.modelo;

public interface Autenticable {

	public String getClave();

	public void setClave(String clave);

	public boolean autenticar(String clave);
}
