package Ejercicios;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int FIN = 20;
        int numeros [];
        numeros = new int[FIN];
        int num;
        int sumaPos = 0;
        int sumaNeg = 0;
        for (int i = 1; i <= numeros.length; i++){
            System.out.print("Número " + i + ": ");
            num = sc.nextInt();
            numeros[i - 1] = num;
            if (numeros[i - 1] < 0){
                sumaNeg += numeros[i - 1];
            }
            else {
                sumaPos += numeros[i - 1];
            }
        }
        System.out.println("La suma de los números positivos es de: " + sumaPos);
        System.out.println("La suma de los números negativos es de: " + sumaNeg);
    }
}