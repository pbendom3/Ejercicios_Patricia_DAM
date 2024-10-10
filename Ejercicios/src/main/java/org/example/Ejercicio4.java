package org.example;

import java.util.Scanner;

public class Ejercicio4 {
    public void caracteres() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el texto");
        String texto = entrada.nextLine();
        System.out.println("Introduce la palabra que quieras contar");
        String subcadena = entrada.nextLine();


        subcadena = " " + subcadena + " ";

        texto = " " + texto + " ";

        texto = texto.replaceAll("[^\\p{Alpha}]+"," ");
        System.out.println(texto);

        String texto_nuevo = texto.replace(subcadena,"");

        texto_nuevo=texto_nuevo.replace(" ","");
        subcadena = subcadena.replace(" ","");


        int veces = texto.length() - texto_nuevo.length();
        int aparece = veces / subcadena.length();

        System.out.println("La subcadena " + subcadena + " aparece " + aparece + " veces.");

    }


}
