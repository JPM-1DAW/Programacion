package EjerciciosBucles;

import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nota;
        int cont = 1;
        boolean nota10 = false;
        do {
            System.out.print("Indique la "+ cont + "º nota (0-10): ");
            nota=sc.nextInt();
            if (nota < 0 && nota != -1 || nota > 10) {
                System.out.println("La nota debe ser entre 0 y 10.");
            }
            else if (nota == 10) {
                nota10 = true;
            }
            cont++;
        } while (nota != -1);
        if (nota10) {
            System.out.println("El programa ha leido un 10.\nEnhorabuena.");
        }
        else {
            System.out.println("El programa no ha leido ningún 10.\nQue pena.");
        }
    }
}