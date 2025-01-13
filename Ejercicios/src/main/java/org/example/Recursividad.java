package org.example;

import java.util.Arrays;

public class Recursividad {

    static int max;
    static char palabra_vector[];

    public static void main (String[] args){

        String palabra = "aaaAAA";
        palabra_vector = palabra.toLowerCase().toCharArray();
        System.out.println(Arrays.toString(palabra_vector));
        invertir_palabra(palabra_vector.length-1);

        if(palabraOrdenada(0)){
            System.out.println("La palabra está ordenada");
        }else{
            System.out.println("Palabra desordenada.");
        };

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

    public static void invertir_palabra(int contador){ //contador=posición

        if(contador==0){
            System.out.println(palabra_vector[contador]);
        }else{
            System.out.print(palabra_vector[contador]);
            invertir_palabra(contador-1); //--contador
        }

    }

    public static boolean palabraOrdenada(int posicion){

        if (posicion<palabra_vector.length-1){
            if(palabra_vector[posicion]<=palabra_vector[posicion+1]){
                return palabraOrdenada(++posicion);
            }else{
                return false;
            }
        }

        return true;
    }


}
