package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numeros [];
        final int FIN = 10;
        numeros = new float[FIN];
        float num;
        for (int i = 1; i <= numeros.length; i++) {
            System.out.print("Número " + i + ": ");
            num = sc.nextFloat();
            numeros[i - 1] = num;
        }
        System.out.println(Arrays.toString(numeros));
    }
}
