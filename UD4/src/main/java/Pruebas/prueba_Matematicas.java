package Pruebas;

import java.util.Scanner;

public class prueba_Matematicas {
    public static void main(String[] args) {
        int operacion;
        int num1;
        int num2;
        System.out.println("Aprende matemáticas con Java.");
        System.out.println("¿Qué operación desea realizar?");
        System.out.println("1. Suma.");
        System.out.println("2. Resta.");
        System.out.println("3. Multiplicación.");
        System.out.println("4. Division.");

        Scanner reader = new Scanner(System.in);
        operacion = reader.nextInt();

        if (operacion < 1 || operacion > 4) {
            System.out.println("Número no valido");
        }
            else {
            System.out.println("Indique el primer número: ");
            num1 = reader.nextInt();

            System.out.println("Indique el segundo número: ");
            num2 = reader.nextInt();

            if (operacion == 1) {
                Object suma = num1 + num2;
                System.out.println(suma);
            } else if (operacion == 2) {
                Object resta = num1 - num2;
                System.out.println(resta);
            } else if (operacion == 3) {
                Object multiplicacion = num1 * num2;
                System.out.println(multiplicacion);
            } else {
                Object division = num1 / num2;
                System.out.println(division);
            }
        }
    }
}