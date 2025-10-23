package Ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ17 {
    public static void main(String[] args) {
        int emp;
        int nap;
        double peso;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de empanadillas a enviar: ");
        emp = sc.nextInt();
        System.out.print("Tnroduce el número de napolitanas a enviar: ");
        nap = sc.nextInt();
        peso = ((emp * 112) + (nap * 75)) / 1000.0;
        DecimalFormat df = new DecimalFormat("##.###");
        System.out.println("El peso total del paquete es de: " + df.format(peso) + " kg");
    }
}