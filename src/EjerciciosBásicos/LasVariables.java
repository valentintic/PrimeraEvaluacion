package EjerciciosBásicos;

import java.awt.*;

public class LasVariables {
        public static void main(String[] args) {
        //variables
        int a;// Declaro la variante a(a partir de ahora hay un trocito de memoria que se llama a)
            a = 5;// y a continuación gurado en ello el valor 5
            System.out.println  ("la variable a vale " + a);
            // su valor puede ser modificado en cualquier momento
            a = 8;
            System.out.println ("la variable a vale " + a);

            //reglas para nombrar variables
              //No puede comenzaar por ningun digito
            //int 5c = 4; --> no compilo
              //Puede contener cualquier letra o digito
            int c58 = 2;
            //No puede contener cualquier caracter especial (signos de puntucion, . . .)
            int _variable = 3;
            int $otravariable  = 4;
            // No puede contener espacios
            //int otra variable; --> no compilo

            System.out.println("TIPOS DE VARIABLES");
            System.out.println ("================");
                    System.out.println("las variables se declaran 1' el tipo de varibles que es y 2' el nombre que le damos a la variable");
            System.out.println("Variables para los números enteros: byte, short, ");
                    System.out.println("byte");
            byte variableBytePos = 127; // es el número más grande que pueda guardarr en una variable de tipo byte
            byte variableByteNeg = -128; // es el número más grande que puede guardar en una variable byte
            System.out.println("variableBytePos = " + variableBytePos);
            System.out.println("variableByteNeg = " + variableByteNeg);
            System.out.println("Numeros con decimales: float o double");
            double decimal = 3.14;
            double numero = 3;
            System.out.println("numero");
            float otroDecimal = 8.43f; // si declaras una variable de tipo float ponemos una f



        }
    }