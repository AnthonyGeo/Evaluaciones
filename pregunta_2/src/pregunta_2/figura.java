package pregunta_2;

public class figura {
	String cadena;
	public figura(){
	}
	
	public String get_cadena(){
		return this.cadena; 
	}
    
	public void set_cadena(String cadena){
		this.cadena=cadena; 
	}
	
	public void dibujar(String cadena){
		 int aux=cadena.length()*2;
         int  aux2=1;
         int i=1;
         String c1,c2; 
		for(int x=cadena.length();x<cadena.length()*2;x++){
        for(int y=1;y<cadena.length()*2+1;y++){
           if(y==aux){
        	   if(i!=aux-1){
           c1=cadena.substring(i-1,i);    
           System.out.print(c1);
           i++;
        	   }else 
        		   System.out.print("");
        		   
           }
           else
        	   System.out.print(" ");
            if(y==aux2){
            	c2=cadena.substring(y-1,aux2);
            	System.out.print(c2);}
            else
            	System.out.print(" ");
                }
                aux2++;
              aux--; 
              System.out.println();
        } 
	}
}
