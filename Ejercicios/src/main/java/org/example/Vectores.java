package org.example;

import java.time.LocalDateTime;
import java.time.Year;
import java.util.*;

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

    public void navidad(){

        Scanner teclado = new Scanner(System.in);

        final String PALABRA = "NAVIDAD";

        String palabras[] = PALABRA.split("");

        System.out.println(Arrays.toString(palabras));

        System.out.println("Introduce la cantidad de letras que quieres...");
        String cantidad = teclado.nextLine();
        String cantidades[] =  cantidad.split(" ");

        String resultado = "";

        System.out.println(Arrays.toString(cantidades));

        if (cantidades.length==palabras.length){
            for (int i=0;i<cantidades.length;i++){

                for (int j=0; j<Integer.parseInt(cantidades[i]);j++){

                    resultado = resultado + palabras[i];

                }

            }

            System.out.println(resultado);
        }else{
            System.out.println("No hay 1 número por letra.");
        }

    }

    public void buscar(){

        String nombres[] = {"Paco", "Jose", "Ximo", "Alfonso"};

        String palabra_buscar = "Pepe";

        boolean existe = Arrays.asList(nombres).contains(palabra_buscar);

        if (existe){
            System.out.println(palabra_buscar +  " existe.");
        }else{
            System.out.println(palabra_buscar + " no existe en el vector.");
        }

        Integer numeros[] = {3,5,6,8,24,56};

        int num = 6;

        boolean num_existe = Arrays.asList(numeros).contains(num);

        if (num_existe){
            System.out.println(num + " existe en el array.");
        }else{
            System.out.println(num + " no existe en el array.");
        }





    }

    public void ruleta(){

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        String colores[] = {"rojo","negro"};

        Integer numeros[] = new Integer[37];

        for (int i=0; i<numeros.length;i++){
            numeros[i] = i;
        }

        String pares[] = {"par","impar"};

        System.out.println("*****BIENVENIDO A LA RULETA******");

        System.out.println("Introduce un número (0-36): ");
        int numero = teclado.nextInt();

        boolean numero_encontrado = Arrays.asList(numeros).contains(numero);

        String color = "";
        String par = "";

        if (!numero_encontrado){
            System.out.println("ERROR. El número no es válido");
            return;
        }else{
            if (numero!=0){
                System.out.println("Inserta un color...");
                color = teclado.next();
                boolean color_encontrado = Arrays.asList(colores).contains(color);

                if (!color_encontrado){
                    System.out.println("ERROR. El color no es válido");
                    return;
                }else{
                    System.out.println("Inserta par/impar: ");
                    par = teclado.next();
                    boolean par_encontrado = Arrays.asList(pares).contains(par);

                    if(!par_encontrado){
                        System.out.println("ERROR. La opción par/impar no es válida.");
                        return;
                    }
                }

            }

        }

        String sorteo_color = colores[aleatorio.nextInt(colores.length)];
        int sorteo_numero = numeros[aleatorio.nextInt(numeros.length)];
        String sorteo_par = "";

        if (sorteo_numero%2==0){
            sorteo_par = "par";
        }else{
            sorteo_par = "impar";
        }

        System.out.println("Ha tocado " + sorteo_numero + " " + sorteo_color + " " + sorteo_par);

        if (sorteo_numero==numero && sorteo_color.equals(color) && sorteo_par.equals(par)){
            System.out.println("HAS GANADO!!!");
        } else if (numero!=0 && sorteo_color.equals(color)) {
            System.out.println("Has acertado el color.");
        } else if (numero!=0 && sorteo_par.equals(par)) {
            System.out.println("Has acertado la opción " + par);
        } else if (numero!= 0 && numero==sorteo_numero) {
            System.out.println("Has acertado el número");
        } else if (numero==0 && sorteo_numero==0) {
            System.out.println("HAS GANADO y los demás usuarios pierden.");
        }else{
            System.out.println("Has perdido.");
        }


    }









}
