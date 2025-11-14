package EjercicosBuclesB;

import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";
        int num;
        int numCompardor = 0;
        int numUsados = 0;
        int numValidos;
        int cont = 1;
        int errores = 0;
        do {
            do {
                System.out.print("Número " + cont + ": ");
                num = sc.nextInt();
                if (num != 0) {
                    if (num < 0) {
                        System.out.println(ANSI_RED + "No se aceptan números negativos, pruebe otra vez" + ANSI_RESET);
                    }
                    else if (num > numCompardor) {
                        cont++;
                    }
                    else {
                        errores++;
                        System.out.print(ANSI_RED);
                        System.out.println("Fallo! Errores: " + errores + ANSI_RESET);
                    }
                    numCompardor = num;
                    numUsados++;
                }
            } while (num < 0);
        } while (num != 0);
        numValidos = cont - 1;
        System.out.println("----------------------------------");
        System.out.println("Total de números introducidos: " + numUsados);
        System.out.println("Total de números válidos: " + numValidos);
        System.out.println("Total de fallos: " + errores);
    }
}