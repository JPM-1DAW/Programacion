package Ejercicios6_2Entrega;

import java.util.ArrayList;
import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        String palabra;
        String[] palabras;

        ArrayList<String> palabrasUnicas = new ArrayList<>();
        ArrayList<ArrayList<Integer>> posiciones = new ArrayList<>();
        ArrayList<Integer> listaPos = new ArrayList<>();

        do {
            System.out.print("Introduce una frase: ");
            frase = sc.nextLine().trim();
        } while (frase.isEmpty());

        palabras = frase.split(" ");

        for (int i = 0; i < palabras.length; i++) {

            palabra = palabras[i];
            int indice = palabrasUnicas.indexOf(palabra);

            if (indice == -1) {
                palabrasUnicas.add(palabra);
                listaPos.add(i + 1);
                posiciones.add(listaPos);
            } else {
                posiciones.get(indice).add(i + 1);
            }
        }

        System.out.println("Posiciones de las palabras:");
        for (int i = 0; i < palabrasUnicas.size(); i++) {
            System.out.println(palabrasUnicas.get(i) + "=" + posiciones.get(i));
        }
    }
}