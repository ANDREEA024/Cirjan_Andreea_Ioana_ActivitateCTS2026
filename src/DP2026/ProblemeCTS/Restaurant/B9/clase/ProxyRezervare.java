package DP2026.ProblemeCTS.Restaurant.B9.clase;

public class ProxyRezervare implements IRezervare {

    private Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizeazaRezervare() {
        if (rezervare.getNrPersoane() >= 4) {
            rezervare.realizeazaRezervare();
        } else {
            System.out.println("CLIENT: [" + rezervare.getClient().getNume() + "], REZERVARE: [NU este necesara pentru " + rezervare.getNrPersoane() + " persoane]");
        }
    }
}
