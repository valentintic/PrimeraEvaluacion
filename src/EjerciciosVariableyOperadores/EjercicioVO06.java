package EjerciciosVariableyOperadores;

import java.util.Scanner;

public class EjercicioVO06 {
    /* N ardillas encuentran K nueces y deciden dividirlas equitativamente. Escribe un
programa que calcule (y muestre) cuántas nueces corresponden a cada ardilla y
cuántas sobrarán tras el reparto.
     */
    public static void main(String[] args) {
        System.out.println("Queremos dividir K cantidad de nueces entre X ardillas");
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la cantidad de ardillas: ");
        int ardillas = sc.nextInt();
        System.out.print("Dime la cantidad de nueces:");
        int nueces = sc.nextInt();
        int resultado = nueces / ardillas;
        double resto = nueces % ardillas;
        System.out.print("A cada ardilla le correspondera " + resultado + " nueces y sobraran " + resto );
    }
}
