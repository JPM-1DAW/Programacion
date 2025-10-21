package Pruebas;

public class usoMath {
    public static void main(String[] args) {
        double a = 9.0, b = -4.7;

        //Raíz cuadrda y potencia
        System.out.println("√9 = " + Math.sqrt(a));
        System.out.println("2^5 = " + Math.pow(2, 5));

        //Valor absoluto y signo
        System.out.println("|-4.7| = " + Math.abs(b));
        System.out.println("Signo de -4.7 = " + Math.signum(b));

        //Redondeos
        System.out.println("floor (4.7) = " + Math.floor(4.7));
        System.out.println("ceiling (4.7) = " + Math.ceil(4.7));
        System.out.println("round (4.7) = " + Math.round(4.7));

        //Máximo, mínimo y modulo
        System.out.println("Max (9, -4.7) = " + Math.max(a, b));
        System.out.println("Min (-9, -4.7) = " + Math.min(a, b));
        System.out.println("9 % 4 = " +Math.floorMod(9, 4));

        //Números aeatorios
        System.out.println("Numero aleatorio (0, 1): " +Math.random());
        System.out.println("Numero aleatorio (1, 10): " + (1 + (int) (Math.random() * 10)));

        //Trigonometria (en radiantes)
        double angulo = Math.toRadians(30);
        System.out.println("sin(30º) = " + Math.sin(angulo));
        System.out.println("cos(30) = " + Math.cos(angulo));
        System.out.println("tan(30) = " + Math.tan(angulo));

        //Constantes
        System.out.println("π = " +Math.PI);
        System.out.println("e = " +Math.E);
    }
}
