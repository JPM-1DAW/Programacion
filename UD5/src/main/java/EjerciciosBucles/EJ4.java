package EjerciciosBucles;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max;
        int cont = 1;
        System.out.print("Introduce el número final: ");
        max = sc.nextInt();
        while (cont <= max) {
            System.out.println(cont);
            cont++;
        }
    }
}
