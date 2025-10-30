package ejerciciosExtra;

import javax.swing.*;
import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        double precio1, precio2;
        System.out.print("Introduce el precio del primer producto: ");
        Scanner sc = new Scanner(System.in);
        precio1 = sc.nextDouble();
        System.out.print("Introduce el precio del segundo producto: ");
        precio2 = sc.nextDouble();
        double pMax = Math.max(precio1, precio2);
        double pMin = Math.min(precio1, precio2);
        double diferencia = pMax - pMin;
        System.out.printf("Precio más caro: %.2f%n", precio1);
        System.out.printf("Precio más barato:  %.2f%n", precio2);
        System.out.printf("Diferencia: %.2f", diferencia);
    }
}
