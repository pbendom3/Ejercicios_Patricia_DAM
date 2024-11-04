package org.example;

import java.util.Random;

public class Vectores {

    public void vectores(){

        int vector[] = new int[7];

        vector[3] = 27;

        vector[6] = vector[3]*2;

        vector[1] = vector[6] - vector[3];

        System.out.print(vector[3]);

        for (int i=0; i<vector.length;i++){
            System.out.print(" " + vector[i] + " ");
        }

        String palabras[] = new String[5];

        palabras[0] = "10";

        for(int i=0; i<palabras.length;i++){
            System.out.print(" " + palabras[i] + " ");
        }

    }

    public void ejercicio1(){

        int numeros[] = new int[8];

        Random aleatorios = new Random();

        //CACA
//        numeros[0] = aleatorios.nextInt();
//        numeros[1] = aleatorios.nextInt();

        int suma = 0;

        for(int i=0;i<numeros.length;i++){
            numeros[i] = aleatorios.nextInt(501);
            suma+=numeros[i];
        }

        System.out.println("El resultado es " +  suma);
        

    }






}
