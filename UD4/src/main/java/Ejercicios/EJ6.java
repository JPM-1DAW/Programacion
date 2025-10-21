package Ejercicios;

import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        int area;
        int lado;
        System.out.println("Indique la longitud de los lado: ");
        Scanner sc = new Scanner(System.in);
        lado = sc.nextInt();
        area = lado * lado;
        System.out.println("El area del cuadrado es de: " + area);
    }
}
