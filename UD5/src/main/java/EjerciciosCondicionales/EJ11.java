package EjerciciosCondicionales;

import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        double temp;
        double conversion;
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.print("1. De Celsius a Fahrenheit\n2. De Fahrenheit a Celsius\n3. De Celsius a Kelvin\n¿Que conversión desea realizar? ");
        opcion = sc.nextInt();
        if (opcion <1 || opcion >3)
            {
                System.out.println("Error. El número debe estar entre 1 y 3");
            }
        else {
            System.out.print("Indique la temperatura: ");
            temp = sc.nextDouble();
            DecimalFormat df = new DecimalFormat("0.##");
            switch (opcion) {
                case 1:
                    conversion = (temp * 1.8) + 32;
                    System.out.println(df.format(temp) + " grados Celsius son " + df.format(conversion) + " grados Fahrenheit");
                    break;
                case 2:
                    conversion = (temp - 32) * (5 / 9); //La división 5 / 9 no es entera
                    System.out.println(df.format(temp) + " grados Fahrenheit son " + df.format(conversion) + " grados Celsius");
                    break;
                case 3:
                    conversion = temp + 273.15;
                    System.out.println(df.format(temp) + " grados Celsius son " + df.format(conversion) + " grados Kelvin");
                    break;
            }
        }
    }
}