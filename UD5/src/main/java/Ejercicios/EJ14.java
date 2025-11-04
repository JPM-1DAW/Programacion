package Ejercicios;

import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double renta;
        System.out.print("Indique su renta anual: ");
        renta = sc.nextDouble();
        if (renta < 0)
            {
                System.out.println("El numero no es valido");
            }
        else if (renta >= 0 && renta < 10000)
            {
                System.out.println("El tramo impositivo es del 5%");
            }
        else if (renta >= 10000 && renta < 20000)
            {
                System.out.println("El tramo impositivo es del 15%");
            }
        else if (renta >=  20000 && renta < 35000)
            {
                System.out.println("El tramo impositivo es del 20%");
            }
        else if (renta >= 35000 && renta < 60000)
            {
                System.out.println("El tramo impositivo es del 30%");
            }
        else
            {
                System.out.println("El tramo impositivo es del 45%");
            }
    }
}