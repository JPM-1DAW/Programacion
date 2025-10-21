package Ejercicios;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        int base, altura, area;
        System.out.println("Indique la base del triangulo: ");
        Scanner sc = new Scanner(System.in);
        base = sc.nextInt();
        System.out.println("Indique la altura del triangulo: ");
        altura = sc.nextInt();
        area = (base * altura) / 2;
        System.out.println("El area del triangulo es de: " + area);
    }
}
