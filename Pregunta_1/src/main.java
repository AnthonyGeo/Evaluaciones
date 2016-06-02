import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiplicar mul =  new multiplicar();
		mul.set_limite(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el limite:")));
		mul.tabla(mul.get_limite());
	}

}
