package com.bytebank.modelo;

/*
 * 
 */

/**
 * Cuenta va a crear nuevas instancias de CuentaCorriente y CuentaAhorro
 * 
 * @version 1.0
 * @author EnriqueRTG
 *
 */

public abstract class Cuenta implements Comparable<Cuenta> {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	private static int totalCuentas = 0;

	public Cuenta(int agencia, int numero) {
		this.setAgencia(agencia);
		this.setNumero(numero);
		totalCuentas++;
	}

	public Cuenta(double saldo, int agencia, int numero, Cliente titular) {
		this.setSaldo(saldo);
		this.setAgencia(agencia);
		this.setNumero(numero);
		this.setTitular(titular);
		totalCuentas++;
	}

	protected void setSaldo(double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	private void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		}
	}

	public int getAgencia() {
		return this.agencia;
	}

	private void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		}
	}

	public int getNumero() {
		return this.numero;
	}

	private void setTitular(Cliente titular) {
		// if (titular == null) {
		this.titular = titular;
		// }
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public abstract void depositar(double valor);

	/**
	 * Este metodo retira dinero de la cuenta y si ocurre un error devuelve una
	 * excepcion
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void retirar(double valor) throws SaldoInsuficienteException {
		if (this.getSaldo() < valor) {
			throw new SaldoInsuficienteException("No tienes saldo suficiente");
		}
		this.setSaldo(this.getSaldo() - valor);

	}

	public boolean transferir(double valor, Cuenta cuenta) {
		if (valor > getSaldo()) {
			System.out.println("El monto a transferir excede el disponible en cuenta");
			return false;
		}
		try {
			this.retirar(valor);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		cuenta.depositar(valor);
		return true;

	}

	public void asignarTitular(Cliente titular) {
		this.setTitular(titular);
	}

	public static int mostrarTotalCuentas() {
		return totalCuentas;
	}

	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " + this.agencia;
	}

	public boolean esIgual(Cuenta cuenta) {
		return this.getAgencia() == cuenta.getAgencia() && this.getNumero() == cuenta.getNumero();
	}

	@Override
	public boolean equals(Object objeto) {
		Cuenta cuenta = (Cuenta) objeto;
		return this.getAgencia() == cuenta.getAgencia() && this.getNumero() == cuenta.getNumero();
	}

	@Override
	public int compareTo(Cuenta o) {
		// Orden natural: Numero Agencia
		// return Integer.compare(this.getAgencia(), o.getAgencia());
		// orden natural: Saldo
		return Double.compare(this.getSaldo(), o.getSaldo());
	}
}