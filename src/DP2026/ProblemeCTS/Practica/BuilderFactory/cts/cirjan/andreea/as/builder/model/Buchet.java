package DP2026.ProblemeCTS.Practica.BuilderFactory.cts.cirjan.andreea.as.builder.model;

import java.util.ArrayList;
import java.util.List;

public class Buchet extends ABuchet {

    public Buchet(ETipAmbalaj tipAmbalaj, int numarFlori, ETipFloare floarePrincipala, String culoareDominanta, List<ETipFloare> floriSuplimentare, List<String> mesajePersonalizate, List<ETipDecoratiune> decoratiuni) {
        this.tipAmbalaj = tipAmbalaj;
        this.numarFlori = numarFlori;
        this.floarePrincipala = floarePrincipala;
        this.culoareDominanta = culoareDominanta;

        this.floriSuplimentare = new ArrayList<>(floriSuplimentare);
        this.mesajePersonalizate = new ArrayList<>(mesajePersonalizate);
        this.decoratiuni = new ArrayList<>(decoratiuni);
    }

    @Override
    public float calculPret() {
        float pret  = 10 * numarFlori;
        pret += floriSuplimentare.size() * 5 * decoratiuni.size() * 3 + mesajePersonalizate.size() * 4;
        return pret;
    }

    @Override
    public void addFloareSuplimentara(ETipFloare floare) {
        throw new UnsupportedOperationException("Buchetul nu se modifica dupa creare.");
    }

    @Override
    public void addDecoratiune(String decoratiune) {
        throw new UnsupportedOperationException("Buchetul nu se modifica dupa creare.");
    }

    @Override
    public void addMesaj(String mesaj) {
        throw new UnsupportedOperationException("Buchetul nu se modifica dupa creare.");
    }

    @Override
    public String toString() {
        return "Buchet{" +
                "tipAmbalaj=" + tipAmbalaj +
                ", numarFlori=" + numarFlori +
                ", floarePrincipala=" + floarePrincipala +
                ", culoareDominanta='" + culoareDominanta + '\'' +
                ", floriSuplimentare=" + floriSuplimentare +
                ", mesajePersonalizate=" + mesajePersonalizate +
                ", decoratiuni=" + decoratiuni +
                '}';
    }
}
