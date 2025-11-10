package Ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");
        String nombre;
        int horasTrabajadas;
        double tarifa;
        double bruto;
        double neto;
        double tasas;
        System.out.print("Indique el nombre del trabajador: ");
        nombre = sc.nextLine();
        System.out.print("Indique la cantidad de horas trabajadas: ");
        horasTrabajadas = sc.nextInt();
        if (horasTrabajadas <= 0){
            System.out.println("Si no se trabaja no se cobra.");
        }
        else if (horasTrabajadas <= 35){
            System.out.print("Indique la tarifa por hora trabajada: ");
            tarifa = sc.nextInt();
            bruto = horasTrabajadas * tarifa;
            if (bruto <= 500){
                neto = bruto;
                tasas = bruto - neto;
                System.out.println("Por las " + horasTrabajadas + " a " + nombre + " le corresponde un salario bruto de " + df.format(bruto) + " y un neto de " + df.format(neto) + " tras aplicar " + df.format(tasas) + "euros de impuestos");
            }
            else if (bruto <= 900){
                neto = ((bruto - 500) * 0.75) + 500;
                tasas = bruto - neto;
                System.out.println("Por las " + horasTrabajadas + " a " + nombre + " le corresponde un salario bruto de " + df.format(bruto) + " y un neto de " + df.format(neto) + " tras aplicar " + df.format(tasas) + " euros de impuestos");
            }
            else {
                neto  = ((bruto - 900) * 0.55) + (400 * 0.75) + 500;
                tasas = bruto - neto;
                System.out.println("Por las " + horasTrabajadas + " a " + nombre + " le corresponde un salario bruto de " + df.format(bruto) + " y un neto de " + df.format(neto) + " tras aplicar " + df.format(tasas) + " euros de impuestos");
            }
        }
        else {
            System.out.print("Indique la tarifa por hora trabajada: ");
            tarifa = sc.nextInt();
            bruto =  horasTrabajadas * (tarifa * 1.5);
            if (bruto <= 500){
                neto = bruto;
                tasas = bruto - neto;
                System.out.println("Por las " + horasTrabajadas + " a " + nombre + " le corresponde un salario bruto de " + df.format(bruto) + " y un neto de " + df.format(neto) + " tras aplicar " + df.format(tasas) + " euros de impuestos");
            }
            else if (bruto <= 900){
                neto = ((bruto - 500) * 0.75) + 500;
                tasas = bruto - neto;
                System.out.println("Por las " + horasTrabajadas + " a " + nombre + " le corresponde un salario bruto de " + df.format(bruto) + " y un neto de " + df.format(neto) + " tras aplicar " + df.format(tasas) + " euros de impuestos");
            }
            else {
                neto = ((bruto - 900) * 0.55) + (400 * 0.75) + 500;
                tasas = bruto - neto;
                System.out.println("Por las " + horasTrabajadas + " a " + nombre + " le corresponde un salario bruto de " + df.format(bruto) + " y un neto de " + df.format(neto) + " tras aplicar " + df.format(tasas) + " euros de impuestos");
            }
        }
    }
}