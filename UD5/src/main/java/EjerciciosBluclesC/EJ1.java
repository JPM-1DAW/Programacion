package EjerciciosBluclesC;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        int n1;
        int n2;
        int cont;
        System.out.print("Indique el primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Indique el segundo numero: ");
        n2 = sc.nextInt();
        if (n1 > n2) {
            System.out.println(ANSI_RED + "ERROR!"  + ANSI_RESET);
        }
        else {
            System.out.println("Orden de los números en orden ascendente:");
            for (cont = n1; cont <= n2; cont++) {
                System.out.print(cont + " ");
            }
            System.out.println();
            System.out.println("Orden de los números en orden descendente:");
            for  (int i = n2; i >= n1; i--) {
                System.out.print(i + " ");
            }
        }
    }
}
