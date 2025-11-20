package EjercicosBuclesB;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int pares = 0;
        System.out.print("Introduce el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        do {
            num2 = sc.nextInt();
            if (num2 < num1) {
                System.out.print("El segundo numero debe ser mayor que el primero, vuelve a introducirlo: ");
            }
        } while  (num2 < num1);
        for  (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i < num2) {
                System.out.print(" - ");
            }
            if (i % 2 == 0) {
                pares++;
            }
        }
        System.out.println();
        System.out.println("La cantidad de pares es de: " + pares);
    }
}
