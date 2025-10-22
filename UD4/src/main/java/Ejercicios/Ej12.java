package Ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        float precioArticulo;
        float precioVenta;
        double descuento;
        System.out.print("Indique el precio original del objeto:");
        Scanner sc = new Scanner(System.in);
        precioArticulo = sc.nextInt();
        System.out.print("Indique el precio real del objeto:");
        precioVenta = sc.nextInt();
        descuento = (precioArticulo-precioVenta)/precioArticulo;
        DecimalFormat df = new DecimalFormat("###.##%");
        System.out.println("El descuento aplicado es de: " + df.format(descuento));
    }
}
