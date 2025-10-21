package Pruebas;

import java.util.Scanner;

public class entradaEscaner {
    public static void main(String[] args) {

        int edad = 0;
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la edad: ");
        edad = sc.nextInt();
        System.out.println( "Dime la nombre: ");
        nombre = sc.nextLine();
        System.out.println("Tu edad es: " + edad);
        System.out.println("Tu nombre es: " + nombre);
        System.out.printf("Tu edad es %d y tu nombre es %s", edad, nombre);
    }
}
