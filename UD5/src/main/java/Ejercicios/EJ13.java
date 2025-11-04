package Ejercicios;

import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.print("Introduce tu edad");
        edad = sc.nextInt();
        if (edad >= 0 && edad <4)
            {
                System.out.println("La entrada es gratis");
            }
        else if (edad >= 4 && edad <= 17)
            {
                System.out.println("El precio de la entrada es de 5€");
            }
        else if (edad >= 18)
            {
                System.out.println("El precio de la entrada es de 10€");
            }
        else
            {
                System.out.println("Edad no valida");
            }
    }
}