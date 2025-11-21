package EjercicosBuclesB;

import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int mult3 = 0;
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                mult3++;
            }
        }
        System.out.println("Cantidad de multiplos de 3: " + mult3);
    }
}