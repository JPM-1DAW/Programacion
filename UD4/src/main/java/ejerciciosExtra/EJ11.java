package ejerciciosExtra;

import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número entero: ");
        String num = sc.nextLine();
        int numero = Integer.parseInt(num);
        int suma = numero + 10;
        System.out.printf("El resultado de la suma es de: %d%n", suma);
    }
}
