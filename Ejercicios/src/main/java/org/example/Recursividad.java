package org.example;

public class Recursividad {

    static int max;

    public static void main (String[] args){

        int num = 123456;
        numeros_invertidos(num);

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

    public static int digitos(int numero){

        if(numero<10){
            return 1;
        }

        return 1 + digitos(numero/10);

    }

    public static int potencias(int base, int exponente){

        if (exponente==0){
            return 1;
        }

        return base*potencias(base,--exponente);
    }

    public static void numeros_invertidos(int numero){

        if(numero>=0 && numero<10){
            System.out.println(numero);
        }else{
            System.out.print(numero%10);
            numeros_invertidos(numero/10);
        }

    }



}
