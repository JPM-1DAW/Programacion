package Mapas;

import java.util.*;

public class PosibleEJ5_examen {
    public static void main(String[] args) {
        LinkedHashMap<String,Double> cotiz= new LinkedHashMap<>();
        Set<Map.Entry<String, Double>> entradasMap =  cotiz.entrySet();

        double cambioMoneda = 0.96;
        double usd_eur;
        double valor;

        cotiz.put("nike", 76.01);
        cotiz.put("Apple", 249.95);
        cotiz.put("Ebay", 64.59);
        cotiz.put("Microsoft", 436.07);
        cotiz.put("Amazon", 223.09);
        cotiz.put("Adidas", 235.7);


        Iterator<Map.Entry<String, Double>> it = entradasMap.iterator();

        while (it.hasNext()) {
            Map.Entry<String, Double> entry = it.next();
            usd_eur = entry.getValue() * cambioMoneda;
            entry.setValue(usd_eur);
        }
        System.out.println("");
        System.out.println("Apartado b) ***********************************");
        System.out.println("Resultado: " + cotiz + "\n");

        Collection<Double> valoresCotiz = cotiz.values();
        for (Iterator<Double> itVal = valoresCotiz.iterator(); itVal.hasNext();) {
            valor = itVal.next();
            if (valor <= 250 && 200 <= valor) {
                itVal.remove();
            }
        }
        System.out.println("Apartado c) ***********************************");
        System.out.println("Resultado: " + cotiz + "\n");
    }
}