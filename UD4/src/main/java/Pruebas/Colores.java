package Pruebas;

public class Colores {
    static void main(String[] args) {
        String ANSI_BLACK = "\u001B[30m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_CYAN = "\u001B[36m";
        String ANSI_WHITE = "\u001B[37m";

        System.out.println(ANSI_BLACK + "Texto de color negro");
        System.out.println(ANSI_RED + "Texto de color rojo");
        System.out.println(ANSI_GREEN + "Texto de color verde");
        System.out.println(ANSI_YELLOW + "Texto de color amarillo");
        System.out.println(ANSI_BLUE + "Texto de color azul");
        System.out.println(ANSI_PURPLE + "Texto de color morado");
        System.out.println(ANSI_WHITE + "Texto de color blanco");
        System.out.println(ANSI_CYAN + "Texto de color cyan");
        System.out.println("------------------------------------------------------------");
        System.out.println(ANSI_GREEN);
        System.out.println("ESCRIBO EN VERDE");
        System.out.println("SIGO ESCRIBIENDO EN VERDE PORQUE NO HE CAMBIADO DE COLOR");
        System.out.println(ANSI_BLUE + "CAMBIO A AZUL");
        System.out.println("SIGO ESCRIBIENDO EN AZUL HASTA QUE VUELVA A CAMBIAR DE COLOR");
        System.out.println("AZUL");
        System.out.println("AZUL");
        System.out.println("AZUL");
        System.out.println(ANSI_RED + "CAMBIO A ROJO");
    }
}