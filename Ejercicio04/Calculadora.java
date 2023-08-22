public class Calculadora {

	// Atributos
	private double num1;
	private double num2;
	private String operador;

	// Constructor
	public Calculadora() {
		this.num1 = 0;
		this.num2 = 0;
		this.operador = "+";
	}

	public Calculadora(double num1, double num2, String operador) {
		this.num1 = num1;
		this.num2 = num2;
		this.operador = operador;
	}

	// Métodos
	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public double suma() {
		return this.num1 + this.num2;
	}

	public double resta() {
		return this.num1 - this.num2;
	}

	public double multiplicacion() {
		return this.num1 * this.num2;
	}

	public double division() throws ArithmeticException {
		if (this.num2 == 0) {
			throw new ArithmeticException("No se puede dividir por cero");
		}

		return this.num1 / this.num2;
	}

	public double potencia() {
		return Math.pow(this.num1, this.num2);
	}

	public double raizCuadrada() throws IllegalArgumentException {
		if (this.num1 < 0) {
			throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
		}

		return Math.sqrt(this.num1);
	}

	public double raizCubica() {
		return Math.cbrt(this.num1);
	}

	public double calcular() throws IllegalArgumentException {
		switch (this.operador) {
			case "+":
				return suma();
	
			case "-":
				return resta();
				
			case "*":
				return multiplicacion();
				
			case "/":
				return division();
				
			case "^":
				return potencia();
				
			case "r2":
				return raizCuadrada();
				
			case "r3":
				return raizCubica();
				
			default:
				throw new IllegalArgumentException("Operador inválido.");
		}
	}
}