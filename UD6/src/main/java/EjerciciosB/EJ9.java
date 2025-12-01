package EjerciciosB;

import java.util.Arrays;
import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        String letra;
        char vocal;
        char cadena[];
        System.out.print("Escribe una frase: ");
        frase = sc.nextLine();
        cadena = frase.toCharArray();
        System.out.print("Introduce una vocal: ");
        do {
            letra = sc.nextLine();
            letra = letra.toLowerCase();
            vocal = letra.charAt(0);
            if (vocal != 'a' && vocal != 'e' && vocal != 'i' && vocal != 'o' && vocal != 'u') {
                System.out.println("La palabra debe ser una vocal.");
                System.out.print("Por favor introduzca una vocal (a, e, i, o, u): ");
            }
        } while (vocal != 'a' && vocal != 'e' && vocal != 'i' && vocal != 'o' && vocal != 'u');
        for (int i = 0; i <= cadena.length - 1; i++) {
            if (cadena[i] == vocal) {
                letra = String.valueOf(cadena[i]);
                letra = letra.toUpperCase();
                cadena[i] = letra.charAt(0);
            }
        }
        System.out.println(cadena);
    }
}