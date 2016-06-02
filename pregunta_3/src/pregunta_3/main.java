package pregunta_3;
import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {

		int op1; 
		 
		op1 = JOptionPane.showConfirmDialog(null, "¿Es su cumpleaños?", "Pregunta 1",JOptionPane.YES_NO_OPTION);
		velocidad op = new velocidad(op1 );
		op.pregunta();

	}

}
