package org.example;

import java.util.Scanner;

public class Ejercicio5 {
    public void Ejercicio5(){
        Scanner entrada = new Scanner(System.in);
        int intentos=9;

        System.out.println("Jugador 1: Escribe una frase: ");
        String frase=entrada.nextLine();

        System.out.println("Jugador 2: Introduce una palabra: ");
        String palabra=entrada.next();

        while (intentos>0){
            if(frase.contains(palabra)){
                System.out.println("Enhorabuena has acertado la palabra.");
                intentos=0;
            } else  {
                System.out.println("Intento fallido te quedan "+intentos+" intentos");
                intentos -= 1;
                palabra = entrada.next();
            }
        }
        if (intentos==0){
            System.out.println("Se acabarón los intentos.");
        }
    }
}
