package EjerciciosCondicionales;

import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        String clave = "thebest";
        String key;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la contraseña: ");
        key = sc.nextLine();
        key = key.toLowerCase();
        if (key.equals(clave))
            {
                System.out.println("Contraseña correcta");
            }
        else
            {
                System.out.println("Contraseña incorrecta");
            }
    }
}