package pregunta_3;
import javax.swing.JOptionPane;
public class velocidad {
int op1,aux; 
	
	public velocidad ( int op1){
		this.op1=op1;
	}
	
	public void  pregunta(){
      
       if(op1 == JOptionPane.YES_NO_CANCEL_OPTION){
    	   aux=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su velocidad:"));
    	   if(aux <=60)
			JOptionPane.showMessageDialog(null, "No hay multa");
    	   else if(aux >=61 && aux<=80)
   			JOptionPane.showMessageDialog(null, "Multa pequeña");
    	   else 
      			JOptionPane.showMessageDialog(null, "Multa grande");
		}
		else{
			aux=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su velocidad:"));
			   if(aux <=120)
				JOptionPane.showMessageDialog(null, "No hay multa");
			   else if(aux >=121 && aux<=160)
		   	 	JOptionPane.showMessageDialog(null, "Multa pequeña");
			   else 
		    	JOptionPane.showMessageDialog(null, "Multa grande");
			
		}
	}
}
