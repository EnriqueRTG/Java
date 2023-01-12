package java_primeros_pasos;

public class EjemploCondicionales2 {
	public static void main(String[] args) {
		System.out.println("Hello world");

		int edad = 21;
		int cantidadPersonas = 3;
		
		boolean esPareja = cantidadPersonas > 1;
		
		boolean puedeEntrar = edad >= 18 && esPareja;

		if (puedeEntrar) {
			System.out.println("Usted puede ingresar");
		} else {
			System.out.println("Usted no esta permitido ingresar");
		}
		
		int edad1 = 68;
		
		boolean esAnciano = edad1 >= 65;
		
		System.out.println (esAnciano);
	}
}
