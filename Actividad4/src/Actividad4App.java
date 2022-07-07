import javax.swing.JOptionPane;

public class Actividad4App {
	public static void main (String args[]) {
		
		final double PI = Math.PI;
		
		String radio = JOptionPane.showInputDialog("Introduce el radio de la circumferencia");
		double r = Double.parseDouble(radio);
		
		double area;
		area = PI * Math.pow(r, 2);
		
		JOptionPane.showMessageDialog(null, "El area del circulo és " + area + " m2");
		
	}
}
