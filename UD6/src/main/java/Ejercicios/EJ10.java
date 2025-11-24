package Ejercicios;

import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float alturas[];
        int fin;
        double altura;
        double media = 0;
        int encimaMedia = 0;
        int debajoMedia = 0;
        System.out.print("Introduce un número: ");
        fin = sc.nextInt();
        alturas = new float[fin];
        for (int i = 1; i <= fin; i++) {
            System.out.print("Altura " + i + ": ");
            altura = sc.nextDouble();
            media += altura;
            media /= alturas.length;
        }
        System.out.println(media);
    }
}
