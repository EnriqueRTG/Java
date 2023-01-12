package proyecto_bytebank;

public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta cuentaDeEnrique = new Cuenta();

		cuentaDeEnrique.depositar(200);

		System.out.println(cuentaDeEnrique.getSaldo());

		cuentaDeEnrique.retirar(100);

		System.out.println(cuentaDeEnrique.getSaldo());

		Cuenta cuentaDeTamara = new Cuenta();
		cuentaDeTamara.depositar(1000);

		if (cuentaDeTamara.transferir(500, cuentaDeEnrique)) {
			System.out.println("Transferencia exitosa!!!");
		} else {
			System.out.println("No es posible realizar la transferencia");
		}

		System.out.println(cuentaDeTamara.getSaldo());
		System.out.println(cuentaDeEnrique.getSaldo());
		
		System.out.println("Total de cuentas: "+ Cuenta.mostrarTotalCuentas() );
	}
}
