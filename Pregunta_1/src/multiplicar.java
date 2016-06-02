
public class multiplicar {
	int limite; 
	public multiplicar(){
	}
	
	public int get_limite(){
		return this.limite; 
	}
    
	public void set_limite(int limite){
		this.limite=limite; 
	}
	
	public void tabla(int limite){
		for(int i=1;i<=limite;i++){
			if(i==1){
				System.out.print("*|  "+i+"  ");
			}
			else
		    System.out.print(i+"  ");	
		}
		System.out.println();
		for(int x=1;x<=limite;x++){
			System.out.print(x+"|  ");
		   for(int j=1;j<=limite;j++){
			   if(x*j<10){
			   System.out.print(x*j+"  ");}
			   else
				   System.out.print(x*j+" ");
			   if(j==limite){
				   System.out.println();
			   }
		   }
		}
			
		
		
	}
}
