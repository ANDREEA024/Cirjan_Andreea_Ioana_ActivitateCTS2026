package DP2026.ProblemeCTS.Practica.Singleton.program;

public class Nava {

    private String numeNava;
    private int tonaj;
    private int nrMinuteAcostare;

    public Nava(String numeNava, int tonaj, int nrMinuteAcostare) {
        this.numeNava = numeNava;
        this.tonaj = tonaj;
        this.nrMinuteAcostare = nrMinuteAcostare;
    }

    public String getNumeNava() {
        return numeNava;
    }

    public int getTonaj() {
        return tonaj;
    }

    public int getNrMinuteAcostare() {
        return nrMinuteAcostare;
    }

    @Override
    public String toString() {
        return "Nava [numeNava=" + numeNava + ", tonaj=" + tonaj + ", nrMinuteAcostare=" + nrMinuteAcostare + "]";
    }
}