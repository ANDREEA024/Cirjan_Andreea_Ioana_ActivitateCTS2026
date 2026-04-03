package DP2026.ProblemeCTS.Restaurant.B4.clase;

public class Rezervare {
    private Client client;
    private int nrPersoane;

    public Rezervare(Client client, int nrPersoane) {
        this.client = client;
        this.nrPersoane = nrPersoane;
    }

    @Override
    public String toString() {
        return "Rezervare pentru " + client.getNume() + ", " + nrPersoane + " persoane." ;
    }
}