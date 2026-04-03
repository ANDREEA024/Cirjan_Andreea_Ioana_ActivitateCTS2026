package DP2026.ProblemeCTS.Restaurant.B5.clase;

public class SoftPrintareFacturiRestaurant implements ISoftPrintareFacturiRestaurant {

    @Override
    public void printareFactura(String id, double total, String data) {
        System.out.println("[SoftPrintareFacturiRestaurant] Printare factura în vechiul format..");
        System.out.println("Factura: [" + id + ", " + total + ", " + data + "]\n");
    }
}
