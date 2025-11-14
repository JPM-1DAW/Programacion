package EjerciciosCondicionales;

import java.util.Scanner;

public class EJ17b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas;
        int minutos;
        int segundos;
        System.out.print("Introduce el número de horas: ");
        horas = sc.nextInt();
        if  (horas < 0 || horas > 23) {
            System.out.println("Número no valido");
        }
        else {
            System.out.print("Introduce el número de minutos: ");
            minutos = sc.nextInt();
            if (minutos < 0 || minutos > 59) {
                System.out.println("Número no valido.");
            }
            else {
                System.out.print("Introduce el número de segundos: ");
                segundos = sc.nextInt();
                if (segundos < 0 || segundos > 59) {
                    System.out.println("Número no valido.");
                }
                else {
                    segundos = segundos + 1;
                    if (segundos > 59) {
                        minutos = minutos + 1;
                        if (minutos > 59) {
                            horas = horas + 1;
                            if  (horas > 23) {
                                System.out.println("00:00:00");
                            }
                            else {
                                System.out.println(horas + ":00:00");
                            }
                        }
                        else {
                            System.out.println(horas + ":" + minutos + ":00");
                        }
                    }
                    else {
                        System.out.println(horas + ":" + minutos + ":" + segundos);
                    }
                }
            }
        }
    }
}
