import java.util.Scanner;
public class edades {
	public static void main(String args[]){
		
		float año;
		
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Ingrese su año de nacimiento");
		año=sc1.nextInt();
		
		
		if (año<=1918)
			System.out.println("Esta persona fallecio.");
		
		
		else if(año>=2018)
			System.out.println("Esta persona aún no nacio");
		
		else if(año<2000) {
			System.out.println("Esta persona es mayor de edad");
		    System.out.println("Esta persona aún esta viva");
		    
		}
			
	    else if(año>=2000){
	    	System.out.println("Esta persona es menor de edad");
		    System.out.println("Esta persona aún esta viva");

	    }
		
		
		
	}

}
