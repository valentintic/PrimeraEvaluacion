package EjerciciosVariableyOperadores;

import java.util.Scanner;

public class EjercicioVO07 {
    /* Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a
cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40
minutos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min, hor;
        System.out.print("Introduce una cantidad de minutos:");
        int minutos = sc.nextInt();
        hor = minutos / 60;
        min = minutos % 60;
        System.out.println("el resultado es " + hor + "h " +  min + "m");
    }
}
