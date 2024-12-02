package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bingo {

    public static void bingo (){

        Integer sorteo[] = crearSorteo();
        int carton[][] = new int[3][3];
        carton = rellenarCarton(carton);
        imprimirMatriz(carton);

    }

    public static Integer[] crearSorteo(){

        Random aleatorio = new Random();
        int bolas = aleatorio.nextInt(31)+10;

        Integer sorteo[] = new Integer[bolas];
        int aux;

        for (int i = 0; i < sorteo.length; i++) {
            do{
                aux=aleatorio.nextInt(90)+1;
            }while(Arrays.asList(sorteo).contains(aux));

            sorteo[i]=aux;
        }

        System.out.println(bolas + " extraídas hasta ahora: " + Arrays.toString(sorteo));

        return sorteo;

    }

    public static int[][] rellenarCarton(int carton[][]){

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < carton.length; i++) {

            System.out.println("Fila " + (i+1) + ": ");
            String fila = teclado.next();

            comprobarFormato(fila);

            String datos_fila[] = fila.split("-");

            for (int j = 0; j < carton[i].length; j++) {
                carton[i][j] = Integer.parseInt(datos_fila[j]);

            }
        }

        return carton;

    }

    public static void comprobarFormato(String fila){
        if(!fila.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}")){
            System.out.println("ERROR de formato (N-N-N)");
            System.exit(0);
        }
    }

    public static void imprimirMatriz(int carton[][]){

        System.out.print("\n");
        System.out.println("Datos del cartón: ");

        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                System.out.print(carton[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

    public void bingo2(){









        boolean haybingo = true;
        bingo:
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {

                if(!Arrays.asList(sorteo).contains(carton[i][j])){
                    haybingo=false;
                    break bingo;
                }
            }
        }

        if(haybingo){
            System.out.println("HAY BINGO!!");
           // return;
        }else{
            System.out.println("NO HAY BINGO!!");

            linea:
            for (int i = 0; i < carton.length; i++) {

                for (int j = 0; j < carton[i].length; j++) {

                    if(!Arrays.asList(sorteo).contains(carton[i][j])){
                        System.out.println("Línea " + (i+1) + ": NO TIENE PREMIO.");
                        continue linea;
                    }

                }

                System.out.println("Línea " + (i+1) + ": CORRECTA!!");

            }


        }






    }



}
