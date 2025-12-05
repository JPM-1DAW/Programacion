package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        int incremento;
        int fin;
        int numeros[];
        System.out.print("Indique el valor inicial: ");
        valor = sc.nextInt();
        System.out.print("Indique el incremento: ");
        incremento = sc.nextInt();
        System.out.print("Indique el tamaño del array: ");
        fin  = sc.nextInt();
        numeros = new int[fin];
        for (int i=0; i< numeros.length; i++){
            numeros[i] = valor;
            valor += incremento;
        }
        System.out.println(Arrays.toString(numeros));
    }
}