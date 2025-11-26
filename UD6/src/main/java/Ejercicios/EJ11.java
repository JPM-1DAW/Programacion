package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int FIN = 100;
        int numeros1[];
        numeros1 = new int[FIN];
        int numeros2[];
        numeros2 = new int[FIN];
        for (int i = 1; i <= FIN; i++) {
            numeros1[i - 1] = i;
        }
        for (int i = 1; i <= FIN; i++) {
            
        }
        System.out.println(Arrays.toString(numeros1));
        System.out.println(Arrays.toString(numeros2));
    }
}
