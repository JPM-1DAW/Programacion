package EjerciciosB;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        String frase[];
        System.out.print("Escribe una frase: ");
        cadena = sc.nextLine();
        frase = cadena.split(" ");
        for (int i = 0; i < frase.length; i++) {
            System.out.println(frase[i]);
        }
    }
}