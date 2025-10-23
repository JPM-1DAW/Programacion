package Ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ19 {
    public static void main(String[] args) {
        double cant, inte, meses, capital;
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad a invertir: ");
        cant = sc.nextInt();
        System.out.print("Interes porcentual anual: ");
        inte = sc.nextInt();
        System.out.print("Duración de la inversion en meses: ");
        meses = sc.nextInt();
        capital = cant + ((meses / 12) * inte);
        DecimalFormat df = new DecimalFormat("##.##");
        System.out.println("Capital final: " + df.format(capital));
    }
}
