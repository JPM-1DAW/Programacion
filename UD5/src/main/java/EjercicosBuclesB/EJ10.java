package EjercicosBuclesB;

import java.util.Scanner;

public class EJ10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String frase;
        char letra;
        int cont = 0;
        System.out.print("Introduce la frase: ");
        frase = sc.nextLine();
        System.out.print("Introduce uns letra: ");
        letra = sc.next().charAt(0);
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                cont++;
            }
        }
        System.out.println("La letra '" + letra + "' aparece " + cont + " veces en la frase '" + frase + "'");
    }
}