package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros [];
        int tamaño;
        int num1;
        int num2;
        System.out.print("Indique el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Indique el segundo número: ");
        num2 = sc.nextInt();
        tamaño = num2 - num1;
        numeros = new int [tamaño];
        for (int i = 1; i <= tamaño; i++) {
            numeros[i - 1] = num1;
            num1++;
        }
        System.out.println(Arrays.toString(numeros));
    }
}