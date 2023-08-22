public class Ejercicio02App {

	public static void main(String[] args) {

		// Creamos un bloque try que muestra un mensaje y lanza la excepcion
		int num = 9;

		try {
			System.out.println("Mensaje mostrado por pantalla.");
			
			if (num == 9) {
				throw new CustomException();
			}

		} catch (CustomException e) {
			System.out.println("Excepcion capturada con mensaje: " + e.getMessage());
		}

		System.out.println("Programa terminado");
	}
}