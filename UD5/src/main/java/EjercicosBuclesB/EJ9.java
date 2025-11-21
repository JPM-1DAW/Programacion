package EjercicosBuclesB;

import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean primo = true;
        int i = 2;
        System.out.print("Introduce un número positivo superior a 2: ");
        do {
            num = sc.nextInt();
            if (num < 2) {
                System.out.print("El número debe de ser superior a 2, vuelve a introducirlo: ");
            }
        } while (num < 2);

        while (i < num && primo) {
            if (num % i == 0) {
                primo = false;
            }
            i++;
        }
        if (primo) {
            System.out.println(num + " es primo");
        }
        else {
            System.out.println(num + " no es primo");
        }
    }
}