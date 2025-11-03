package Ejercicios;

import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Indique el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Indique el segundo numero: ");
        num2 = sc.nextInt();
        if (num1 < num2)
        {
            System.out.println(num2 + ", " + num1);
        }
        else
        {
            System.out.println(num1 + ", " + num2);
        }
    }
}