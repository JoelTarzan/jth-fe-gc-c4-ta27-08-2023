import javax.swing.JOptionPane;

public class Ejercicio04App {

	public static void main(String[] args) {

		// Creamos la calculadora
		Calculadora calculadora = new Calculadora();

		double num1;
		double num2;

		try {
			String operador = JOptionPane.showInputDialog("Porfavor, introduce un operador.\nSuma +\nResta -\nMultiplicación *\nPotencia ^\nRaíz cuadrada r2\nRaíz cúbica r3\nDivisión /");
			calculadora.setOperador(operador);

			// Dependiendo el operador, hará un calculo u otro
			switch (operador) {
				case "+":
					num1 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el primer número."));
					num2 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el segundo número."));
	
					calculoDosDigitos(calculadora, num1, num2);
					break;
	
				case "-":
					num1 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el primer número."));
					num2 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el segundo número."));
	
					calculoDosDigitos(calculadora, num1, num2);
					break;
	
				case "*":
					num1 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el primer número."));
					num2 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el segundo número."));
	
					calculoDosDigitos(calculadora, num1, num2);
					break;
	
				case "/":
					num1 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el primer número."));
					num2 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el segundo número."));
	
					calculoDosDigitos(calculadora, num1, num2);
					break;
	
				case "^":
					num1 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el primer número."));
					num2 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el segundo número."));
	
					calculoDosDigitos(calculadora, num1, num2);
					break;
	
				case "r2":
					num1 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el primer número."));
	
					calculoUnDigito(calculadora, num1);
					break;
	
				case "r3":
					num1 = Double.parseDouble(JOptionPane.showInputDialog("Porfavor, introduce el primer número."));
	
					calculoUnDigito(calculadora, num1);
					break;
					
				default:
					calculadora.calcular();
					break;
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void calculoDosDigitos(Calculadora calculadora, double num1, double num2) {
		calculadora.setNum1(num1);
		calculadora.setNum2(num2);

		JOptionPane.showMessageDialog(null, "Resultado: " + calculadora.calcular());
	}

	public static void calculoUnDigito(Calculadora calculadora, double num1) {
		calculadora.setNum1(num1);

		JOptionPane.showMessageDialog(null, "Resultado: " + calculadora.calcular());
	}

}