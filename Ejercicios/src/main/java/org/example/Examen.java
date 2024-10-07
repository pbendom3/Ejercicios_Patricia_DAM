package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {

    public void ejercicio1(){

        Scanner teclado = new Scanner(System.in);

        int num = 0;
        boolean err = true;

        while (err==true){

            try{
                System.out.println("Introduce un número...");
                num = teclado.nextInt();
                err=false;
            }catch (InputMismatchException e){
                System.out.println("Introduce un valor válido (numérico)...");
                teclado.nextLine();
            }

        }

        if (num<0){
            num = - num;
        }

        System.out.println("El valor absoluto es " + num);

    }

    public void ejercicio2(){

        Scanner teclado = new Scanner(System.in);

        int ancho_pared=0;
        int largo_pared=0;
        int ancho_azulejo=0;
        int largo_azulejo=0;


        boolean err = true;

        while (err==true){

            try{
                System.out.println("Introduce el ancho de la pared...");
                ancho_pared = teclado.nextInt();
                System.out.println("Introduce el largo de la pared...");
                largo_pared = teclado.nextInt();
                System.out.println("Introduce el ancho del azulejo...");
                ancho_azulejo = teclado.nextInt();
                System.out.println("Introduce el largo del azulejo...");
                largo_azulejo = teclado.nextInt();

                if (ancho_pared<= 0 || largo_pared <= 0 || ancho_azulejo<=0 || largo_azulejo<= 0){
                    System.out.println("ERROR. Vuelve a introducir las medidas");
                }else{
                    err = false;
                }

            }catch (InputMismatchException e){
                System.out.println("Introduce un valor válido (numérico)...");
                teclado.nextLine();
            }

        }

        int area_pared = ancho_pared * largo_pared;
        int area_azulejo = ancho_azulejo * largo_azulejo;
        float num_azulejos = 0;

        if (ancho_azulejo==largo_azulejo){
            System.out.println("Los azulejos no pueden ser cuadrados.");
        }else{
            if (area_azulejo>area_pared){
                System.out.println("Los azulejos no pueden ser más grandes que la pared.");
            }else{
                num_azulejos = area_pared/area_azulejo;
                System.out.println("Te hacen falta " + num_azulejos + " azulejos");
            }
        }


    }

}
