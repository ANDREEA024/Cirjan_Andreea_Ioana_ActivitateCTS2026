package DP2026.ProblemeCTS.Restaurant.B5.program;

import DP2026.ProblemeCTS.Restaurant.B5.clase.*;

public class Program {

    public static void main(String[] args) {

        System.out.println("_______ SOFT VECHI _______");
        ISoftPrintareFacturiRestaurant softVechi = new SoftPrintareFacturiRestaurant();
        softVechi.printareFactura("FR579HYTFU", 246.2, "03/04/2026 22:35");

        System.out.println("\n_______ SOFT NOU _______");
        SoftNouBarRestaurant softNou = new SoftNouBarRestaurant();
        softNou.printareFacturaNoua(
                new Factura("FR579HYTFU", 246.2, new java.util.Date())
        );

        System.out.println("\n_______ SOFT NOU + ADAPTER _______");
        ISoftPrintareFacturiRestaurant softAdaptat =
                new AdapterSoftNouPrintareFacturiRestaurant(softNou);

        softAdaptat.printareFactura("FR579HYTFU", 246.2, "03/04/2026 22:35");
    }
}