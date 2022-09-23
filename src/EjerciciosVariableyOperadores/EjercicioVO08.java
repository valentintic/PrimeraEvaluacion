package EjerciciosVariableyOperadores;

import java.util.Scanner;

public class EjercicioVO08 {
    /*Escribe un programa que reciba un tiempo en segundos y muestre por pantalla este
tiempo pero expresado en horas, minutos y segundos. Por ejemplo, 12.610 segundos
son 3 horas, 30 minutos y 10 segundos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, seg, min, hor;
        System.out.print("Introduce una cantidad de segundos:");
        int segundos = sc.nextInt();
        hor = segundos / 3600;
        min =(segundos - ( 3600*hor )) / 60;
        seg = segundos - ((hor*3600) + (min * 60));
        System.out.println("el resultado es " + hor + "h " + min + "m " + seg + "s");
    }
}
