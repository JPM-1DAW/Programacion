package Pruebas;

public class usoPrintf {
    public static void main(String[] args) {

        // Ejemplo printf
        int n1 = 2;
        int cuadrado = n1 * n1;
        //System.out.printf("El cuadrado de %1$d es %2$.2f%n", n1, cuadrado);
        System.out.printf("El cuñado de %s tiene %d años%n", "Pepito", 30);
        System.out.printf("%2$s son los metros que tiene el %1$d%n", 8000, "Everest");





        String nombre = "Ana";
        int edad = 20;
        double nota = 8.756;
        int poblacion = 1234567;

        // Formatos básicos
        System.out.printf("Nombre: %s, Edad: %d, Nota: %.2f%n", nombre, edad, nota);

        // Alineación y ancho (posiciones que ocupa se rellenan con espacios a la izquierda)
        System.out.printf("|%10s|%5d|%8.2f|%n", "Producto", 5, 12.3);

        // Alineación a la izquierda
        System.out.printf("|%-10s|%-5d|%-8.2f|%n", "Peras", 12, 2.35);

        // Relleno con ceros (incluyendo 9 posiciones totales incluyendo el punto decimal)
        System.out.printf("Precio con ceros: %09.2f%n", 12.3);

        // Separado de miles
        System.out.printf("Población: %,d habitantes%n", poblacion);

        // Mostrar siempre el signo y negativos netre parentesis
        System.out.printf("Signos: %+d | %+d y negativos con parentesis: %(d%n", 42, -42, -42);

        // Usar un mismo argunemto varias veces (simbolo 1$ 2$ 3$ ...)
        System.out.printf("Nota %1$.2f repetida: %1$.3f%n", nota);

        //Ejemplo ejercicio
        String mayor = "Mayor";
        System.out.printf("%1$s en mayuscula es '%1$S'%n", mayor);
    }
}