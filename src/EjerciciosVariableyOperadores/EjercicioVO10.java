package EjerciciosVariableyOperadores;

import java.util.Scanner;

public class EjercicioVO10 {
    /* 10. Dado un número de dos dígitos, imprime su primer número (las decenas).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a/10);
    }
}
