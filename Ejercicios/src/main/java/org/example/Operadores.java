package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operadores {

    public void operadores(){

        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;
        String x = "Thank", y = "You";
        // Operador + y -
        System.out.println("a + b = "+(a + b));
        System.out.println("a - b = "+(a - b));
        // El operador + si se usa con strings
        // concatena las cadenas dadas.
        System.out.println("x + y = "+x + y);
        // Operador * y /
        System.out.println("a * b = "+(a * b));
        System.out.println("a / b = "+(a / b));
        // operador de módulo da el resto
        // de dividir el primer operando con el segundo

        System.out.println("a % b = " + (a % b) );

        // si el denominador es 0 en la división
        // System.out.println(a/c);
        // lanzaría una java.lang.ArithmeticException
    }

    public void asignacion(){

        int a = 20, b = 10, c, d, e = 10, f = 4, g = 9;
        // operador de asignación simple
        c = b;
        System.out.println("Valor de c = " + c);
        // Esta siguiente declaración arrojaría una exception
        // porque el valor del operando derecho debe ser inicializado
        // antes de la asignación, entonces el programa no
        // compila.
        // c = d;
        // operadores de asignación simples
        a = a + 1;
        b = b - 1;
        e = e * 2;
        f = f / 2;
        System.out.println("a,b,e,f = " + a + ","
                + b + "," + e + "," + f);
        a = a - 1;
        b = b + 1;
        e = e / 2;
        f = f * 2;

        // operados de asignación compuestos/cortos
        a += 1;
        b -= 1;
        e *= 2;
        f /= 2;
        System.out.println("a,b,e,f (usando operadores cortos)= " +
                a + "," + b + "," + e + "," + f);

    }

    public void comparacion(){

        int a = 20, b = 10;
        String x = "Thank", y = "Thank";
        int ar[] = { 1, 2, 3 };
        int br[] = { 1, 2, 3 };
        boolean condicion = true;
        //varios operadores condicionales
        System.out.println("a == b :" + (a == b));
        System.out.println("a < b :" + (a < b));
        System.out.println("a <= b :" + (a <= b));
        System.out.println("a > b :" + (a > b));
        System.out.println("a >= b :" + (a >= b));
        System.out.println("a != b :" + (a != b));
        // Los Arrays no se pueden comparar con
        // operadores relacionales porque los objetos
        // almacenan referencias, mas no el valor
        System.out.println("x == y : " + (ar == br));
        System.out.println("condicion==true :" + (condicion == true));

    }

    public void logicos(){

        String x = "java";
        String y = "desdecero";
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese usuario:");
        String uuid = s.next();
        System.out.print("Ingrese contraseña:");
        String upwd = s.next();
        // Verifique si el nombre de usuario y la contraseña coinciden o no.
        if ((uuid.equals(x) && upwd.equals(y)) ||
                (uuid.equals(y) && upwd.equals(x))) {
            System.out.println("Bienvenido usuario.");
        } else {
            System.out.println("ID o Contraseña equivocada");
        }

    }

    public void correc(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("==BIENVENID@ A LA CALCULADORA DE DIEGO==");
        System.out.println("========================================");
        System.out.println("(+) --> SUMA                           =");
        System.out.println("(-) --> RESTA                          =");
        System.out.println("(/) --> DIVISION                       =");
        System.out.println("(R) --> RAIZ CUADRADA                  =");
        System.out.println("========================================");


        int op1 = 0;
        int op2 = 0;
        String sig = "";

        boolean salidavalida = false;
        while (!salidavalida) {
            try {
                System.out.print("Escribe aqui el primer operador: ");
                op1 = entrada.nextInt();
                salidavalida = true;
            } catch (InputMismatchException e) {
                System.out.println("**ERROR: Solo se permiten números enteros. Inténtalo de nuevo.**");
                entrada.next();
            }
        }

        salidavalida = false;
        while (!salidavalida) {
            System.out.print("Escribe aqui el signo a aplicar: ");
            sig = entrada.next();

            if (sig.length() != 1) {
                System.out.println("**ERROR: Debes ingresar un solo carácter. Inténtalo de nuevo.**");
                continue;
            }
            if (Character.isDigit(sig.charAt(0))) {
                System.out.println("**ERROR: No se permiten números como signo. Inténtalo de nuevo.**");
            } else {
                salidavalida = true;
            }
        }


        if (!sig.equals("R")) {
            salidavalida = false;
            while (!salidavalida) {
                try {
                    System.out.print("Escribe aqui el segundo operador: ");
                    op2 = entrada.nextInt();
                    salidavalida = true;
                } catch (InputMismatchException e) {
                    System.out.println("**ERROR: Solo se permiten números enteros. Inténtalo de nuevo.**");
                    entrada.next();
                }
            }
        }

        System.out.println("========================================");

        switch(sig) {
            case "+":
                int suma = op1 + op2;
                System.out.println("RESULTADO: " + suma);
                break;
            case "-":
                int resta = op1 - op2;
                System.out.println("RESULTADO: " + resta);
                break;
            case "/":
                int division = op1 / op2;
                System.out.println("RESULTADO: " + division);
                break;
            case "R":
                int resultadoR = (int) Math.sqrt(op1);
                System.out.println("RESULTADO: " + resultadoR);
                break;
            default:
                System.out.println("**ERROR NO VALIDO SIMBOLO INEXISTENTE**");
        }

        System.out.println("========================================");


    }
}
