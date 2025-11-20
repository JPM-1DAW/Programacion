package EjercicosBuclesB;

import java.util.Scanner;

public class EJ1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String palabra;
        int largura;
        int repetir;
        System.out.print("Introduce una palabra: ");
        palabra = sc.nextLine();
        largura = palabra.length();
        repetir = largura / 2;
        for (int i = 0; i < repetir; i++) {
            System.out.println(palabra);
        }
    }
}