package Ejercicios;

import java.util.Scanner;

public class EJ16 {
    public static void main(String[] args) {
        int n;
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el primer número: ");
        n = sc.nextInt();
        System.out.println("Indique el segundo número: ");
        m = sc.nextInt();
        int c = n/m;
        int r = n%m;
        System.out.println(n + " entre " + m + " da un cociente de " + c + " y un resto de " + r);
    }
}