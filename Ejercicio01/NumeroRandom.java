public class NumeroRandom {

	// Atributos
	private int num;
	private int intentos;
	private boolean adivinado;

	// Constructores
	public NumeroRandom() {
		this.num = generarNumero();
		this.intentos = 0;
		this.adivinado = false;
	}

	// Métodos
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getIntentos() {
		return intentos;
	}

	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}

	public boolean isAdivinado() {
		return adivinado;
	}

	public void setAdivinado(boolean adivinado) {
		this.adivinado = adivinado;
	}
	
	public void sumarIntento() {
		this.intentos++;
	}

	public int generarNumero() {
		return (int) (Math.floor(Math.random() * 500) + 1);
	}
}