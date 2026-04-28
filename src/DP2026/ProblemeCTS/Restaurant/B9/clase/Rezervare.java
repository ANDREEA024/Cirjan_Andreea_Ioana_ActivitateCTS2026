package DP2026.ProblemeCTS.Restaurant.B9.clase;

public class Rezervare implements IRezervare {

    private Client client;
    private int nrPersoane;

    public Rezervare(Client client, int nrPersoane) {
        this.client = client;
        this.nrPersoane = nrPersoane;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public void realizeazaRezervare() {
        System.out.println("CLIENT: [" + client.getNume() +
                "], REZERVARE: [pentru " + nrPersoane + " persoane]");
    }
}
