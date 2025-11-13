package EjerciciosBucles;

import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int cont = 1;
        boolean negativo = false;
        do {
            System.out.print("Introduzca el " + cont + "º número: ");
            num = sc.nextInt();
            if (num < 0) {
                negativo = true;
            }
            cont++;
        } while (cont <= 100);
        if (negativo == true) {
            System.out.println("Se ha leido minimo un número negativo.");
        }
        else {
            System.out.println("No se ha leido ning´n número negativo.");
        }
    }
}