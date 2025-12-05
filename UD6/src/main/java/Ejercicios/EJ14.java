package Ejercicios;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Arrays;
import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUMEROFINAL = 10;
        int finArray = 0;
        int numeros[];
        for (int i = 1; i <= NUMEROFINAL; i++) {
            finArray += i;
        }
        numeros = new int[finArray];
        int array = 0;
        for (int i = 1; i <= NUMEROFINAL; i++) {
            for (int j = 0; j < i; j++) {
                numeros[array] = i;
                array++;
            }
        }
        System.out.println(Arrays.toString(numeros));
    }
}