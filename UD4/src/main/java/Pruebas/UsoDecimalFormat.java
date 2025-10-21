package Pruebas;

import java.text.DecimalFormat;

public class UsoDecimalFormat {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("####.##");
        System.out.println(df.format(10.43456458));

        df = new DecimalFormat("0000.00");
        System.out.println(df.format(10.4));

        df = new DecimalFormat("###.##%");
        System.out.println(df.format(0.3444));

        double a = 1.2345;
        double b = 1.2356;
        df = new DecimalFormat("#.##");
        System.out.println(df.format(a));
        System.out.println(df.format(b));
    }
}
