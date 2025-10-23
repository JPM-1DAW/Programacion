package Ejercicios;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        int horas;
        int tarifa;
        int bruto;
        double neto;
        double irpf = 0.85;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        horas = sc.nextInt();
        System.out.println("Indique la tarifa: ");
        tarifa = sc.nextInt();
        bruto = horas * tarifa;
        neto = bruto * irpf;
        System.out.println("El salario bruto es de: " + bruto + " y el salario neto es de: " + neto);
    }
}
