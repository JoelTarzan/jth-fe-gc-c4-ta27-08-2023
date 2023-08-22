import java.util.Scanner;

public class Ejercicio05App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Preguntamos la cantidad de passwords y creamos el array
		System.out.println("Indica la cantidad de contraseñas a generar.");
		int cantidadPasswords = sc.nextInt();
		
		Password passwords[] = new Password[cantidadPasswords];
		
		// Preguntamos la longitud de las passwords y las creamos
		System.out.println("Indica la longitud de las contraseñas a generar.");
		int longitudPasswords = sc.nextInt();
		
		for (int i = 0; i < passwords.length; i++) {
			passwords[i]= new Password(longitudPasswords);
		}
		
		// Creamos un segundo array para guardar si son fuertes o no
		// Si fuera un ejercicio libre usaria una hashtable ya que me parece mejor opcion
		boolean sonPasswordsFuertes[] = new boolean[cantidadPasswords];
		
		for (int i = 0; i < passwords.length; i++) {
			sonPasswordsFuertes[i] = passwords[i].esFuerte();
		}
		
		// Mostramos las contraseñas y si son fuertes o no
		for (int i = 0; i < passwords.length; i++) {
			System.out.println(passwords[i].getPassword() + " - " + sonPasswordsFuertes[i]);
		}
	}
}