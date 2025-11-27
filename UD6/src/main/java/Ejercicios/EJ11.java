package Ejercicios;

import java.util.Arrays;

public class EJ11 {
    public static void main(String[] args) {
        final int FIN = 100;
        int numeros1[];
        numeros1 = new int[FIN];
        int numeros2[];
        numeros2 = new int[FIN];
        for (int i = 1; i <= FIN; i++) {
            numeros1[i - 1] = i;
        }
        for (int i = 1; i <= FIN; i++) {
            numeros2[i - 1] = numeros1.length - i + 1;
        }
        System.out.println(Arrays.toString(numeros1));
        System.out.println(Arrays.toString(numeros2));
    }
}