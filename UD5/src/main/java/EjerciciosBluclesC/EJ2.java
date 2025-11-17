package EjerciciosBluclesC;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        int n1;
        int n2;
        int cont;
        do {
            System.out.print("Indique el primer número: ");
            n1 = sc.nextInt();
            if (n1 < 0) {
                System.out.println("El número ha de ser positivo.");
            }
        } while (n1 < 0);
        do {
            System.out.print("Indique el segundo número: ");
            n2 = sc.nextInt();
            if (n2 < 0) {
                System.out.println("El número ha de ser positivo.");
            }
        } while (n2 < 0);
        if (n1 > n2) {
            System.out.println(ANSI_RED + "ERROR!" + ANSI_RESET);
        }
        else {
            System.out.println("Orden ascendente:");
            for (cont = n1; cont <= n2; cont++) {
                if (n1 % cont == 0) {
                    System.out.print(cont + " ");
                }
            }
            System.out.println();
            System.out.println("Orden descendente:");
            for (int i = n2; i >= n1; i--) {
                if (n1 % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
