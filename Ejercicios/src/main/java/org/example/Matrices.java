package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrices {

    public void prueba(){

        int matriz[][] = new int[3][4];

        int matriz2[][] = {{12,32,44,1},{33,2,90,56}};

        System.out.println(matriz2[0][2]);

        System.out.println("Tamaño fila: " + matriz2.length);
        System.out.println("Tamaño columna: " + matriz2[0].length);

        for (int i = 0; i < matriz2.length; i++) {

            for (int j = 0; j < matriz2[i].length; j++) {

                System.out.print(matriz2[i][j] + " ");

            }

            System.out.print("\n");

        }

        for(int[] filas : matriz2){
            System.out.println(Arrays.toString(filas));
        }

        for(int[] filas : matriz2){
            for(int columnas : filas){
                System.out.print(columnas + " ");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {

                if(matriz2[i][j]==90){
                    System.out.println("Existe el 90.");

                }

            }
        }

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Dime el valor de la posición (" + i + "," + j + "):");
                matriz[i][j] = teclado.nextInt();
            }
        }


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] +  " ");
            }
            System.out.print("\n");
        }












    }

    public void prueba2(){

        int matriz[][] =  new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i==j){
                    matriz[i][j] = 1;
                }
            }
        }

        for (int[] filas:matriz){
            for(int columnas : filas){
                System.out.print(columnas + " ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if(matriz[i][j]==1){
                    System.out.print("X ");
                }else{
                    System.out.print("- ");
                }

            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[i].length-1; j >=0 ; j--) {

                if(matriz[i][j]==1){
                    System.out.print("X ");
                }else{
                    System.out.print("- ");
                }

            }
            System.out.print("\n");
        }





    }

    public void prueba3(){

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int a[][] = new int[4][4];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = aleatorio.nextInt(10);
            }
        }
        System.out.print("\n");
        for(int[] filas : a){
            for (int columnas : filas){
                System.out.print(columnas + " ");
            }
            System.out.print("\n");
        }

        System.out.println("Inserta el tamaño de la matriz B [n][m]: ");
        int n = teclado.nextInt();
        int q = teclado.nextInt();
        int b[][] = new int[n][q];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = aleatorio.nextInt(10);
            }
        }
        System.out.print("\n");
        for(int[] filas : b){
            for (int columnas : filas){
                System.out.print(columnas + " ");
            }
            System.out.print("\n");
        }

        if(a.length!=b.length || a[0].length!=b[0].length){
            System.out.println("Las matrices no son iguales");
            return;
        }

        int m[][] =  new int[n][q];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                if(a[i][j]>b[i][j]){
                    m[i][j]=a[i][j];
                } else if (a[i][j]<b[i][j]) {
                    m[i][j]=b[i][j];
                }else{
                    System.out.println(a[i][j] + " y " + b[i][j] +  " son iguales.");
                    m[i][j]=b[i][j];
                }
            }
        }
        System.out.print("\n");
        for(int[] filas : m){
            for (int columnas : filas){
                System.out.print(columnas + " ");
            }
            System.out.print("\n");
        }





    }


}
