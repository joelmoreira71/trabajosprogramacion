import java.util.Scanner;
public class menus {
    public static void main (String[]args){
        Scanner ingresos= new Scanner(System.in);
        int opción;
        int num1,num2,num3;
        int resultado;
        do{
            System.out.println("\n\t Eliga una opción");
            System.out.println("\t1 - Cual es el número mayor");
            System.out.println("\t2 - Realizar suma de todos los números");
            System.out.println("\t3 - Mostrar todos los números enteros entre 2 números");
            System.out.println("\t4 - Salir");


            opción=ingresos.nextInt();

            switch (opción){

                case 1:
                    System.out.println("Ingrese un número");
                    num1=ingresos.nextInt();
                    System.out.println("Ingrese otro número");
                    num2=ingresos.nextInt();
                    System.out.println("Ingrese un último número");
                    num3=ingresos.nextInt();

                    if(num1>num2 && num1 > num3)
                        System.out.println(+num1+" es mayor que " +num2 +" y que " +num3);
                    else if(num2>num1 && num2>num3)
                        System.out.println(+num2+" es mayor que " +num1 +" y que " +num3);
                    else
                        System.out.println(+num3+" es mayor que " +num1 +" y que " +num2);
                    break;

                case 2:
                    System.out.println("Ingrese un número");
                    num1=ingresos.nextInt();
                    System.out.println("Ingrese otro número");
                    num2=ingresos.nextInt();
                    System.out.println("Ingrese un último número");
                    num3=ingresos.nextInt();
                    resultado = num1+num2+num3;

                    System.out.println("La suma de todos los números es "+resultado);
                    break;

                case 3:
                    System.out.println("Ingrese un número");
                    num1=ingresos.nextInt();
                    System.out.println("Ingrese otro número");
                    num2=ingresos.nextInt();
                    for(int i = num1 + 1; i < num2; i++)
                        System.out.println("Los números enteros entre "+num1 +" y "+num2 +" son " +i);
                    break;
            }
        }while(opción!=4);
        ingresos.close();

    }


}
