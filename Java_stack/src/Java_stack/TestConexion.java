package Java_stack;

public class TestConexion {

	public static void main(String[] args) throws Exception {

		try (Conexion con = new Conexion()) {
			con.leerDatos();
		} catch (IllegalStateException e) {
			System.out.println("Ejecutando catch");
			e.printStackTrace();
		}

		/*
		 * Conexion con = new Conexion(); try { con.leerDatos(); } catch
		 * (IllegalStateException e) { System.out.println("Recibiendo exception");
		 * e.printStackTrace(); } finally { con.cerrar(); }
		 */

	}

}
