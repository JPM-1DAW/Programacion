package Mapas;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        String producto;
        double precio;

        HashMap<String, Double> productos = new HashMap<>();

        do {
            System.out.println("Gestión de productos\n" +
                    "1. Introducir un producto\n" +
                    "2. Modificar el precio de un producto\n" +
                    "3. Eliminar un producto\n" +
                    "4. Mostrar todos los productos\n" +
                    "5. Salir");

            do {
                System.out.print("Elige una opción: ");
                opcion = sc.nextInt();
                if  (opcion < 1 || opcion > 5) {
                    System.out.println("Opción no valida.");
                }
            } while (opcion < 1 || opcion > 5);

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del producto: ");
                    producto = sc.nextLine();

                    System.out.println("Introduce el precio del producto: ");
                    precio = sc.nextDouble();

                    productos.put(producto, precio);

                    System.out.println("Producto añadido correctamente.");
                    break;

                case 2:
                    System.out.print("Introduce el nombre del producto: ");
                    producto = sc.nextLine();


                    if (productos.containsKey(producto)) {
                        System.out.print("Indique el nuevo precio: ");
                        precio = sc.nextDouble();

                        productos.put(producto, precio);

                        System.out.println("Producto modificado correctamente.");
                    }
                    else {
                        System.out.println("El producto no existe.");
                    }

                    break;

                case 3:
                    System.out.print("Introduce el nombre del producto a eliminar: ");
                    producto = sc.nextLine();

                    if (productos.containsKey(producto)) {
                        productos.remove(producto);
                        System.out.println("Producto eliminado correctamente.");
                    }
                    else {
                        System.out.println("El producto no existe.");
                    }
                    break;
                case 4:
                    if (productos.isEmpty()) {
                        System.out.println("El listado de productos esta vacio.");
                    }
                    else {
                        System.out.println("Listado de productos:");
                        DecimalFormat df = new DecimalFormat("0.00");
                        for (Map.Entry<String, Double> entry : productos.entrySet()) {
                            System.out.println(entry.getKey() + " - " + df.format(entry.getValue()) + "€");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa.....");
                    break;
            }
        } while (opcion != 5);
    }
}