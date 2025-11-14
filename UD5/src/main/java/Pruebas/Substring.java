package Pruebas;

public class Substring {
    public static void main(String[] args) {
        String texto = "Hola Mundo";
        String sub1 = texto.substring(5, 7); // "Mundo"
        String sub2 = texto.substring(0, 4); // "Hola"
        System.out.println("Substring 1: " + sub1);
        System.out.println("Substring 2: " + sub2);
    }
}