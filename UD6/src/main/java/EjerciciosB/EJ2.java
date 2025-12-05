package EjerciciosB;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase1;
        String frase2;
        boolean iguales;
        System.out.print("Escribe la primera frase: ");
        frase1 = sc.nextLine();
        System.out.print("Escribe la segunda frase: ");
        frase2 = sc.nextLine();
        iguales = frase1.equalsIgnoreCase(frase2);
        if (iguales) {
            System.out.println("Las frases son iguales.");
        }
        else {
            System.out.println("Las frases no son iguales.");
        }
    }
}