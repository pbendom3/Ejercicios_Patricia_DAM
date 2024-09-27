package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad_inicial {

    public void ejecutar() {

        System.out.println("¿Cómo te llamas?");

        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();

        System.out.println("¿A qué curso vas?");
        String curso = entrada.next();

        System.out.println("Hola " + nombre + ", bienvenido a " + curso + ".");

        int num1 = 0;
        int num2 = 0;

        while(num1==0 || num2==0){

            try {
                System.out.println("Introduce un número:");
                num1 = entrada.nextInt();
                System.out.println("Introduce otro número:");
                num2 = entrada.nextInt();
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Introduce un número válido.");
                entrada.nextLine();
            }

            if (num1==0 || num2==0) {
                System.out.println("ERROR. Un sumando no puede ser 0.");
            }
        }

        int resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);


    }

}
