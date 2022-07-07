import javax.swing.JOptionPane;

public class Actividad3App {
	public static void main (String args[]) {
		
		String name = JOptionPane.showInputDialog(null, "Introduce tu nombre");
		
		System.out.println("Bienvenido " + name);
	}
}
