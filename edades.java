package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here



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
            System.out.println("Esta persona aún esta viva, y cumplira:"+((2018-año)+1));

        }

        else if(año>=2000){
            System.out.println("Esta persona es menor de edad");
            System.out.println("Esta persona aún esta viva");

        }



    }
}
