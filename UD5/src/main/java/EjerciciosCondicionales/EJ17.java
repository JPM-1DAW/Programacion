package EjerciciosCondicionales;

import java.text.DecimalFormat;
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
        String hora1 = String.valueOf(h1);
        String hora2 = String.valueOf(h2);
        String min1 = String.valueOf(m1);
        String min2 = String.valueOf(m2);
        String seg1 = String.valueOf(s1);
        String seg2 = String.valueOf(s2);
        int horas = Integer.parseInt(hora1 +  hora2);
        int minutos = Integer.parseInt(min1 + min2);
        int segundos = Integer.parseInt(seg1 + seg2);
        segundos = segundos + 1;
        DecimalFormat df = new DecimalFormat("00");
        if (segundos <= 59) {
            System.out.println(df.format(horas) + ":" + df.format(minutos) + ":" + df.format(segundos));
        }
        else {
            segundos = 0;
            minutos = minutos +1;
            if  (minutos <= 59) {
                System.out.println(df.format(horas) + ":" + df.format(minutos) + ":" + df.format(segundos));
            }
            else {
                minutos = 0;
                horas = horas +1;
                if (horas <= 23) {
                    System.out.println(df.format(horas) + ":" + df.format(minutos) + ":" + df.format(segundos));
                }
                else {
                    horas = 0;
                    System.out.println(df.format(horas) + ":" + df.format(minutos) + ":" + df.format(segundos));
                }
            }
        }
    }
}