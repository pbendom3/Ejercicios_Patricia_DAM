package org.example;
import java.util.InputMismatchException;
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



}
