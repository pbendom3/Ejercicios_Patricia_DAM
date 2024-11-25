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

    public void ejercicio2(){

        Random aleatorio = new Random();

        int filas = aleatorio.nextInt(5)+1;
        int columnas = aleatorio.nextInt(5)+1;

        int matriz[][] = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j]=aleatorio.nextInt(10)+1;

            }
        }

        for(int[] fila : matriz){
            for(int columna : fila){
                System.out.print(columna + " ");
            }
            System.out.print("\n");
        }

        int suma = 0;

        System.out.println("Suma de filas");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                suma+=matriz[i][j];
            }
            System.out.println("Fila " + (i+1) + ":" +  suma);
            suma = 0;
        }

        System.out.println("Suma de columnas");
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                suma += matriz[j][i];

            }
            System.out.println("Columna " + (i+1) + ":" +  suma);
            suma = 0;
        }





    }

    public void ejercicio3(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuántos estudiantes tienes?");
        int estudiantes = teclado.nextInt();
        System.out.println("Cuántas asignaturas hay?");
        int asignaturas = teclado.nextInt();

        String matriz[][] = new String[estudiantes+1][asignaturas+1];

        matriz[0][0]="Estudiantes";

        for (int i = 1; i < matriz.length; i++) {
            System.out.println("Introduce el nombre del estudiante " + i);
            matriz[i][0]=teclado.next();
        }

        for (int i = 1; i < matriz[0].length; i++) {
            System.out.println("Introduce el nombre de la asignatura " + i);
            matriz[0][i] = teclado.next();
        }

        for (int i = 1; i < matriz.length ; i++) {
            for (int j = 1; j < matriz[0].length; j++) {

                System.out.println("Dame la nota de " + matriz[i][0] + " para la asignatura de " + matriz[0][j]);
                matriz[i][j] = Integer.toString(teclado.nextInt());
            }
        }

        for(String[] fila : matriz){
            for(String columna : fila){
                System.out.print(columna + " ");
            }
            System.out.print("\n");
        }

        float media_estudiante = 0;

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j++) {
                media_estudiante+=Integer.parseInt(matriz[i][j]);
            }
            System.out.println("La media del estudiante " + matriz[i][0] + " es " + (media_estudiante/asignaturas));
            media_estudiante = 0;
        }

        float media_asignatura = 0;

        for (int i = 1; i < matriz[0].length; i++) {
            for (int j = 1; j < matriz.length; j++) {

                media_asignatura+=Integer.parseInt(matriz[j][i]);

            }
            System.out.println("La media de la asignatura " + matriz[0][i] + " es " + (media_asignatura/estudiantes));
            media_asignatura = 0;
        }









    }

    public void prueba_vectores(){

        Scanner teclado = new Scanner(System.in);

        int vector[] = {3,4,5,3,2};

        int matriz[][] = new int[2][vector.length];

        for (int i = 0; i < vector.length; i++) {
            matriz[0][i] = vector[i];
        }

        for(int[] filas : matriz){
            for (int columnas :filas){
                System.out.print(columnas + " ");
            }
            System.out.print("\n");

        }

//        int matriz2[][] = new int[3][4];
//
//        for (int i = 0; i < matriz2.length; i++) {
//            System.out.println("Introduce valores de la fila: ");
//            String fila[] = teclado.next().split(",");
//            for (int j = 0; j < matriz2[i].length; j++) {
//                matriz2[i][j]=Integer.parseInt(fila[j]);
//            }
//        }
//
//        for(int[] filas : matriz2){
//            for (int columnas :filas){
//                System.out.print(columnas + " ");
//            }
//            System.out.print("\n");
//
//        }

        String matriz3[][] = new String[10][10];

        for (int i = 0; i < matriz3.length; i++) {
            System.out.println("Introduce valores de la fila: ");
            String fila[] = teclado.next().split("");
            for (int j = 0; j < matriz3[i].length; j++) {
                matriz3[i][j]=fila[j];
            }
        }

        for(String[] filas : matriz3){
            for (String columnas :filas){
                System.out.print(columnas + " ");
            }
            System.out.print("\n");

        }



    }


}
