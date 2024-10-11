package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Actividad_excepciones {

    public void excepciones(){

        System.out.println("***Bienvenido al clasificador de GENERACIONES***");
        System.out.println("Elige modo de ejecución: ");
        System.out.println("1. Año nacimiento");
        System.out.println("2. Edad");

        Scanner teclado = new Scanner(System.in);
        String modo = teclado.next();

        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();
        int anyo = 0;

        if (modo.equals("1")){
            System.out.println("Introduce tu año de nacimiento: ");
            String anyo_nacimiento = teclado.next();

            try{
                int anyo_nacimiento_num = Integer.parseInt(anyo_nacimiento);

                if(anyo_nacimiento_num<1900 || anyo_nacimiento_num > anyo_actual){
                    System.out.println("El año introducido no es válido (1900<=año<=" + anyo_actual + ").");
                }else{
                    anyo = anyo_nacimiento_num;
                }

            }catch (Exception e){
                System.out.println("No has introducido un formato de año válido.");
            }finally {
                teclado.nextLine();
            }


        } else if (modo.equals("2")) {

            System.out.println("Introduce tu edad: ");

            if (teclado.hasNextInt()){

                int edad = teclado.nextInt();

                if (edad<0){
                    System.out.println("La edad introducida no tiene sentido.");
                }else{
                    anyo = anyo_actual-edad;
                }

            }else{
                System.out.println("No has introducido una edad válida.");
            }

        }else{
            System.out.println("No se reconoce el modo.");
        }

        if (anyo!=0){

            if (anyo>=1900 && anyo<=1927){
                System.out.println("Eres de la generación sin bautizar.");
            } else if (anyo>=1928 && anyo<=1944) {
                System.out.println("Eres de la generación Silent.");
            } else if (anyo>=1945 && anyo<=1964) {
                System.out.println("Eres de la generación Baby Boomers.");
            } else if (anyo>=1965 && anyo<=1981) {
                System.out.println("Eres de la generación Generación X.");
            } else if (anyo>=1982 && anyo<=1994) {
                System.out.println("Eres de la generación Generación Y o Millennials.");
            } else if (anyo>=1995 && anyo<=anyo_actual) {
                System.out.println("Eres de la generación Generación Z o Centennials.");
            }

//            Sin Generación bautizada (nacidos entre 1900 y 1927).
//                    Generación Silent (nacidos entre 1928 y 1944).
//                    Baby Boomers (nacidos entre 1945 y 1964).
//                    Generación X (nacidos entre 1965 y 1981).
//                    Generación Y o Millennials (nacidos entre 1982 y 1994).
//                    Generación Z o Centennials (nacidos entre 1995 y 2009 en adelante).

        }


    }


}
