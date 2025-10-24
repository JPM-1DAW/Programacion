package Ejercicios;

import java.util.Scanner;
import static java.lang.System.out;

public class Ej14 {
    public static void main(String[] args) {
        int num;
        int suma = 1;
        out.println("Indique el numero final de la operación: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        suma = (suma + (suma+1)) * num;
        out.println(suma);
    }
}