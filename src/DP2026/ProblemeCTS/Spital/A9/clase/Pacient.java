package DP2026.ProblemeCTS.Spital.A9.clase;

public class Pacient {
    private String nume;
    private String email;
    private boolean areAsigurare;

    public Pacient(String nume, String email, boolean areAsigurare) {
        this.nume = nume;
        this.areAsigurare = areAsigurare;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }
}
