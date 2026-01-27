package Ejercicios;

import java.util.*;

public class EJ7_Jorge {

    public static List<String> validarInventario(Map<String, Integer> inventario) {
        int cantidad;
        String nombre;

        List<String> listaErrores = new ArrayList<>();

        for (Map.Entry<String, Integer> entrada : inventario.entrySet()) {
            nombre = entrada.getKey();
            cantidad = entrada.getValue();

            if (nombre == " " || nombre.trim().isEmpty()) {
                listaErrores.add("-> Nombre inválido para un producto con cantidad: " + cantidad);
            }

            if (cantidad < 0 || cantidad > 100) {
                listaErrores.add("-> Cantidad inválida para el producto: '" + nombre + "'");
            }
        }
        return listaErrores;
    }

    public static void main(String[] args) {
        Map<String, Integer> inventario = new LinkedHashMap<>();
        inventario.put("SSD", 50);
        inventario.put("Tarjeta gráfica", -10);
        inventario.put("Memoria RAM", 30);
        inventario.put("Procesador", 0);
        inventario.put("Pantalla", 101);
        inventario.put("", 15);
        /*
        inventario.put("SSD", -50);
        inventario.put("Tarjeta gráfica", 10);
        inventario.put("Memoria RAM", 101);
        inventario.put("", 100);
        inventario.put("", -5);
        inventario.put("", 101);
        inventario.put("Procesador", 15);
        */

        List<String> errores = validarInventario(inventario);

        System.out.println("Ejecución de la entrada 1:\n");
        if (!errores.isEmpty()) {
            System.out.println("El inventario contiene los siguientes errores:");

            for (String e : errores) {
                System.out.println(e);
            }
        }
    }
}