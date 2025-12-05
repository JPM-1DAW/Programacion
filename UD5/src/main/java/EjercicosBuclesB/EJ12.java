package EjercicosBuclesB;

import java.util.Scanner;

public class EJ12 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num;
        int resultado;
        System.out.print("Introduce el número: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 10; j++) {
                resultado = i * j;
                System.out.print(resultado + "\t\t");
            }
            System.out.println();
        }
    }
}