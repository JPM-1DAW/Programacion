package Ejercicios;

import java.util.*;

public class EJ5_Jorge {
    public static Map<Character, List<String>> filtrarPorVocal (List<String> lista) {
        char vocal;
        String vocales = "aeiou";

        Map<Character, List<String>> mapaVocales = new TreeMap<>();

        for (String empresa : lista) {
            vocal = Character.toLowerCase(empresa.charAt(0));

            if (vocales.indexOf(vocal) != -1) {

                if (!mapaVocales.containsKey(vocal)) {
                    mapaVocales.put(vocal, new ArrayList<>());
                }

                mapaVocales.get(vocal).add(empresa);
            }
        }

        for (List<String> lista2 : mapaVocales.values()) {
            Collections.sort(lista2);
        }

        return mapaVocales;
    }


    public static void main(String[] args) {
        List<String> empresas = Arrays.asList("Uber", "Inditex", "Apple", "Ikea", "Oracle", "Iberdrola", "Endesa", "Amazon", "Adobe");

        Map<Character, List<String>> mapa = filtrarPorVocal(empresas);

        System.out.println("Empresas agrupadas por vocal inicial y ordenadas alfabéticamente:");
        for (Map.Entry<Character, List<String>> entrada : mapa.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}