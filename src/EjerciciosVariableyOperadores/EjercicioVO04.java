package EjerciciosVariableyOperadores;

import java.util.Scanner;

public class EjercicioVO04 {
    /* Escribir un programa en el cual se piden cuatro números y se calcule e imprima la
suma de los dos primeros y el producto del tercero y el cuarto.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sumamos los dos primeros números");
        System.out.println("Introduce el primer número");
        int numero1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        int numero2 = sc.nextInt();
        int suma = numero1 + numero2;
        System.out.println("La suma de los de los dos primeros numeros es " + suma);
        System.out.println("Multiplicamos los dos siguientes numeros");
        System.out.println("Introduce el tercer número");
        int numero3 = sc.nextInt();
        System.out.println("Introduce el cuarto número");
        int numero4 = sc.nextInt();
        int multiplicacion = numero3 * numero4;
        System.out.println("El resultado de la multiplicación es " + multiplicacion);

    }
}
