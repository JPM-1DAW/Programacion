package EjerciciosCondicionales;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        System.out.print("Introduce un número con decimales: ");
        num1 = sc.nextDouble();
        int numero1 = (int)num1;
        if (numero1 % 2 == 0)
        {
            System.out.println("El número " + numero1 + " es par.");
        }
        else
        {
            System.out.println("El número " + numero1 + " es impar.");
        }
        System.out.print("Introduce un número con decimales: ");
        num2 = sc.nextDouble();
        int numero2 = (int)num2;
        if (numero2 % 2 == 0)
            {
                System.out.println("El número " + numero2 + " es par.");
            }
        else
            {
                System.out.println("El número " + numero2 + " es impar.");
            }
    }
}