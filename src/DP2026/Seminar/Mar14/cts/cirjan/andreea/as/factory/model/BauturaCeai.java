package DP2026.Seminar.Mar14.cts.cirjan.andreea.as.factory.model;

public class BauturaCeai implements Bautura {

    private String nume;
    private int volum;
    private double pret;

    public BauturaCeai(String nume, int volum, float pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    public BauturaCeai(int volum) {
        this.nume = ETipBautura.CEAI.toString();
        this.volum = volum;
        this.pret = getPret();
    }

    @Override
    public void preparare() {
        System.out.println("Pentru " + nume + " se fierbe 100ml apa si se adauga plicul de ceai.");
    }

    @Override
    public String getDetalii() {
        return "Optiuni ceai: menta, lavanda, ghimbir";
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
        return "BauturaCeai{" +
                "nume='" + nume + '\'' +
                ", volum=" + volum +
                ", pret=" + pret +
                '}';
    }
}
