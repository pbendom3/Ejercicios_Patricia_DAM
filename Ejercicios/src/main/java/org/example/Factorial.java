package org.example;

import java.util.Scanner;

public class Factorial {

    static Scanner teclado = new Scanner(System.in);

    public static int factorial(int numero){

        int fact = 1;

        for (int i = numero; i >= 1 ; i--) {
            fact*=i;
        }

        return fact;
    }

    public static int factorial_recursivo(int numero){

        if (numero==0 || numero==1){
            return 1;
        }

        return numero*factorial_recursivo(numero-1);

    }

    public static void main (String[] args){

        System.out.println("Introduce un número...");
        int num = teclado.nextInt();
        int factorial = factorial_recursivo(num);
        System.out.println(factorial);

    }

}
