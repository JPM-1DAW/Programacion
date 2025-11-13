package EjerciciosBucles;

import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int cont = 1;
        int fact;
        do {
            System.out.print("Introduce el numero: ");
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("El número tiene que ser positivo");
            }
        } while (num < 0);
        cont = num - 1;
        while (cont != 1) {
            num = num * cont;
            cont--;
        }
        System.out.println("El resultado es: " + num);
    }
}
