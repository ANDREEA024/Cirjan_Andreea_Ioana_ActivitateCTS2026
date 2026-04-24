package DP2026.ProblemeCTS.Spital.A7.program;

import DP2026.ProblemeCTS.Spital.A7.clase.RezultatMedicalPrintat;
import DP2026.ProblemeCTS.Spital.A7.decorator.DecoratorRezultatMedical;
import DP2026.ProblemeCTS.Spital.A7.decorator.RezultatMedicalOnline;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        RezultatMedicalPrintat rezultat = new RezultatMedicalPrintat("Andreea Cîrjan", Arrays.asList("glicemie", "colesterol"), "valorile sunt în limite normale");
        rezultat.afiseazaRezultatMedical();
        System.out.println();

        DecoratorRezultatMedical rezultatOnline = new RezultatMedicalOnline(rezultat);
        rezultatOnline.afiseazaRezultatMedical();
    }
}
