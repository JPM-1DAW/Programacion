package EjerciciosC;

import java.util.Arrays;
import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_ESTATURAS = 10, NUM_PAISES = 4;
        String paises[];
        int alturas[][];
        String cabecera = "MED MIN MAX";
        int espacioscabecera;
        int nombrePaisMasLargo = 0;
        String nacion;
        int estatura;
        int suma;
        int media;
        int max;
        int min;
        paises = new String[NUM_PAISES];
        alturas = new int [NUM_PAISES][NUM_ESTATURAS];
        for (int i = 0; i < NUM_PAISES; i++) {
            System.out.print("Ingrese el " + (i + 1) + "º pais: ");
            nacion = sc.nextLine();
            paises[i] = nacion;
            if (paises[i].length() > nombrePaisMasLargo) {
                nombrePaisMasLargo = paises[i].length();
            }
            for (int j = 0; j < NUM_ESTATURAS; j++) {
                estatura = (140 + (int) (Math.random() * 70));
                alturas[i][j] = estatura;
            }
        }
        espacioscabecera = nombrePaisMasLargo + 2 + cabecera.length() + NUM_ESTATURAS * 3;
        System.out.println();
        for (int i = 0; i <= espacioscabecera; i++) {
            System.out.print(" ");
        }
        System.out.print(cabecera);
        System.out.println();
        for (int i = 0; i < NUM_PAISES; i++) {
            System.out.printf("%" + (nombrePaisMasLargo + 1) + "s", paises[i] + ":");
            suma = 0;
            max = alturas[i][0];
            min = alturas[i][0];
            for (int j = 0; j < NUM_ESTATURAS; j++) {
                System.out.printf("%4d", alturas[i][j]);
                suma  += alturas[i][j];
                if  (alturas[i][j] > max) {
                    max = alturas[i][j];
                }
                else if  (alturas[i][j] < min) {
                    min = alturas[i][j];
                }
            }
            media = suma / NUM_ESTATURAS;
            System.out.print(" |");
            System.out.printf(" %1d %2d %3d", media, min, max);
            System.out.println();
        }
    }
}