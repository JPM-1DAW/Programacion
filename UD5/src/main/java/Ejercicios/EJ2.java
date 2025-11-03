package Ejercicios;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.print("Introduce tu edad; ");
        edad = sc.nextInt();
        if (edad < 0)
            {
                System.out.println("Edad no valida");
            }
        else if (edad > 18)
            {
            System.out.println("Eres mayor de edad.");
            }
        else
            {
            System.out.println("Eres menor de edad.");
            }
    }
}