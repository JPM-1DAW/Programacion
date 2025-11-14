package EjerciciosCondicionales;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Indique el número: ");
        num = sc.nextInt();
        if (num < 0)
            {
                System.out.println("El numero es negativo.");
            }
        else
            {
                System.out.println("El numero es positivo.");
            }
    }
}