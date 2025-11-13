package EjerciciosExtra;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;
        System.out.print("Introduce el día: ");
        dia = sc.nextLine();
        switch (dia) {
            case "Lunes":
                System.out.println("A primera hora tenemos Programación");
                break;
            case "Martes":
                System.out.println("A primera hora tenemos Lenguaje de Marcas");
                break;
            case "Miercoles":
                System.out.println("A primera hora tenemos Inglés");
                break;
            case "Jueves":
                System.out.println("A primera hora tenemos Sistemas Informaticos");
                break;
            case "Viernes":
                System.out.println("A primera hora tenemos Entornos de desarrollo");
                break;
            default:
                System.out.println("No valido");
        }
    }
}