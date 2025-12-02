package EjerciciosC;

import java.util.Arrays;
import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_ESTATURAS = 10, NUM_PAISES = 4;
        String paises[];
        int alturas[][];
        String nacion;
        int estatura, media, max, min;
        paises = new String[NUM_PAISES];
        alturas = new int [NUM_PAISES][NUM_ESTATURAS];
        for (int i = 0; i < NUM_PAISES; i++) {
            System.out.print("Ingrese el " + (i + 1) + "º pais: ");
            nacion = sc.nextLine();
            paises[i] = nacion;
            for (int j = 0; j < NUM_ESTATURAS; j++) {
                estatura = (140 + (int) (Math.random() * 70));
                alturas[i][j] = estatura;
            }
        }
        for (int i = 0; i < NUM_PAISES; i++) {
            System.out.printf("%s", paises[i]);
            for (int j = 0; j < NUM_ESTATURAS; j++) {
                System.out.printf(" %d", alturas[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < alturas.length; i++) {
            Arrays.sort(alturas[i]);
        }
    }
}