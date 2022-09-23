package EjerciciosBásicosValentin;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        //Escribe un programa que lea tres cadenas de texto y las muestre en orden
        //inverso, cada una en una nueva línea.
        //Entrada:
        //Java
        //Programación
        //Idioma
        //Salida:
        //Idioma
        //Programación
        //Java
        Scanner sc = new Scanner(System.in);
        // leo las variables por teclado
        String palabra1 = sc.nextLine();
        String palabra2 = sc.nextLine();
        String palabra3 = sc.nextLine();
        // Añadimos el valor de las variables
        System.out.println(palabra3);
        System.out.println(palabra2);
        System.out.println(palabra1);
    }
}
