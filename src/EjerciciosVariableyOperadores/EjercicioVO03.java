package EjerciciosVariableyOperadores;

import java.util.Scanner;

public class EjercicioVO03 {
    public static void main(String[] args) {
        /* A partir de una variable num1 con valor inicial 12 y una variable num2 con valor
inicial 4, crear nuevas variables que almacenen el resultado de realizar la suma, resta,
multiplicación, división y resto de num1 y num2. Mostrar el valor de las nuevas
variables por pantalla.
         */
        int num1 = 12;
        int num2 = 4;
        int suma = num1 + num2;
        int resta = num1 - num2;
        int división = num1 / num2;
        int multiplicación = num1 * num2;
        System.out.println("Dado los valores 12 y 4");
        System.out.println("La suma es igual a "  + suma);
        System.out.println("La división es igual a " + división);
        System.out.println("La multiplicación es igual a " + multiplicación);
        System.out.println("La resta es igual a " + resta);
    }
}
