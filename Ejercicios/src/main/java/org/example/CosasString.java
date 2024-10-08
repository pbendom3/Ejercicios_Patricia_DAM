package org.example;

public class CosasString {

    public void caracteres(){

        String frase = "Víctor y chao. Roberto bye.";

        int tamanyo = frase.length();
        System.out.println("El tamaño de la frase es " + tamanyo);

        char letra = frase.charAt(14);
        System.out.println("La letra en la posición 14 es " + letra);

        String trozo = frase.substring(6,11);
        System.out.println("Un trozo de la frase es " + trozo);

        String concatenar = frase.concat(trozo);
        System.out.println("Concateno la frase con el trozo de palabra anterior " + concatenar);

        int posicion = frase.indexOf("y");
        System.out.println("La posición de la letra y es " + posicion);

        posicion = frase.indexOf("y", 8);
        System.out.println("La posición de la letra y saltando 8 caracteres es " + posicion);

        posicion = frase.lastIndexOf("y");
        System.out.println("La última posición de la letra y es " + posicion);

        String mayusculas = frase.toUpperCase();
        System.out.println("La frase en mayúsculas es " + mayusculas);

        String minusculas = frase.toLowerCase();
        System.out.println("La frase en minúsculas es " + minusculas);

        String nombre = "Patricia                                                      ";
        System.out.println("Mi nombre leído desde BBDD es " + nombre + ".");
        nombre = nombre.trim();
        System.out.println("Mi nombre quitando espacios de tamaño sobredimensionado es " + nombre + ".");

        String sinespacios = frase.replace(" ","");
        System.out.println("Mi frase sin espacios es " + sinespacios);

        String reemplazar = frase.replace("chao","hola");
        System.out.println("Mi frase reemplazando chao por hola es " + reemplazar);

        String palabra1 = "hola";
        String palabra2 = "adios";

        if(palabra1.equals(palabra2)){
            System.out.println("Son iguales " + palabra1 +" = " + palabra2);
        }else{
            System.out.println("No son iguales " + palabra1 +" != " + palabra2);
        }

        String palabra3 = "hola";
        String palabra4 = "Hola";

        if(palabra3.equalsIgnoreCase(palabra4)){
            System.out.println("Son iguales " + palabra3 +" = " + palabra4);
        }else{
            System.out.println("No son iguales " + palabra3 +" != " + palabra4);
        }

        int valor_unicode = frase.compareTo(palabra1);
        if (valor_unicode<0){
            System.out.println("Valor unicode = " + valor_unicode + ". La cadena " + frase + " es más pequeña que " + palabra1);

        }else{
            if (valor_unicode==0){
                System.out.println("Valor unicode = " + valor_unicode + ". La cadena " + frase + " tiene el mismo valor unicode que " + palabra1);
            }else{
                System.out.println("Valor unicode = " + valor_unicode + ".La cadena " + palabra1 + " es más pequeña que " + frase);
            }
        }

        





    }


}
