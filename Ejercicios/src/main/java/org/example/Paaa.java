package org.example;

import java.util.Scanner;

public class Paaa {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce un número para contar sus dígitos: ");
        int num = teclado.nextInt();
        mostrarDigitos(num);
    }

    static void mostrarDigitos(int n)
    {
        int digitos = digitos(n);
        System.out.println("El número " + n + " tiene " + digitos + " dígito" + (digitos > 1 ? "s." : ".")); //escribiremos "dígito" o "dígitos"
        //dependiendo de la cantidad
    }

    static int digitos(int n)
    {
        if(n < 10){
            return 1;
        }

        return 1 + digitos(n/10);

    }

}