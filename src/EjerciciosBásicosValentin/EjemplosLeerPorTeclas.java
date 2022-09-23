package EjerciciosBásicosValentin;

import java.util.Scanner;

public class EjemplosLeerPorTeclas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ahora ya podemos meter datos por teclado
        //Para poder utilizarlos depués em el programa
        // tenemos que guardarlos en una variable
        // las variables que guardan palabras o cadenas de textos se llaman string
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();// escribe el nombre en el teclado y lo guardo en la variable nombre
        System.out.println("hola " + nombre);
        System.out.println("Introduce tu apellido: ");
        String apellido = sc.nextLine();// escribe el apellido en el teclado y lo guardo em la variable apellido
        System.out.println("hola " + nombre + " " + apellido);
        System.out.println("¿Ccuantos años tienes: ");
        int edad = sc.nextInt();
        /*
        Este metedo nextInt() tiene un peligro : si a continuacion pones un nextlien() se lo salta.
        La manera de evitarlo es : cada vez que yo escribo nextint() ,si se  que luego voy a poner nextline() , escribo un nextline() adicional,sin mas, de esta manera "limpiamos"el sc.
         */
        sc.nextLine();
        System.out.println("Vaya pareces muy joven para tener " + edad + " años.");
        System.out.println("¿Tienes mascota?");
        String mascota =sc.nextLine();
        System.out.println("Pues muy bien .");
        System.out.println("¿y cual es tu patrimonio?");
        double patrimonio =sc.nextDouble();
        System.out.println("¡" + patrimonio + "!");




    }
}
