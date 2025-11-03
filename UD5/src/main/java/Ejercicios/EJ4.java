package Ejercicios;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.print("Introduce el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextInt();
        System.out.print("Introduce el tercer numero: ");
        num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3)
            {
                System.out.println(num1 + " es mayor.");
            }
        else if (num2 > num1 && num2 > num3)
            {
            System.out.println(num2 + " es mayor.");
            }
        else
            System.out.println(num3 + " es mayor.");
    }
}