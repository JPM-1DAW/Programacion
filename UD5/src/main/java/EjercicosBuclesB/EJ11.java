package EjercicosBuclesB;

import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ANSI_RED = "\u001B[31m";
        int num;
        int numComp = 0;
        int cont = 1;
        int errores = 0;
        do {
            System.out.print("Número " + cont + ": ");
            num = sc.nextInt();
            if (num != 0) {
                if (num > numComp) {
                    cont++;
                }
                else {
                    errores++;
                    System.out.println(ANSI_RED + "Fallos");
                }
            }
        } while (num == 0);
    }
}