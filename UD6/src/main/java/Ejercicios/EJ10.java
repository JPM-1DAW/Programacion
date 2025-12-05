package Ejercicios;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float alturas[];
        int fin;
        float altura;
        float suma = 0;
        float media = 0;
        int encimaMedia = 0;
        int debajoMedia = 0;
        int enLaMedia = 0;
        System.out.print("Introduce un número: ");
        fin = sc.nextInt();
        alturas = new float[fin];
        for (int i = 1; i <= fin; i++) {
            System.out.print("Altura " + i + ": ");
            altura = sc.nextFloat();
            alturas[i - 1] = altura;
            suma += altura;
        }
        media = suma / alturas.length;
        Arrays.sort(alturas);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("La altura minima es: " + alturas[0]);
        System.out.println("La altura maxima es: " + alturas[fin - 1]);
        System.out.println("La altura media es de: " + df.format(media));
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > media) {
                encimaMedia++;
            }
            else if (alturas[i] < media) {
                debajoMedia++;
            }
            else {
                enLaMedia++;
            }
        }
        System.out.println("Hay " + encimaMedia + " persona por encima de la media.");
        System.out.println("Hay " + debajoMedia + " persona por debajo de la media.");
        System.out.println("Hay " + enLaMedia + " persona en la media de altura.");
    }
}