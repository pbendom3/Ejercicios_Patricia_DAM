package org.example;

public class Recursividad {

    static int maximo = 10;
    public static void main (String[] args){

        int sec = 1;
        imprimirNumeros(sec);

    }

    public static void imprimirNumeros(int sec){
        System.out.println(sec);
        if (maximo > sec) {
            imprimirNumeros(sec+1);
        }




    }
}
