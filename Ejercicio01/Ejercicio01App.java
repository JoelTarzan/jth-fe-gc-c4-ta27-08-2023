import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Generamos el numero random
		NumeroRandom numeroRandom = new NumeroRandom();

		// Mientras no se adivine, seguimos preguntando
		while (!numeroRandom.isAdivinado()) {

			// Dependiendo del input del usuario le indicaremos si el numero es mayor, menor o ha acertado
			try {
				System.out.println("Introduce un n�mero del 1 al 500.");
				int intentoUsuario = sc.nextInt();

				if (numeroRandom.getNum() > intentoUsuario) {
					System.out.println("El n�mero a adivinar es MAYOR, sigue intent�ndolo.");

				} else if (numeroRandom.getNum() < intentoUsuario) {
					System.out.println("El n�mero a adivinar es MENOR, sigue intent�ndolo.");

				} else {
					numeroRandom.setAdivinado(true);
				}

				// Si no introduce un valor correcto se lo indicamos y limpiamos el buffer del scanner
			} catch (InputMismatchException e) {
				System.out.println("El n�mero indicado no es correcto.");
				sc.next();

				// Pase lo que pase, se suma un intento
			} finally {
				numeroRandom.sumarIntento();
			}
		}

		// Mostramos que ha ganado y el numero de intentos
		System.out.println("ENHORABUENA! - Has adivinado el n�mero en " + numeroRandom.getIntentos() + " intentos.");

		sc.close();
	}
}