import java.util.Scanner;

public class Actividad6App {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		
		final double IVA = 0.21;
		
		System.out.println("Precio del producto: ");
		double precio = sc.nextDouble();
		sc.close();
		
		System.out.println("Precio + IVA = " + (precio+precio*IVA));
	}
}
