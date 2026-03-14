package DP2026.Seminar.Mar14.cts.cirjan.andreea.as.factory.model;

public class BauturaCiocolataCalda implements Bautura {

    private String nume;
    private int volum;
    private double pret;

    public BauturaCiocolataCalda(String nume, int volum, float pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    public BauturaCiocolataCalda(int volum) {
        this.nume = ETipBautura.CIOCOLATA_CALDA.toString();
        this.volum = volum;
        this.pret = getPret();
    }

    @Override
    public void preparare() {
        System.out.println("Pentru " + nume + " se fierbe 100ml apa si se adauga plicul de ciocolata calda.");

    }

    @Override
    public String getDetalii() {
        return "Optiuni ciocolata calda: nescafe, nesquick";
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
        return "BauturaCiocolataCalda{" +
                "nume='" + nume + '\'' +
                ", volum=" + volum +
                ", pret=" + pret +
                '}';
    }
}
