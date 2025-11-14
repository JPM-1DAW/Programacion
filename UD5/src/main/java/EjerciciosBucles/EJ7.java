package EjerciciosBucles;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int cont = 1;
        int pos = 0;
        int neg = 0;
        do  {
            System.out.print("Indique el " + cont + "º número: ");
            num = sc.nextInt();
            if (num < 0) {
                neg++;
            }
            else  {
                pos++;
            }
            cont++;
        } while (cont <= 10);
        System.out.println("Hay: " + pos + " números positivos y " + neg + "números negativos.");
    }
}