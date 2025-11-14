package EjerciciosCondicionales;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();
        if (num1 > num2)
            {
                System.out.println(num1 + " es mayor.");
            }
        else if (num2 > num1)
            {
                System.out.println(num2 + " es mayor.");
            }
        else
            {
                System.out.println("Ambos numeros son iguales.");
            }
    }
}
