package Ejercicios;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        int radio;
        double longitud, area, volumen;
        System.out.print("Indique el radio del circulo: ");
        Scanner sc = new Scanner(System.in);
        radio = sc.nextInt();
        longitud = 2 *  Math.PI * radio;
        System.out.println("La longitud de la circunferencia de el circulo es: " + longitud);
        area = Math.pow(radio, 2) * Math.PI;
        System.out.println("El area del circulo es de: " + area);
        volumen = (4.0/3.0) * Math.PI * Math.pow(radio, 3);
        System.out.println("El volumen de la esfera es de: " + volumen);
    }
}
