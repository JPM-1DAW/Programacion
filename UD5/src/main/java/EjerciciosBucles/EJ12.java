package EjerciciosBucles;

import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int cont = 1;
        int resultado = 1;
        System.out.print("introduce el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextInt();
        do {
            resultado = resultado * num1;
            cont++;
        } while (cont <= num2);
        System.out.println("El resultado es: " + resultado);
    }
}