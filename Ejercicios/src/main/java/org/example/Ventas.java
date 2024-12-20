package org.example;

import java.util.Scanner;

/**
 * @author Patricia
 * @version 1.0 (10/12/2024)
 *
 */
public class Ventas {

    static Scanner teclado ;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

    public static boolean casoDePrueba() {
        float dato = teclado.nextFloat(); //leer caso de prueba
        if (dato==-1) {
            return false;
        }else {
            float semana[] = rellenarDatos(dato);
            System.out.println("---");
            return true;
        }
    } // casoDePrueba

    /**
     * Metodo para rellenar un vector que contega los datos introducidos
     * @param dato se recibe un número para poder completar la entrada de datos
     * @return datos[] devolvemos un array con los datos de entrada
     */
    public static float[] rellenarDatos(float dato){

        float datos[] = new float[6];

        datos[0] = dato;

        for (int i = 1; i < datos.length; i++) {
            datos[i] = teclado.nextFloat();
        }

        return datos;
    }


}
