package org.example;

import java.util.Scanner;

public class TablaMultiplicar {

    static Scanner teclado = new Scanner(System.in);


    public static void main (String[] args){

        int tabla = pedirTabla();
        boolean valida = validarTabla(tabla);

        if(valida){
            calcularTablas(tabla);
        }else{
            System.out.println("La tabla introducida no es válida [1-10].");
        }

        int cuadrado = calcularCuadrado(tabla);
        System.out.println("El cuadrado es " + cuadrado);

    }

    public static int calcularCuadrado(int tabla){

        return tabla*tabla;
    }

    public static int pedirTabla(){

        System.out.println("Introduce la tabla que quieras [1-10]: ");
        int tabla = teclado.nextInt();
        return tabla;

    }

    public static boolean validarTabla(int tabla){

        if(tabla < 1 || tabla > 10){
            return false;
        }

        return true;
    }

    public static void calcularTablas(int tabla){

        for (int i = 0; i <= 10; i++) {

            System.out.println(tabla + " x " + i + " = " + (tabla*i));

        }

    }


}
