package org.example;

public class Binarios {

    public static void main (String[] args){

        int num = 16;

        System.out.print("El número " + num );

        if(esBinario(num)){
            System.out.print(" es binario.");
        }else{
            System.out.print(" no es binario.");
            System.out.println("El número en binario es " + convertir2(num));
        }

    }

    public static boolean esBinario(int numero){

        if (numero > 9){
            if(numero%10==0 || numero%10==1){
                return esBinario(numero/10);
            }else{
                return false;
            }
        }

        return numero==0 || numero==1;

//        (numero==0 || numero==1){
//            return true;
//        }else{
//            return false;
//        }

    }


    public static String convertir(int numero){

        if (numero == 0 || numero ==1){
            return Integer.toString(numero);
        }else{
            return convertir(numero/2) + numero%2;
        }

    }

    public static int convertir2(int numero){

        if (numero == 0 || numero ==1){
            return numero;
        }else{
            return numero%2+10*convertir2(numero/2);
        }

    }



}
