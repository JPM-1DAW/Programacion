package ejerciciosExtra;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        int segundos, minutos, horas, dias;
        int segDia = 60 * 60 * 24;
        System.out.print("Indique la cantidad de segundos: ");
        Scanner sc = new Scanner(System.in);
        segundos = sc.nextInt();
        dias = segundos / segDia;
        horas = segDia / (dias * 60);
        minutos = horas / 60;
        segundos = minutos / 60;
        System.out.println("Equivalen a: " + dias + " dias, " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
    }
}