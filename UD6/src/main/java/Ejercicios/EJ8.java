package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int FIN = 100;
        float numeros [];
        numeros = new float[FIN];
        float r;
        int igualSuperior = 0;
        for (int i = 0; i < FIN; i++) {
            numeros[i] = (float) Math.random();
        }
        System.out.print(Arrays.toString(numeros) + " ");
        System.out.println();
        System.out.print("Indique un número: ");
        r = sc.nextFloat();
        for (float i = numeros[0]; i < numeros.length; i++) {
            if (numeros[(int) i] >= r) {
                igualSuperior++;
            }
        }
        if  (igualSuperior == 0) {
            System.out.println("No hay números iguales o superiores al indicado");
        }
        else {
            System.out.println("Hay " + igualSuperior + " números iguales o superiores al indicado");
        }
    }
}