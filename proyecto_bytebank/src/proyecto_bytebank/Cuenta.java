package proyecto_bytebank;

public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalCuentas = 0;

	public Cuenta() {
		totalCuentas++;
	}

	public Cuenta(double saldo, int agencia, int numero, Cliente titular) {
		this.setSaldo(saldo);
		this.setAgencia(agencia);
		this.setNumero(numero);
		this.setTitular(titular);
		totalCuentas++;
	}

	private void setSaldo(double saldo) {
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
		if (titular == null) {
			this.titular = titular;
		}
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public boolean retirar(double valor) {
		if (valor > getSaldo()) {
			System.out.println("El monto a retirar excede el disponible en cuenta");
			return false;
		}
		setSaldo(getSaldo() - valor);
		return true;

	}

	public boolean transferir(double valor, Cuenta cuenta) {
		if (valor > getSaldo()) {
			System.out.println("El monto a transferir excede el disponible en cuenta");
			return false;
		}
		setSaldo(getSaldo() - valor);
		cuenta.depositar(valor);
		return true;

	}

	public void asignarTitular(Cliente titular) {
		this.setTitular(titular);
	}
	
	public static int mostrarTotalCuentas() {
		return totalCuentas;
	}
}