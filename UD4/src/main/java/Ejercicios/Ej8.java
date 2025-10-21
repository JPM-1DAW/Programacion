package Ejercicios;

import javax.xml.stream.events.ProcessingInstruction;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        int radio;
        int altura;
        double volumen;
        System.out.println("Indique el radio del cono: ");
        Scanner sc = new Scanner(System.in);
        radio = sc.nextInt();
        System.out.println("Indique la altura del cono: ");
        altura = sc.nextInt();
        volumen = (1 / 3) * Math.PI * Math.pow(radio, 2) * altura;
        System.out.println("El volumen del cono es de: " + volumen);
    }
}