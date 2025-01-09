package org.example;

public class Triangulo {

    public static void main (String[] args){

        String asteriscos = "";
        for (int i = 0; i < 4; i++) {
            asteriscos+="* ";
            System.out.println(asteriscos);
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }


    }



}
