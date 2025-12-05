package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int FIN = 100;
        int numeros[];
        numeros = new int[FIN];
        int num;
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        for (int i = 1; i < FIN; i++) {
            numeros [i - 1] = (int) (1 + Math.random()*10);
            if (num ==  numeros[i - 1]) {
                System.out.println("Se encuentra en la posición: " + i);
            }
        }
        System.out.println(Arrays.toString(numeros));
    }
}
