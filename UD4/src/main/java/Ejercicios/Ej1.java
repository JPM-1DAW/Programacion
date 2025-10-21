package Ejercicios;

public class Ej1 {
    public static void main(String[] args) {
        //Escribe un programa que muestre por pantalla las horas, minutos y segundos que tiene un año.
        int horas = 24;
        int minutos = 60;
        int segundos = 60;
        int diasAño = 365;
        horas = horas*diasAño;
        minutos = minutos*horas;
        segundos = segundos*minutos;
        System.out.printf("Un año tiene %,d horas, %,d minutos y %,d segundos.",  horas, minutos, segundos);
    }
}
