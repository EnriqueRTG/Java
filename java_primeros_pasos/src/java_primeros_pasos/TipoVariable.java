package java_primeros_pasos;

public class TipoVariable {
	
	public static void main (String[] args) {
		//String
		System.out.println("Hola mundo!!!");
		
		//Entero
		int edad = 28;
		System.out.println(edad);
		
		edad = 47;
		System.out.println(edad);
		
		//String y Entero concatenados
		edad = 46 + 88;
		System.out.println("Mi edad es " + edad);
		
		//Double
		double salario = 1250.50;
		System.out.println("El Salario es " + salario);
		
		//String y Double concatenados
		double aguinaldo = salario / 2;
		System.out.println("El Aguinaldo de " + salario + " es de " + aguinaldo);
		
		//Conversion de tipo de varibale: Double -> Int'
		double variable1 = 230.89;
		int variableEntero = (int) variable1; //Cast
		System.out.println(variableEntero);
		
		//Otros tipos de variables numericas
		long numeroLargo = 1222222222222222222L;
		short numeroPequenio = 12222;
		byte numeroAunMasPequenio = 122;
		float numeroDecimalPequenio = 222222222222222222222222222222222222222.55555555555555555555555555F;
		
		int resultado = (int) variable1 + variableEntero;
		System.out.println(resultado);
		
	}
}
