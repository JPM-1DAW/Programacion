package Ejercicios;

import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int FIN = 4;
        float numeros [];
        float num;
        float suma = 0;
        float media;
        numeros = new float[FIN];
        for (int i = 1; i <= numeros.length; i++) {
            System.out.print("Número " + i + ": ");
            num =  sc.nextFloat();
            numeros[i - 1] = num;
            suma += numeros[i - 1];
        }
        media = suma / numeros.length;
        System.out.println("La media es: " + media);
    }
}