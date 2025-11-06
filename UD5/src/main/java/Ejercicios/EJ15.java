package Ejercicios;

import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;
        System.out.print("Introduzca el precio del pedido: ");
        precio = sc.nextDouble();
        if (precio < 0)
            {
                System.out.println("Precio no valido.");
            }
        else if (precio == 0)
            {
                System.out.println("No se puede aplicar nada si no compra nada");
            }
        else if (precio > 0 && precio < 50)
            {
                System.out.println("Se le aplicara un recargo por enivo de 5€");
            }
        else if (precio >= 50 &&  precio < 100)
            {
                System.out.println("Se le aplicara un descuento del 10%");
            }
        else
            {
                System.out.println("No se le aplicara ni un descuento ni un recargo por envio");
            }
    }
}