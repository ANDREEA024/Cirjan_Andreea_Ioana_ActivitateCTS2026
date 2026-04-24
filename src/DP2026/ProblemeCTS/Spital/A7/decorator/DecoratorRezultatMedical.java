package DP2026.ProblemeCTS.Spital.A7.decorator;

import DP2026.ProblemeCTS.Spital.A7.clase.IRezultatMedical;

public abstract class DecoratorRezultatMedical implements IRezultatMedical {

    protected IRezultatMedical rezultatMedical;

    public DecoratorRezultatMedical(IRezultatMedical rezultatMedical) {
        this.rezultatMedical = rezultatMedical;
    }

    @Override
    public void afiseazaRezultatMedical() {
        rezultatMedical.afiseazaRezultatMedical();
        afiseazaOnline();
    }

    public abstract void afiseazaOnline();
}
