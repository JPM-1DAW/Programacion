package Ejercicios;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        //Imprime la tabla de multiplicar de un número. El número será introducido por el usuario.
        int num;
        System.out.println("Seleccione el numero del que desee ver la tabla de multiplicar: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("1 x " + num + " = " + num);
        System.out.println("2 x " + num + " = " + num*2);
        System.out.println("3 x " + num + " = " + num*3);
        System.out.println("4 x " + num + " = " + num*4);
        System.out.println("5 x " + num + " = " + num*5);
        System.out.println("6 x " + num + " = " + num*6);
        System.out.println("7 x " + num + " = " + num*7);
        System.out.println("8 x " + num + " = " + num*8);
        System.out.println("9 x " + num + " = " + num*9);
        System.out.println("10 x " + num + " = " + num*10);
    }
}
