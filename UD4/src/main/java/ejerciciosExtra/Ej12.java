package ejerciciosExtra;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número decimal: ");
        double num = sc.nextDouble();
        String texto = String.valueOf(num);
        System.out.printf("Texto resultante: %s%n", texto);
        System.out.printf("Longitude del texto: %d%n", texto.length());
    }
}