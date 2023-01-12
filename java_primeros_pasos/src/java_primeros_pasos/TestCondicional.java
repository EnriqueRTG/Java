package java_primeros_pasos;

public class TestCondicional {

	public static void main(String[] args) {

		System.out.println("Probando condicionales");

		int edad = 15;
		int cantidadDePersonas = 3;

		if (edad >= 18) {
			System.out.println("Tienes mas de 18 anios");
			System.out.println("Bienvenido");
		} else {
			if (cantidadDePersonas >= 2) {
				System.out.println("No tienes 18 anios, pero puedes ingresar, porque estas acompaniado");
			} else {
				System.out.println("Lamentablemente no puedes ingresar");
			}
		}

	}
}
