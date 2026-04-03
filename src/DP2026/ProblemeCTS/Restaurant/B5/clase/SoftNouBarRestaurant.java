package DP2026.ProblemeCTS.Restaurant.B5.clase;

public class SoftNouBarRestaurant implements ISoftNouBarRestaurant {

    @Override
    public void afisareDetalii() {
        System.out.println("[SoftNouBarRestaurant]\n - achiziționat în data de 04/03/2026\n - nume companie: Abgr\n");
    }

    public void printareFacturaNoua(Factura factura) {
        System.out.println("[SoftNouBarRestaurant] Printare factura în format nou:\n" +
                "Factura [ID: " + factura.getIdFactura() +
                ", TOTAL: " + factura.getTotalFactura() +
                " lei, DATA EMITERE: " + factura.getDataEmitereFactura() + "]\n");
    }
}
