package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Spiderman {

    static Scanner teclado;

    public static void casoDePrueba() {

        String datos = teclado.nextLine();
        String datos_entrada[] = datos.split(" ");
        System.out.println(Arrays.toString(datos_entrada));

    } // casoDePrueba

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main


}
