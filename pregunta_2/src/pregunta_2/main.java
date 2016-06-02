package pregunta_2;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		figura fig = new figura(); 
		fig.set_cadena(JOptionPane.showInputDialog("Ingrese la cadena:"));
		fig.dibujar(fig.get_cadena());

	}

}
