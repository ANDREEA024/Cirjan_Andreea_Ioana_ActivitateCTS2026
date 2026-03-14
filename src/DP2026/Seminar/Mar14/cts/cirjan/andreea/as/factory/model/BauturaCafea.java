package DP2026.Seminar.Mar14.cts.cirjan.andreea.as.factory.model;

public class BauturaCafea implements Bautura {

    private String nume;
    private int volum;
    private double pret;

    public BauturaCafea(String nume, int volum, float pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    public BauturaCafea(int volum) {
        this.nume = ETipBautura.CAFEA.toString();
        this.volum = volum;
        this.pret = getPret();
    }

    @Override
    public void preparare() {
        System.out.println("Pentru " + nume + " se fierbe 100ml apa si se adauga cafeaua.");
    }

    @Override
    public String getDetalii() {
        return "Optiuni cafea: Dalmair, Gold";
    }

    @Override
    public double getPret() {
        return this.volum * 0.2;
    }

    public String getNume() {
        return nume;
    }

    public int getVolum() {
        return volum;
    }

    @Override
    public String toString() {
        return "BauturaCafea{" +
                "nume='" + nume + '\'' +
                ", volum=" + volum +
                ", pret=" + pret +
                '}';
    }
}
