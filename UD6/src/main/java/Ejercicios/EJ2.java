package Ejercicios;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numeros [];
        final int FIN = 10;
        numeros = new float[FIN];
        float num;
        float suma = 0;
        for (int i = 1; i <= numeros.length; i++) {
            System.out.print("Número " + i + ": ");
            num = sc.nextFloat();
            numeros[i - 1] = num;
            suma += numeros[i - 1];
        }
        System.out.println("La suma de todos los números es de: " + suma);
    }
}