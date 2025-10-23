package Ejercicios;

import java.util.Scanner;

public class EJ18 {
    public static void main(String[] args) {
        int barrasDia;
        int barrasAyer;
        double ganancias;
        Scanner sc = new Scanner(System.in);
        System.out.print("Indique el número de barras del día vendidas: ");
        barrasDia = sc.nextInt();
        System.out.print("Indique el número de barras de ayer vendidas: ");
        barrasAyer = sc.nextInt();
        ganancias = (barrasDia * 1.20) + (barrasAyer * (1.20*0.5));
        System.out.println("El total de ingresos del dia es de: " + ganancias + "€");
    }
}