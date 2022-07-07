import java.util.Scanner;

public class Actividad5App {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un numero");
		double n1 = sc.nextDouble();
		
		if (n1%2 == 0) {
			System.out.println("El numero es divisible entre 2");
		}else {
			System.out.println("El numero no es divisible entre 2");
		}
	}
}
