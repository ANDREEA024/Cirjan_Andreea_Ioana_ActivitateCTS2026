package DP2026.ProblemeCTS.Restaurant.B5.clase;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AdapterSoftNouPrintareFacturiRestaurant implements ISoftPrintareFacturiRestaurant {
    private SoftNouBarRestaurant softNou;

    public AdapterSoftNouPrintareFacturiRestaurant(SoftNouBarRestaurant softNou) {
        this.softNou = softNou;
    }

    @Override
    public void printareFactura(String id, double total, String data) {
        System.out.println("[ADAPTER] Functia de la softul anterior foloseste noul format de printare..");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try {
            Factura factura = new Factura(id, total, sdf.parse(data));
            softNou.printareFacturaNoua(factura);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}