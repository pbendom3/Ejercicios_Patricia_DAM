package org.example;

public class Metodos {

    public static int gradosKelvin(int celsius){

        final int CTE_KELVIN = 273;
        int kelvin = celsius + CTE_KELVIN;


        return kelvin;
    }

    public static void prueba_mismaclase(){
        double celsius;
        gradosKelvin(17);
    }



}
