package Ejercicios;

import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        double salario;
        System.out.print("Introduce tu edad: ");
        edad = sc.nextInt();
        System.out.print("Introduce tu salario: ");
        salario = sc.nextDouble();
        if (edad > 16 && salario >=1000){
            System.out.println("Tienes que tributar");
            }
        else {
                System.out.println("No tienes que tributar");
            }
    }
}