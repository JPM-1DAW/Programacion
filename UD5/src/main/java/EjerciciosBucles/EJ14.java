package EjerciciosBuclesA;

import java.util.Scanner;

public class EJ14 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int euros;
        int b500, b200, b100, b50, b20, b10, b5;
        int resto;
        do {
            System.out.print("Indique la cantidad en euros (múltiplo de 5): ");
            euros = sc.nextInt();
            if (euros % 5 != 0) {
                System.out.println("La cantidad debe ser múltiplo de 5.");
            }
        } while (euros % 5 != 0);
            resto = euros;
            b500 = resto / 500;
            resto = resto % 500;
            b200 = resto / 200;
            resto = resto % 200;
            b100 = resto / 100;
            resto = resto % 100;
            b50 = resto / 50;
            resto = resto % 50;
            b20 = resto / 20;
            resto = resto % 20;
            b10 = resto / 10;
            resto = resto % 10;
            b5 = resto / 5;
            resto = resto % 5;
            System.out.println("Los billetes minimos para " + euros + "€ son:");
            if (b500 > 0) {
                System.out.println(b500 + " billete(s) de 500€");
            }
            if (b200 > 0) {
                System.out.println(b200 + " billete(s) de 200€");
            }
            if (b100 > 0) {
                System.out.println(b100 + " billete(s) de 100€");
            }
            if (b50 > 0) {
                System.out.println(b50 + " billete(s) de 50€");
            }
            if (b20 > 0) {
                System.out.println(b20 + " billete(s) de 20€");
            }
            if (b10 > 0) {
                System.out.println(b10 + " billete(s) de 10€");
            }
            if (b5 > 0) {
                System.out.println(b5 + " billete(s) de 5€");
            }
    }
}