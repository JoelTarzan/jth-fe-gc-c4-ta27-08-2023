public class Password {

	// Atributos
	private int longitud;
	private String password;

	// Constructores
	public Password() {
		this.longitud = 8;
		this.password = "";
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.password = generarPassword(longitud);
	}

	// Métodos
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPassword() {
		return password;
	}

	public String generarPassword(int longitud) {
		String caracteres = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789#!@.";
		StringBuilder password = new StringBuilder();

		for (int i = 0; i < longitud; i++) {
			int numAleatorio = (int) (Math.floor(Math.random() * caracteres.length()));
			password.append(caracteres.charAt(numAleatorio));
		}

		return password.toString();
	}
	
	public boolean esFuerte() {
		int contadorMayus = 0;
		int contadorMinus = 0;
		int contadorNums = 0;
		
		String password = getPassword();
		
		for (int i = 0; i < password.length(); i++) {
			
			if (Character.isDigit(password.charAt(i))) {
				contadorNums++;
				
			} else if (Character.isUpperCase(password.charAt(i))) {
				contadorMayus++;
				
			} else if (Character.isLowerCase(password.charAt(i))) {
				contadorMinus++;
			}
		}
		
		if (contadorNums > 5 && contadorMayus > 2 && contadorMinus > 1) {
			return true;
			
		} else {
			return false;
		}
	}
}