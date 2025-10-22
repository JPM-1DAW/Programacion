package Ejercicios;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        int millas;
        int metros;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique la cantidad de millas del que desee saber la equivalencia: ");
        millas = sc.nextInt();
        metros = millas*1852;
        System.out.println(millas + " millas marinas equivalen a " + metros + " metros.");
    }
}
