package Ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ20 {
    public static void main(String[] args) {
        double inversion;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Introduce la inversión inicial: ");
        inversion = sc.nextDouble();
        inversion = inversion + (inversion*0.04);
        System.out.println("Balance año 1: " + df.format(inversion));
        inversion = inversion + (inversion*0.04);
        System.out.println("Balance año 2: " + df.format(inversion));
        inversion = inversion + (inversion*0.04);
        System.out.println("Balance año 3: " + df.format(inversion));
    }
}