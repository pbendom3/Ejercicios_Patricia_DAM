package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Vectores {

    public void vectores(){

        int vector[] = new int[7];

        vector[3] = 27;

        vector[6] = vector[3]*2;

        vector[1] = vector[6] - vector[3];

        System.out.print(vector[3]);

        for (int i=0; i<vector.length;i++){
            System.out.print(" " + vector[i] + " ");
        }

        String palabras[] = new String[5];

        palabras[0] = "10";

        for(int i=0; i<palabras.length;i++){
            System.out.print(" " + palabras[i] + " ");
        }

    }

    public void ejercicio1(){

        int numeros[] = new int[8];

        Random aleatorios = new Random();

        //CACA
//        numeros[0] = aleatorios.nextInt();
//        numeros[1] = aleatorios.nextInt();

        int suma = 0;

        for(int i=0;i<numeros.length;i++){
            numeros[i] = aleatorios.nextInt(501);
            suma+=numeros[i];
        }

        System.out.println("El resultado es " +  suma);

    }

    public void ejercicio2(){

        Scanner teclado = new Scanner(System.in);

        int aux;

        int numeros[] = new int[5];
        String numeros_org = "Array original: ", numeros_inv = "Array invertido: ";

        System.out.println("Introduce los números a invertir...");

        int ultima=numeros.length-1;

        for (int i=0;i<numeros.length;i++){
            numeros[i] = teclado.nextInt();
        }

        System.out.println(Arrays.toString(numeros));

        for (int i=0; i<numeros.length/2;i++){
            aux=numeros[i];
            numeros[i]=numeros[ultima-i];
            numeros[ultima-i]=aux;
        }

        System.out.println(Arrays.toString(numeros));


//        }


    }

    public void ejercicio3(){

        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[25];

        for(int i=0;i<numeros.length;i++){

            numeros[i] = aleatorio.nextInt(101);

        }

        int num = 0;

        System.out.println("Introduce un número [0,100]: ");

        do {
            if (teclado.hasNextInt()){
                num = teclado.nextInt();
            }else{
                System.out.println("Introduce un formato válido");
                teclado.nextLine();
            }

        }while(num<0 || num>100);

        int contador = 0;

        for (int i=0;i<numeros.length;i++){

            if(num==numeros[i]){
                contador++;
            }

            System.out.print(" " +  numeros[i] + " ");

        }

        System.out.println("\n El número " + num + " aparece " + contador + " veces en el array.");



    }

    public void vectores_evo(){


        String palabras[] = {"Paco", "Pepe", "Manolo", "Antonio", "Alexandre"};

        for(String i : palabras){
            System.out.println(" " + i + " ");
        }

        System.out.println(Arrays.toString(palabras));

        String salida = Arrays.toString(palabras);
        salida = salida.replace("[", "").replace("]", "");
        System.out.println(salida);

        System.out.println(palabras);

        String palabras2[] = palabras;

        System.out.println(palabras2);

        String palabras3[] = palabras.clone();

        palabras3[0] = "Francisco";

        System.out.println(Arrays.toString(palabras2));
        System.out.println(Arrays.toString(palabras3));

        String palabras_corto[] = new String[2];
        System.out.println(Arrays.toString(palabras_corto));

        System.arraycopy(palabras,0,palabras_corto,0,2);
        System.out.println(Arrays.toString(palabras_corto));


    }

    public void ejercicio5(){

        int numeros[] = {4,5,2,10,98};

        System.out.println(Arrays.toString(numeros));

        int ultima_posicion = numeros[numeros.length-1];

        for (int i=numeros.length-1;i>=0;i--){

            if(i==0){
                numeros[i] = ultima_posicion;
            }else{
                numeros[i] = numeros[i-1];
            }

        }

        System.out.println(Arrays.toString(numeros));


    }






}
