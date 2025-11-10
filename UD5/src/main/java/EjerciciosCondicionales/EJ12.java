package EjerciciosCondicionales;

import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String genero;
        System.out.print("¿Cómo te llamas? ");
        nombre = sc.nextLine();
        System.out.print("¿Cuál es tu género? (H o M) ");
        genero = sc.nextLine();
        nombre = nombre.toUpperCase();
        genero = genero.toUpperCase();
        if (genero.equals("H"))
            {
                char n = nombre.charAt(0);
                if (n >= 'N' && n <= 'Z')
                    {
                        System.out.println("Tu grupo es A");
                    }
                else
                    {
                        System.out.println("Tu grupo es B");
                    }
            }
        else if (genero.equals("M"))
            {
                char n = nombre.charAt(0);
                if (n >= 'A' && n <= 'M')
                    {
                        System.out.println("Tu grupo es A");
                    }
                else
                    {
                        System.out.println("Tu grupo es B");
                    }
            }
    }
}