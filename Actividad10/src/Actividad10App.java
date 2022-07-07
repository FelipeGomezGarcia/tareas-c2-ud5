import java.util.Scanner;

public class Actividad10App {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de ventas: ");
		int ventas = sc.nextInt();
		
		double suma = 0;
		System.out.println("Introduce el precio de cada venta: ");
		for (int i = 0; i < ventas; i++) {
			System.out.print(i+1 + " ");
			suma += sc.nextDouble();
		}
		sc.close();
		
		System.out.println("Suma total: " + suma);
	}
}
