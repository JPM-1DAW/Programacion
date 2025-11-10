package EjerciciosCondicionales;

import java.util.Scanner;

public class EJ19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anyo;
        System.out.print("Indique el año que desea comprobar: ");
        anyo = sc.nextInt();
        if (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0) {
            System.out.println("El año " + anyo + " es un año bisiesto.");
        }
        else {
            System.out.println("El año " + anyo + " no es un año bisiesto.");
        }
    }
}