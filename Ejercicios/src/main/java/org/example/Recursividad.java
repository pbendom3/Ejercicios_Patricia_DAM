package org.example;

public class Recursividad {

    static int max;

    public static void main (String[] args){

        int temp = 0;
        int num = sumar(temp);
        System.out.println(num);
    }

    public static void imprimirNumeros(int sec){
        System.out.println(sec);
//        if (maximo > sec) {
//            imprimirNumeros(sec+1);
//        }
    }

    public static int sumar(int numero){

        if(max < 10){
            max++;
            numero += sumar(max);
        }
        return numero;
    }



}
