package ejerciciosExtra;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        double IVA = precio * 0.21;
        double precioFin = precio + IVA;
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.printf("Precio sin IVA: %s\n", df.format(precio));
        System.out.printf("IVA: %s\n", df.format(IVA));
        System.out.printf("Precio final con IVA: %s €", df.format(precioFin));
    }
}