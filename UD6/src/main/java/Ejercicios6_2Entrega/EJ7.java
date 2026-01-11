package Ejercicios6_2Entrega;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase;
        String[] palabras;

        ArrayList<String> cadena = new ArrayList<>();
        Set<String> repetidas = new TreeSet<>();
        Set<String> noRepetidas = new TreeSet<>();

        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();

        frase = frase.toLowerCase();

        palabras = frase.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            if (cadena.contains(palabras[i])) {
                repetidas.add(palabras[i]);
            } else {
                cadena.add(palabras[i]);
            }
        }

        for (int i = 0; i < cadena.size(); i++) {
            if (!repetidas.contains(cadena.get(i))) {
                noRepetidas.add(cadena.get(i));
            }
        }

        System.out.println("Palabras repetidas: " + repetidas);
        System.out.println("Palabras no repetidas: " + noRepetidas);
    }
}
