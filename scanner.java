import java.util.Scanner;
public class scanner {
   public static void main(String args[]){
	   
	   float num,num2,resultado;
       float resultado2;
	   
	   Scanner input=new Scanner(System.in);
       
	  // System.out.println("ingrese un numero");
	   //num=input.nextInt();
	   //resultado=num*2;
	   //System.out.println("El doble del numero ingresado es:"+resultado);
	   
	   
	   

	   
	   
	   System.out.println("Ingrese un numero");
	   num=input.nextInt();
	   System.out.println("Ingrese otro numero"); 
	   num2=input.nextInt();
	   resultado=(float)num/num2;
	   System.out.println("La division entera entre"+num+"y"+num2+"es"+num/num2);
	   System.out.println("El resto de la division entre"+num+"y"+num2+"es"+num%num2);
	   System.out.println("La division real entre"+num+"y"+num2+"es"+resultado);
	   System.out.println("La multiplicación entre"+num+"y"+num2+"es"+num*num2);

	   
       

   }
   
}
