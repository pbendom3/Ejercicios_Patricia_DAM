package org.example;

import java.util.Random;
import java.util.Scanner;

public class CaraCruz {

    public static void caraCruz(){

        mostrarOpciones();
        String opcion_usuario = recogerOpcion();
        String opcion_sorteo = sorteo();
        comprobarResultado(opcion_usuario,opcion_sorteo);

    }

    public static void mostrarOpciones(){

        System.out.println("BIENVENIDO");
        System.out.println("Elige tu opción: ");
        System.out.println("   C - cara");
        System.out.println("   X - cruz");

    }

    public static String recogerOpcion(){

        Scanner teclado = new Scanner(System.in);
        String opcion = teclado.next();
        return opcion;

    }

    public static String sorteo(){

        Random aleatorio = new Random();
        String opciones[] = {"C","X"};

        String sorteo = opciones[aleatorio.nextInt(2)];

        return sorteo;
    }

    public static void comprobarResultado(String opcion,String sorteo){

        if(opcion.equals(sorteo)){
            System.out.println("Has ganado! Ha salido: " + sorteo);
        }else{
            System.out.println("Has perdido! Ha salido: "+ sorteo);
        }

    }



}
