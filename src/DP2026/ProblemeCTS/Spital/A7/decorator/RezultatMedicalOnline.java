package DP2026.ProblemeCTS.Spital.A7.decorator;

import DP2026.ProblemeCTS.Spital.A7.clase.IRezultatMedical;

public class RezultatMedicalOnline extends DecoratorRezultatMedical {

    public RezultatMedicalOnline(IRezultatMedical rezultatMedical) {
        super(rezultatMedical);
    }

    @Override
    public void afiseazaOnline() {
        System.out.println("Rezultat disponibil si pe platforma online folosind link-ul de mai jos.");
    }
}
