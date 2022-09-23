package EjerciciosBásicosValentin;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        //Imagina que eres un gerente de recursos humanos en un restaurante y necesitas
        //contratar a un chef. Para hacer eso, necesitas recopilar algunos datos preliminares
        //sobre los candidatos, concretamente 5 campos: nombre, edad, años de experiencia,
        //preferencia de cocina. Escribe un programa que lea todas las palabras (o números)
        //una a una e imprima lo siguiente: "El formulario de <NOMBRE>, de <EDAD> años
        //y <AÑOS DE EXPERIENCIA> de experiencia, está completo. Nos comunicaremos
        //con usted si necesitamos a alguien que cocine comida <PREFERENCIA DE
        //COCINA>".
        //Entrada:
        //Eugenio
        //33
        //8
        //vegetariana
        //Salida:
        //El formulario de Eugenio, de 33 años y 8 de experiencia, está completo. Nos
        //nos comunicaremos con usted si necesitamos alguien que cocine comida
        //vegetariana.
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        int edad = sc.nextInt();
        int añosDeExperiencia = sc.nextInt();
        // para que no salte añadimos la siguiente linea
        sc.nextLine();
        String preferenciaDeCocina = sc.nextLine();
        System.out.println("El formulario de " + nombre + ", de "+ edad + " años y " + añosDeExperiencia + " de experiencia, esta completo. Nos comunicaremos con usted si necesitamos alguien que cocine comida " + preferenciaDeCocina );
    }
}
