package Ejercicios;

import java.util.Scanner;

public class EJ16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.print("Indique la nota obtenida: ");
        nota = sc.nextDouble();
        if (nota < 0 || nota > 10)
            {
                System.out.println("Nota no valida");
            }
        else if (nota >= 0 && nota <3)
            {
                System.out.println("Muy deficiente");
            }
        else if (nota >= 3 && nota <5)
            {
                System.out.println("Insuficiente");
            }
        else if (nota >= 5 && nota <6)
            {
                System.out.println("Bien");
            }
        else if (nota >= 6 && nota <9)
            {
                System.out.println("Notable");
            }
        else
            {
                System.out.println("Sobresaliente");
            }
    }
}
