import javax.swing.JOptionPane;

public class Actividad11App {
	public static void main (String args[]) {
		
		String dia = JOptionPane.showInputDialog("Introduce un dia de la semana").toUpperCase();
		boolean laboral = true;
		
		switch (dia) {
		case "LUNES":
			JOptionPane.showMessageDialog(null, "Es dia laboral");
			break;
		case "MARTES":
			JOptionPane.showMessageDialog(null, "Es dia laboral");
			break;
		case "MIERCOLES":
			JOptionPane.showMessageDialog(null, "Es dia laboral");
			break;
		case "JUEVES":
			JOptionPane.showMessageDialog(null, "Es dia laboral");
			break;
		case "VIERNES":
			JOptionPane.showMessageDialog(null, "Es dia laboral");
			break;
		case "SABADO":
			JOptionPane.showMessageDialog(null, "Es dia festivo");
			break;
		case "DOMINGO":
			JOptionPane.showMessageDialog(null, "Es dia festivo");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Ese dia no coincide con ninguno de la semana");
			break;
		}
		
	}
}
