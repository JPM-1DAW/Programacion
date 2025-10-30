package ejerciciosExtra;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        int segundos, minutos, horas, dias;
        int segDia = 60 * 60 * 24;
        int segHora = 60 * 60;
        int segMinuto = 60;
        System.out.print("Indique la cantidad de segundos: ");
        Scanner sc = new Scanner(System.in);
        segundos = sc.nextInt();
        dias = segundos / segDia;
        segundos  %= segDia;
        horas = segundos / segHora;
        segundos  %= segHora;
        minutos = segundos / segMinuto;
        segundos  %= segMinuto;
        System.out.println("Equivalen a: " + dias + " dias, " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
    }
}