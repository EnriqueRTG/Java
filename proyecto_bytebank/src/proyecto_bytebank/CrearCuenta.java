package proyecto_bytebank;

public class CrearCuenta {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta();
		
		
		System.out.println(segundaCuenta.getSaldo());
		System.out.println(primeraCuenta.getAgencia());
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
		} else {
			System.out.println("Son diferentes objetos");
		}
	}
}
