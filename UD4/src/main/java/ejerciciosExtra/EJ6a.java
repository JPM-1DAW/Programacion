package ejerciciosExtra;

import java.util.Scanner;

public class EJ6a {
    public static void main(String[] args) {
        double num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero decimal: ");
        num = sc.nextDouble();
        int parEnt = (int) num;
        double parDec = Math.abs(num - parEnt);
        parDec = Math.round(parDec * 1000.0) / 1000.0;
        int n = Math.abs(parEnt);
        int d1 = n % 10;
        int d2 = (n / 10) % 10;
        int d3 = (n / 100) % 10;
        int d4 = (n / 1000) % 10;
        int d5 = (n / 10000) % 10;
        int suma =  d1 + d2 + d3 + d4 + d5;
        System.out.println("Parte entera: " + parEnt);
        System.out.println("Parte decimal: " + parDec);
        System.out.println("Suma de digitos de la parte entera: " + suma);
    }
}