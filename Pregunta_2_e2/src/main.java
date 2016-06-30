import java.util.Scanner; 
import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		estudiante[] estu = new estudiante [5]; 
		
		estu[0]=  new estudiante("Anthony Hernandez","9846","P.O.O",28,15); 
		estu[1]=  new estudiante("Aaron Marchan","9540","Ecuaciones",10,15);
		estu[2]=  new estudiante("Johanna Choez","9046","Diseño",20,9);
		estu[3]=  new estudiante("Genesis Burgos","9944","Estructura",10,20);
		estu[4]=  new estudiante("Piero Palacios","9816","Estadistica",28,11); 
		
		int op ; 
		do{
		op = Integer.parseInt(JOptionPane.showInputDialog("OP 1 : Lista de Estudiante"+"\n"+"OP 2 : Buscar"+"\n"+"OP 3 :Mostrar aprobados"+"\n"+"OP 4 : Modificar la nota total"+"\n"+"OP 5 : Modificar la nota del examen"+"\n"+"OP 6 : Ascendente"+"\n"+"OP 7 : Descendente"+"\n"+"OP 8: Promedio total de notas : Salir"+"\n"+"OP 9 : Salir"));
		switch (op){
		case 1:
			System.out.println("----------------------------------------------------------------------");
			 for(int i=0; i<5;i++)
				 estu[i].mostrar();
		break; 
		case 2:
			System.out.println("----------------------------------------------------------------------");
		    String mat=JOptionPane.showInputDialog("Estudiante a buscar: ");
			 for(int i=0; i<5;i++)
				 estu[i].buscar(mat);
		break;
		case 3:
			System.out.println("----------------------------------------------------------------------");
			 for(int i=0; i<5;i++)
				 estu[i].aprobados();
		break;
		case 4:
			String mat1=JOptionPane.showInputDialog("Estudiante a buscar: ");
			float nota=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota a modificar: ")); 
			for(int i=0; i<5;i++){
			  	 estu[i].buscar2(mat1,nota);
					
			}
		case 5:
			String mat2=JOptionPane.showInputDialog("Estudiante a buscar: ");
			float nota1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota a modificar: ")); 
			for(int i=0; i<5;i++){
			  	 estu[i].buscar3(mat2,nota1);
					
			}
		case 8:
			float aux3=0;
			for(int i=0; i<5;i++){
			  	 aux3=aux3+estu[i].promedio();
					
			}
			JOptionPane.showMessageDialog(null, Float.toString(aux3/5));
		break;
		
		case 9:
			System.out.println("----------------------------------------------------------------------");
			JOptionPane.showMessageDialog(null, "Saliendo....!");
		break;
		
		}
		}while(op!=9);

	}

}
