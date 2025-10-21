package Ejercicios;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        int num1, num2;
        int suma, resta, producto, division;
        Scanner sc = new Scanner(System.in);
        System.out.print("Indique el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Indique el segundo numero: ");
        num2 = sc.nextInt();
        suma = num1 + num2;
        resta = num1 - num2;
        division = num1 * num2;
        producto = num1 * num2;
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado del producto es: " + producto);
        System.out.println("El resultado de la división es: " + division);
    }
}
