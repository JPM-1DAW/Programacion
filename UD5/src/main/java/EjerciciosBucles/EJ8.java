package EjerciciosBucles;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int cont = 1;
        int numneg = 0;
        int numpos = 0;
        boolean neg = false;
        do {
            System.out.print("Indique el " + cont + "º número: ");
            num = sc.nextInt();
            if (num < 0) {
                neg = true;
                numneg++;
            }
            else  {
                numpos++;
            }
            cont++;
        } while (num != 0);
        if (neg == true) {
            System.out.println("El programa ha leido " + numneg + " números negativos y " + numpos + " números positivos");
        }
        else {
            System.out.println("El programa no ha leido ningún número negativo y "+ numpos + " números positivos");
        }
    }
}