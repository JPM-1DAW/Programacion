package Ejercicios;

import java.util.Scanner;

public class EJ18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pizza;
        int ingre;
        System.out.println("¡Bienvenido a la pizzeria BELLA NAPOLI!\n" +
                "Tipos de pizza: \n" +
                "\t1 - Vegetariana\n " +
                "\t2 - No vegetariana ");
        System.out.print("Introduce el número correspondiente al tipo de pizza que quieres: ");
        pizza = sc.nextInt();
        if (pizza <1 || pizza > 2){
            System.out.println("Número no valido.\n Finalizando programa");
        }
        else if (pizza == 1){
            System.out.println("\nIngredientes de la pizza vegetariana:\n" +
                    "\t1 - Pimiento\n" +
                    "\t2 - Tofu");
            System.out.print("Introduce el inggrediente que deseas: ");
            ingre = sc.nextInt();
            if (ingre < 1 || ingre > 2){
                System.out.println("Ingredientes no valido.\n Finalizando programa");
            }
            else if (ingre == 1) {
                System.out.println("Has elegido la pizza vegetariana con tomate, mozzarella y pimiento");
            }
            else {
                System.out.println("Has elegido la pizza vegetariana con tomate, mozzarella y tofu");
            }
        }
        else {
            System.out.println("\nIngredientes de la pizza no vegetariana:\n" +
                    "\t1 - Peperoni\n" +
                    "\t2 - Jamón\n" +
                    "\t3 - Salmón");
            System.out.print("Introduce el ingrediente que deseas: ");
            ingre = sc.nextInt();
            if (ingre < 1 || ingre > 3){
                System.out.println("Ingredientes no valido.\n Finalizando programa");
            }
            else if (ingre == 1) {
                System.out.println("Has elegido la pizza no vegetariana con tomate, mozzarella y peperoni");
            }
            else if (ingre == 2) {
                System.out.println("Has elegido la pizza no vegetariana con tomate, mozzarella y jamón");
            }
            else {
                System.out.println("Has elegido la pizza no vegetariana con tomate, mozzarella y salmón");
            }
        }
    }
}