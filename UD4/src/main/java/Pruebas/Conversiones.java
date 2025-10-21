package Pruebas;

import java.sql.SQLOutput;

public class Conversiones {
    public static void main(String[] args) {

        // De int a char
        char a = (char) 500;
        System.out.println(a);

        // De float a char
        char b = (char) 2000.53f;
        System.out.println(b);

        // De float a int
        int c = (int) 14.67565f;
        System.out.println(c);

        // Formas de convertir variables a String (Concatenar cadena vacia)
        String v1 = "" + 'a';
        String v2 = "" + 865;
        String v3 = "" + 23.78f;
        boolean encontrado = true;
        String v4 = "" + encontrado;
        System.out.printf("%s / %s / %s / %s%n", v1, v2, v3, v4);

        // Formas de convertir variables a string (función valueOf)
        String v5 = String.valueOf('a');
        String v6 = String.valueOf(865);
        String v7 = String.valueOf(23.78f);
        String v8 = String.valueOf(encontrado);
        System.out.printf("%s / %s / %s / %s%n", v5, v6, v7, v8);

        // No se puede convertir String a Char, pero si extraer caracteres de una
        //determinada posición
        char v = "Viernes".charAt(0);
        char l = "Lunes".charAt(4);
        System.out.println("Ejemplo charAt: " + v + " " + l);

        // Conocer longitud de un String
        String var10 = "HOLA COMO ESTAS";
        System.out.println("LENGTH VAR10: " + var10.length());

        //parseInt() y parseFloat()
        String n1 = "213";
        int n11 = Integer.parseInt(n1);

        String n2 = "23.78";
        Float n22 = Float.parseFloat(n2);
        System.out.println("Ejemplos parseInt: " + n11 + " y parseFloat: " + n22);
    }
}