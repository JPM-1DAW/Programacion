package EjercicosBuclesB;

import java.util.Scanner;

public class EJ4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        if (num < 0) {
            for (int i = 1; i <= num; i++) {
                System.out.print("#");
            }
        }
        else if  (num > 0) {
            for (int i = 1; i <= num; i++) {
                System.out.print("*");
            }
        }
        else {
            System.out.println("No se admite el número 0");
        }
    }
}