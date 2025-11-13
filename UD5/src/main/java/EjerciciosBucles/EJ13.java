package EjerciciosBucles;

import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean acierto = false;
        int num;
        String adivinar;
        System.out.print("El número a adivinar es: ");
        num = sc.nextInt();
        do {
            System.out.println("El número es " + (1 + (int) (Math.random() * 100)) +  "? (S o N)");
            adivinar = sc.next();
            if (adivinar.equalsIgnoreCase("s")) {
                acierto = true;
            }
        } while (!acierto);
        System.out.println("Sabia que el número era " + num + " desde el principio.\nSolo estaba jugado contigo");
    }
}