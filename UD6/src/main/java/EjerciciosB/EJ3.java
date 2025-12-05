package EjerciciosB;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nombre;
        String apellido1;
        String apellido2;
        String codNom;
        String codAp1;
        String codAp2;
        String codigo;
        System.out.print("Indique su nombre: ");
        nombre = sc.nextLine();
        System.out.print("Indique su primer apellido: ");
        apellido1 = sc.nextLine();
        System.out.print("Indique su segundo apellido: ");
        apellido2 = sc.nextLine();
        codNom = nombre.substring(0, 3).toUpperCase();
        codAp1 = apellido1.substring(0, 3).toUpperCase();
        codAp2 = apellido2.substring(0, 3).toUpperCase();
        codigo = codNom + codAp1 + codAp2;
        System.out.println("Su codigo es: " + codigo);
    }
}