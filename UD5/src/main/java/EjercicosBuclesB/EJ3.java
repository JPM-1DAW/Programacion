package EjercicosBuclesB;

import java.util.Scanner;

public class EJ3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduce un número entero positivo: ");
        do {
            num = sc.nextInt();
            if (num <0) {
                System.out.println("El número debe ser positivo.");
                System.out.print("Pruebe de nuevo: ");
            }
        } while (num < 0);
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }
        }
    }
}