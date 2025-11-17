package EjercicosBuclesB;

import java.util.Scanner;

public class EJ5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        for (int i = 1; i <= 5; i++) {
            suma += i * i;
        }
        System.out.println("La suma de los cuadrados es " + suma);
    }
}
