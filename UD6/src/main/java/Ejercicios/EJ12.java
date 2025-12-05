package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        final int FIN = 10;
        int numeros[];
        int p;
        int v;
        numeros = new int[FIN];
        do {
            System.out.println("a. Mostrar valores\n" +
                    "b. Introducir valores\n" +
                    "c. Salir\n");
            System.out.print("Selecciona una opcion: ");
            sc.nextLine(); // Limpieza del buffer
            opcion = sc.nextLine();
            if (opcion.equalsIgnoreCase("a")) {
                System.out.println(Arrays.toString(numeros));
                System.out.println();
            }
            else if (opcion.equalsIgnoreCase("b")) {
                System.out.print("Indique el número que quiere introducir en el array: ");
                v =  sc.nextInt();
                do {
                    System.out.print("Indique la posicion donde quiere introducir el número: ");
                    p = sc.nextInt();
                    if (p < 0 || p > FIN) {
                        System.out.println("Error: posicion invalida");
                    }
                } while (p < 0 || p > FIN);
                    numeros[p] = v;
                System.out.println();
            }
        } while (opcion.equalsIgnoreCase("A") || opcion.equalsIgnoreCase("B"));
        System.out.println("Saliendo del programa.");
    }
}