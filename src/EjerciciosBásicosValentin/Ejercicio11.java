package EjerciciosBásicosValentin;

import java.util.Scanner;

public class Ejercicio11 {
    //Escribe un programa que lea cinco palabras de la entrada estándar y genere cada
    //palabra en una nueva línea. Las palabras deben estar en el mismo orden.
    //Entrada:
    //Esta plataforma Java
    //es adaptativa
    //Salida:
    //Esta
    //Plataforma
    //Java
    //es
    //adaptativa
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // leo las cinco palabras por teclado
        String palabra1 = sc.nextLine();
        String palabra2 = sc.nextLine();
        String palabra3 = sc.nextLine();
        String palabra4 = sc.nextLine();
        String palabra5 = sc.nextLine();
        // las escribo cada una en una linea
        System.out.println(palabra1);
        System.out.println(palabra2);
        System.out.println(palabra3);
        System.out.println(palabra4);
        System.out.println(palabra5);
    }
}
