package EjercicosBuclesB;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNotas;
        double notas;
        double sumaNotas = 0;
        double media;
        System.out.print("Cuantas notas vas a introducir? ");
        numNotas = sc.nextInt();
        for (int i = 1; i <= numNotas; i++) {
            System.out.print("Dime nota " + i + ": ");
            notas = sc.nextDouble();
            sumaNotas += notas;
        }
        media = sumaNotas / numNotas;
        System.out.println("La media de todas las notas es de: " + media);
    }
}
