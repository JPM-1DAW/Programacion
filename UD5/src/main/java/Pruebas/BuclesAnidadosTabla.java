package Pruebas;

public class BuclesAnidadosTabla {
    public static void main(String[] args) {
        final int filas = 5;
        final int columnas = 5;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("*");
                if (j < columnas -1) {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}