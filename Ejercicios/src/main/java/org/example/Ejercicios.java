package org.example;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//Realizar un programa que pida un número al usuario,
//que deberá introducirlo usando el teclado.
//El algoritmo debe identificar si el número introducido se trata de
//un número positivo (> 0) o un número negativo (< 0) y controlar
//el caso particular del número 0, que es natural.

public class Ejercicios {

    public void ejercicio1 (){

        Scanner entrada = new Scanner(System.in);

        int numero = 0;

        while (numero == 0) {
            try {
                System.out.println("Introduce un número...");
                numero = entrada.nextInt();
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Introduce un valor válido.");
                entrada.nextLine();
            }
        }

        if (numero<0){
            System.out.println("El número es NEGATIVO.");
        }else{
            if (numero>0){
                System.out.println("El número es POSITIVO.");
            }else{
                System.out.println("El número es 0.");
            }
        }

    }

    public void ejercicio2(){

        Scanner entrada = new Scanner(System.in);

        int num1=0;
        int num2=0;
        boolean error=true;

        while (error==true){ //necesito repetir este bucle mientras se produzcan errores (el usuario introdudce un texto)

            try{
                System.out.println("Introduce un número...");
                num1 = entrada.nextInt();
                System.out.println("Introduce otro número...");
                num2 = entrada.nextInt();
                error = false;
            }catch (NumberFormatException | InputMismatchException e){
                System.out.println("Introduce un valor válido.");
                entrada.nextLine();
            }

        }

        if (num1==num2){
            System.out.println("Los números son iguales.");
        }else{

            if(num1>num2){
                System.out.println("El número " + num1 + " es el mayor.");
            }else{
                System.out.println("El número " +  num2 + " es el mayor.");
            }

        }

    }

    public void ejemplo_trycatch(){

        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        boolean e = true;

        while(e==true){
            try {
                System.out.println("Introduce un número...");
                numero = teclado.nextInt();
                System.out.println("El número es "+ numero);
                e = false;
            }catch (InputMismatchException err){
                System.out.println("ERROR. El valor indicado no es correcto.");
                teclado.nextLine();
            }
        }

        System.out.println("número..." + numero);
    }

    public void prueba(){

        Scanner entrada = new Scanner(System.in);
        Random rdm = new Random();

        //Variables y arrays
        Integer[] elec = new Integer[7];    //Array obtenido por split(), contiene num_usuario y reintegro
        Integer[] loteria = new Integer[6]; //Número de la lotería
        Integer[] num_usuario = new Integer[6]; //Número de la lotería introducido por el usuario
        int complementario;  //Número complementario generado aleatoriamente
        int reint_maquina;  //Reintegro generado aleatoriamente
        boolean filtro = false; //Boolean para comprobar y hacer saltar el programa si falla algo
        int reintegro = 0;  //Reintegro introducido por el usuario
        int aciertos = 0;
        boolean rein = true;

        do {    //Número de la lotería
            for (int i = 0; i < loteria.length; i++) {
                loteria[i] = rdm.nextInt(49)+1;
            }
            Arrays.sort(loteria);
            complementario= rdm.nextInt(49)+1;
            reint_maquina=rdm.nextInt(10);

        }while (loteria.length!= Arrays.stream(loteria).distinct().toArray().length || Arrays.asList(loteria).contains(complementario) == true);
//        System.out.println("Chuleta:");
//        System.out.println("Num lotería: " + Arrays.toString(loteria));
//        System.out.println("Complementario: " + complementario);
//        System.out.println("Reintegro: " + reint_maquina);

        System.out.println("Introduce los datos de tu boleto:");
        String entry = entrada.next();
        if (entry.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}") == true) {

            filtro=true;

            String[] num = entry.split("[-/]");

            for (int i = 0; i < num.length; i++) {  //Pasar a variable numérica
                elec[i] = Integer.parseInt(num[i]);
                if (i < num.length - 1) {
                    num_usuario[i]=Integer.parseInt(num[i]);
                }
            }

            reintegro = elec[6];    //Reintegro introducido por el usuario

            for (int i = 0; i < elec.length-1; i++) {   //Filtro para comprobar si es correcto el número introducido, pues no sebe ser mayor a 49 ni menor a 1
                if (elec[i] < 1 || elec[i] > 49) {
                    filtro = false;
                }
            }
            if (elec[6] > 9 || elec[6] < 0) {   //Que el número en última posición no sea mayor a 9 o menor a 0 pues es el reintegro
                filtro = false;
            }
            Arrays.sort(num_usuario);   //Lotería introducida por usuario ordenada

            if (num_usuario.length > Arrays.stream(num_usuario).distinct().toArray().length) {    //Comprueba la longitud del array cuando se le eliminan los repetidos y se compara con la original
                filtro = false;
            }
        }
        if (filtro == false) {  //A cualquier error salta del programa
            System.out.println("Formato introducido no válido");
            return;
        }
        System.out.println(Arrays.toString(elec));
        System.out.println("El número de la lotería es: " + Arrays.toString(loteria));
        System.out.println("Complementario: " + complementario);
        System.out.println("Reintegro: " + reint_maquina);

        //Aciertos
        for (int i = 0; i < loteria.length; i++) {
            if (Arrays.asList(loteria).contains(num_usuario[i])) {
                aciertos++;
            }
        }
        System.out.println();

        //Categorías:
        if (aciertos==6 && reintegro==reint_maquina) {
            System.out.println("Has ganado la Primitiva!!! Categoría Especial, has acertado todos los números y el reintegro");
            rein = false;
        } else if (aciertos==6) {
            System.out.println("Has ganado la Primitiva!!! 1ªCategoría, has acertado: " + aciertos);
        } else if (aciertos==5 && Arrays.asList(num_usuario).contains(complementario)==true) {
            System.out.println("2ªCategoría, has acertado: " + aciertos + " y el número complementario.");
        } else if (aciertos==5) {
            System.out.println("3ªCategoría, has acertado: " + aciertos);
        } else if (aciertos==4) {
            System.out.println("4ªCategoría, has acertado: " + aciertos);
        } else if (aciertos==3) {
            System.out.println("5ªCategoría, has acertado: " + aciertos);
        } else if (aciertos<3) {
            System.out.println("No premiado, has acertado: " + aciertos);
        }
        if (rein && reintegro==reint_maquina) {
            System.out.println("Reintegro.");
        }



    }



}
