package DP2026.ProblemeCTS.Spital.A7.clase;

import java.util.List;

public class RezultatMedicalPrintat implements IRezultatMedical {

    private String numePacient;
    private List<String> listaAnalizeEfectuate;
    private String diagnostic;

    public RezultatMedicalPrintat(String numePacient, List<String> listaAnalizeEfectuate, String diagnostic) {
        this.numePacient = numePacient;
        this.listaAnalizeEfectuate = listaAnalizeEfectuate;
        this.diagnostic = diagnostic;
    }

    @Override
    public void afiseazaRezultatMedical() {
        System.out.println("REZULTAT PRINTAT [pacient: " + numePacient + " analize: " + listaAnalizeEfectuate + " diagnostic: " + diagnostic + ".");
    }
}