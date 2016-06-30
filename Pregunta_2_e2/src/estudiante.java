import java.util.Scanner; 
import javax.swing.JOptionPane;

public class estudiante {
	private  String matricula; 
	private String nombres; 
	private String genero; 
	private float nota_parcial;
	private float exa;
	private float aux; 
	private float prom; 
	Scanner sc=new Scanner(System.in);
	public estudiante(String nombres,String matricula,String genero,float nota_parcial,float exa){
		this.nombres=nombres;
		this.matricula=matricula;
		this.genero=genero;
		this.nota_parcial=nota_parcial;
		this.exa=exa; 
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String materia) {
		this.genero = materia;
	}
	public float getNotaParcial() {
		return nota_parcial;
		
	}
	public void setNotaParcial(float nota) {
		this.nota_parcial = nota;
	}
	public float getExa() {
		return exa;
	}
	public void setExa(float exa) {
		this.exa = exa;
	} 
	
	public void mostrar(){
		System.out.println("Nombre: "+this.nombres+" | Matricula: "+this.matricula+" | Genero: "+this.genero+" | Nota parcial: "+this.nota_parcial+" | Nota examen: "+this.exa); 
		
	}
	
	public void aprobados(){
		if (this.nota_parcial>=22 &&this.exa>=8)
	    System.out.println("Nombre: "+this.nombres+" | Matricula: "+this.matricula+" | Materia: "+this.genero+" | Nota parcial: "+this.nota_parcial+" | Nota examen: "+this.exa); 
		if(this.nota_parcial>=10 && this.nota_parcial<=22){
			float aux2=0;
			aux2=30-this.nota_parcial;
			if(this.exa==aux2)
				System.out.println("Nombre: "+this.nombres+" | Matricula: "+this.matricula+" | Materia: "+this.genero+" | Nota parcial: "+this.nota_parcial+" | Nota examen: "+this.exa); 	
			
		}
	}
	public void buscar(String mat){ 
		if ( mat.equals(this.matricula) || mat.equals(this.nombres))
		mostrar(); 
	  }
	
	public void buscar2(String mat, float mod_np){ 
		this.nota_parcial=mod_np;
		if ( mat.equals(this.matricula) || mat.equals(this.nombres))
			System.out.println("Nombre: "+this.nombres+" | Matricula: "+this.matricula+" | Materia: "+this.genero+" | Nota parcial: "+this.nota_parcial+" | Nota examen: "+this.exa); 	

	  }
	public void buscar3(String mat, float mod_np){ 
		this.exa=mod_np;
		if ( mat.equals(this.matricula) || mat.equals(this.nombres))
			System.out.println("Nombre: "+this.nombres+" | Matricula: "+this.matricula+" | Materia: "+this.genero+" | Nota parcial: "+this.nota_parcial+" | Nota examen: "+this.exa); 	

	  }
	public float promedio (){
	aux=this.nota_parcial+exa;	
	prom=prom+aux;
	return prom; 
		
	}

	
}
