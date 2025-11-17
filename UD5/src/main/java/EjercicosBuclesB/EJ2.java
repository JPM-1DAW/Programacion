package EjercicosBuclesB;

import java.time.Year;
import java.util.Scanner;

public class EJ2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int año;
        int añoActual = Year.now().getValue();
        int edad;
        System.out.print("¿En que año naciste? ");
        año = sc.nextInt();
        edad = añoActual - año;
        for (int i = 1; i <= edad; i++ ) {
            System.out.println("Has cumplido " + i + " años");
        }
    }
}
