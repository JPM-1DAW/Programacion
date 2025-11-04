package Ejercicios;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        int partEn1;
        int partEn2;
        System.out.print("Indique el primer número: ");
        num1 = sc.nextDouble();
        System.out.print("Indique el segundo número: ");
        num2 = sc.nextDouble();
        partEn1 = (int) num1;
        partEn2 = (int) num2;
        if (num1 == num2)
            {
                System.out.println("Ambos numeros son igueles");
            }
        else if (num1 == partEn1 && num2 == partEn2)
            {
                System.out.println("Numeros enteros: " + (int)num1 + " y " + (int)num2);
            }
        else if (num1 == partEn1 && num2 != partEn2)
            {
            System.out.println("Numeros enteros: " + (int)num1);
            }
        else if (num1 != partEn1 && num2 == partEn2)
            {
                System.out.println("Numeros enteros: " + (int)num2);
            }
        else
            {
                System.out.println("Ningun número es entero.");
            }
    }
}