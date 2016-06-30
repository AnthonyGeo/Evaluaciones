package pregunta_1_e2;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
	 figura fig = new figura(); 
	 do{
	 fig.setRango(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su tamaño: ")));
	 }while(fig.getRango()>27 || fig.getRango()==0);
	 fig.dibujar(fig.getRango());

	}

}
