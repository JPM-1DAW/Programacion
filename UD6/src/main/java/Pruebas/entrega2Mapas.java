package Pruebas;

import java.util.Scanner;
import java.util.ArrayList;

public class entrega2Mapas {

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
            frase = sc.nextLine();
        } while (frase.trim().isEmpty());

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

