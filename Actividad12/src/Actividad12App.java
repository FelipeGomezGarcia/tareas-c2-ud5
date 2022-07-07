import javax.swing.JOptionPane;

public class Actividad12App {
	public static void main (String args[]) {
		String password = "ConejoVerde";
		
		int contador = 3;
		boolean acierta = false;
		
		
		do {
			String contraseña = JOptionPane.showInputDialog("Introduce la contraseña (" + contador + " intentos): ");
			if (contraseña.equals(password)) {
				acierta = true;
			}else {
				contador--;
			}
		} while (contador > 0 && !acierta);
		
		if (acierta) {
			JOptionPane.showMessageDialog(null, "Enhorabuena");
		}else {
			JOptionPane.showMessageDialog(null, "Te has quedado sin intentos");
		}
	}
}
