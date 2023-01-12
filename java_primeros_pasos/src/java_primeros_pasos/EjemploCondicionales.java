package java_primeros_pasos;

public class EjemploCondicionales {

	public static void main(String[] args) {
		System.out.println("Hello world");

		int edad = 16;
		int cantidad = 2;

		if (edad >= 18) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido");
		} else {
			if (cantidad >= 2) {
				System.out.println("Usted es menor de edad pero " + "esta permitido su ingreso");
			} else {
				System.out.println("Usted no esta permitido a entrar");
			}
		}
	}

}
