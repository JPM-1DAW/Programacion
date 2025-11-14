package EjerciciosBucles;

import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cont = 1;
        int num = 1;
        int suma;
        int prod;
        do {
            suma = num + cont;
            System.out.println(num + " + " + cont + " = " + suma);
            cont++;
            num++;
        } while (cont <= 10);
        cont = 1;
        num = 1;
        do  {
            prod = num * cont;
            System.out.println(num + " x " + cont + " = " + prod);
            cont++;
            num++;
        } while  (cont <= 10);
    }
}