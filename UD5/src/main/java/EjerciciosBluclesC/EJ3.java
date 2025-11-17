package EjerciciosBluclesC;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario = "Progra";
        String contraseña = "macion";
        String usu;
        String con;
        int cont = 1;
        boolean acceder = false;
        do  {
            System.out.print("Ingrese su usuario: ");
            usu =  sc.nextLine();
            System.out.print("Ingrese la contraseña: ");
            con = sc.nextLine();
            cont++;
            if (usu.equals(usuario) && con.equals(contraseña)) {
                acceder = true;
            }
            else  {
                System.out.println("Usuario o contraseña incorrecto. Vuelva a intentarlo.");
            }
        } while (!acceder || cont == 3);
        if (!acceder) {
            System.out.println("Superado el numero de intentos permitidos.");
        }
        else {
            System.out.println("Bienvenido al sistema");
        }
    }
}