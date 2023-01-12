package proyecto_bytebank;

public class TestTransferencia {

	public static void main(String[] args) {
		Cliente maria = new Cliente("Maria", "14874229", "3794717300");

		Cuenta cuentaDeMaria = new Cuenta(0, 1, 1, maria);
		
		System.out.println(cuentaDeMaria.getTitular().getDocumento());
		System.out.println(cuentaDeMaria.getTitular() );
		
		Cuenta cuentaDeLeonardo = new Cuenta();
		cuentaDeLeonardo.asignarTitular(new Cliente());
		cuentaDeLeonardo.getTitular().asignarNombre("Leonardo");
		
		System.out.println(cuentaDeLeonardo.getTitular().getNombre());
	}

}
