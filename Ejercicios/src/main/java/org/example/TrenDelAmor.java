package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class TrenDelAmor {

    static Scanner teclado;

    public static boolean casoDePrueba() {
        if (!teclado.hasNext())
            return false;
        else {
            // CÓDIGO PRINCIPAL AQUÍ
            // (incluyendo la lectura del caso de prueba)
            String datos = teclado.nextLine();
            String datos_entrada[] = datos.split("");
            System.out.println(Arrays.toString(datos_entrada));
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

}
