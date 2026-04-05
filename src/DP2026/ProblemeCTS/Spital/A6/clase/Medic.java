package DP2026.ProblemeCTS.Spital.A6.clase;

public class Medic {
    private String numeMedic;

    public Medic(String nume) {
        this.numeMedic = nume;
    }

    public boolean confirmaInternarea(Pacient pacient) {
        return pacient.areStareGrava();
    }
}