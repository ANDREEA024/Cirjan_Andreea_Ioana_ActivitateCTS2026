package DP2026.ProblemeCTS.Spital.A6.clase;

public class Pacient {
    private String nume;
    private boolean esteStareGrava;

    public Pacient(String nume, boolean stareGrava) {
        this.nume = nume;
        this.esteStareGrava = stareGrava;
    }

    public boolean areStareGrava() {
        return esteStareGrava;
    }

    public String getNume() {
        return nume;
    }
}