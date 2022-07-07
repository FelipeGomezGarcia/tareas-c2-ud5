import javax.swing.JOptionPane;

public class Actividad3App {
	public static void main (String args[]) {
		
		String name = JOptionPane.showInputDialog(null, "Introduce tu nombre");
		
		JOptionPane.showMessageDialog(null, "Bienvenido " + name);
	}
}
