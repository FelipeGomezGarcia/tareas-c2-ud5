import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculadoraInversa {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce dos numero:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println("Introduce uno de los siguientes signos (+, -, *, /, ^, %):");
		String signo = sc.next();
		sc.close();
		
		double resultado = 0;
		
		switch (signo) {
		case "+":
			resultado = n1 + n2;
			JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + resultado);
			break;
		case "-":
			resultado = n1 - n2;
			JOptionPane.showMessageDialog(null, n1 + " - " + n2 + " = " + resultado);
			break;
		case "*":
			resultado = n1 * n2;
			JOptionPane.showMessageDialog(null, n1 + " * " + n2 + " = " + resultado);
			break;
		case "/":
			resultado = n1 / n2;
			JOptionPane.showMessageDialog(null, n1 + " / " + n2 + " = " + resultado);
			break;
		case "^":
			resultado = Math.pow(n1, n2);
			JOptionPane.showMessageDialog(null, n1 + " ^ " + n2 + " = " + resultado);
			break;
		case "%":
			resultado = n1 % n2;
			JOptionPane.showMessageDialog(null, "El resto de la division es " + resultado);
			break;

		default:
			JOptionPane.showMessageDialog(null, "No existe ese operador");
			break;
		}
	}
}
