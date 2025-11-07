package Ejercicios;

import java.util.Scanner;

public class EJ17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hora;
        System.out.print("Indique la hora en formato HH:MM:SS: ");
        hora = sc.nextLine();
        //Horas
        char h1 = hora.charAt(0);
        char h2 = hora.charAt(1);
        //Minutos
        char m1 = hora.charAt(3);
        char m2 = hora.charAt(4);
        //Segundos
        char s1 = hora.charAt(6);
        char s2 = hora.charAt(7);
        String hora1 = String.valueOf(h1 + h2);
        String min1 = String.valueOf(m1 + m2);
        String seg1 = String.valueOf(s1 + s2);
        int horas = Integer.parseInt(hora1);
        int minutos = Integer.parseInt(min1);
        int segundos = Integer.parseInt(seg1);
        segundos = segundos + 1;
        if (segundos < 59) {
            System.out.println(horas + ":" + minutos + ":" + segundos);
        }
        else {
            segundos = 0;
            minutos = minutos +1;
            if  (minutos < 59) {
                System.out.println(horas + ":" + minutos + ":" + segundos);
            }
            else {
                minutos = 0;
                horas = horas +1;
                if (horas < 23) {
                    System.out.println(horas + ":" + minutos + ":" + segundos);
                }
                else {
                    horas = 0;
                    System.out.println(horas + ":" + minutos + ":" + segundos);
                }
            }
        }
    }
}