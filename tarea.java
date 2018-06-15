import java.util.Scanner;
public class tarea {
	public static void main(String[]args){
		int n, N, cociente, resto;
		Scanner input=new Scanner(System.in);
		System.out.println("Por favor ingrese un numero: ");
		n=input.nextInt();
		System.out.println("Por favor ingrese otro numero: ");
		N=input.nextInt();
		if(N==0)
			System.out.println("El numero no puede ser 0 porfavor ingrese otro numero");
		else{
			cociente=n/N;
			System.out.println("El cociente es "+n/N);
			
		resto=n%N;
		System.out.println("El resto es "+resto);
		}
		
		
		}
}
