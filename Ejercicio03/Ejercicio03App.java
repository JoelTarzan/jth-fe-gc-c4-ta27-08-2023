import java.util.Random;

public class Ejercicio03App {

	public static void main(String[] args) {

		// Generamos un número aleatorio con la clase Random()
		System.out.println("Generando número aleatorio...");

		try {
			Random random = new Random();
			int numero = random.nextInt(1000);

			System.out.println("El numero aleatorio generado es: " + numero);

			// Dependiendo si es par o impar, lanzamos una Exception u otra
			if (numero % 2 == 0) {
				throw new ParException();

			} else {
				throw new ImparException();
			}

			// Mostramos el mensaje de la Exception
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}