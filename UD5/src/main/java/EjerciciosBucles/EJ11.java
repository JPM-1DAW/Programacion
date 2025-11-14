package EjerciciosBucles;

import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaPar = 0;
        int sumaImpar = 0;
        int cont = 100;
        do {
            if (cont % 2 == 0) {
                sumaPar = sumaPar + cont;
            }
            else {
                sumaImpar = sumaImpar + cont;
            }
            cont++;
        } while (cont <= 200);
        System.out.println("La suma de los números pares es de: " + sumaPar);
        System.out.println("La suma de los nñumeros impares es de: " + sumaImpar);
    }
}