package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        int numeros [];
        System.out.print("Indique el tamaño del array: ");
        n = sc.nextInt();
        numeros = new int[n];
        System.out.print("Indique el contenido del array: ");
        m = sc.nextInt();
        Arrays.fill(numeros, m);
        System.out.println(Arrays.toString(numeros));
    }
}
