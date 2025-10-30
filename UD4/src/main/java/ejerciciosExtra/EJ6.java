package ejerciciosExtra;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número decimal: ");
        double num = input.nextDouble();
        DecimalFormat df = new DecimalFormat("#");
        System.out.println(num);
        df = new DecimalFormat("0.###");
        System.out.println(num);
    }
}
