package pregunta_1_e2;

public class figura implements inter {
	private int rango;
    private char a = 'A'; 
    
    
	public int getRango() {
		return rango;
	}

	public void setRango(int rango) {
		this.rango = rango;
	}
	public void dibujar (int rango){
		int f = 1;
	    while (f <= rango) {
	    	 int c = rango;
		        while (c >= 1) {
		            if (f < c)
	                System.out.print(" ");
	            else
	                System.out.print(a++);
	            c--;
	        }
	        a='A';
	        System.out.println();
	        f++;
	    }
	}
	 
}
