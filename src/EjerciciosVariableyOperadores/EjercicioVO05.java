package EjerciciosVariableyOperadores;

import java.util.Scanner;

public class EjercicioVO05 {
    /* Escribe un programa que lea un valor entero n de la entrada estándar y muestre el
resultado de la siguiente expresión aritmética:
((n + 1) * n + 2) * n + 3
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();
        int resultado = ((n + 1) * n + 2) * n + 3;
        System.out.println(resultado);
    }
}
