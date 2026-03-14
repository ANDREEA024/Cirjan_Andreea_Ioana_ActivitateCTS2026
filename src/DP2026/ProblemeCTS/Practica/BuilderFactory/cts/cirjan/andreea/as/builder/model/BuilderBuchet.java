package DP2026.ProblemeCTS.Practica.BuilderFactory.cts.cirjan.andreea.as.builder.model;

import java.util.ArrayList;
import java.util.List;

public class BuilderBuchet implements IBuilderBuchet {

    protected ETipAmbalaj tipAmbalaj;
    protected int numarFlori;
    protected ETipFloare floarePrincipala;
    protected String culoareDominanta;

    protected List<ETipFloare> floriSuplimentare;
    protected List<String> mesajePersonalizate;
    protected List<ETipDecoratiune> decoratiuni;

    public BuilderBuchet() {
        this.floriSuplimentare = new ArrayList<>();
        this.mesajePersonalizate = new ArrayList<>();
        this.decoratiuni = new ArrayList<>();
    }

    public BuilderBuchet setTipAmbalaj(ETipAmbalaj tipAmbalaj) {
        this.tipAmbalaj = tipAmbalaj;
        return this;
    }

    public BuilderBuchet setNumarFlori(int numarFlori) {
        this.numarFlori = numarFlori;
        return this;
    }

    public BuilderBuchet setFloarePrincipala(ETipFloare floarePrincipala) {
        this.floarePrincipala = floarePrincipala;
        return this;
    }

    public BuilderBuchet setCuloareDominanta(String culoareDominanta) {
        this.culoareDominanta = culoareDominanta;
        return this;
    }

    public BuilderBuchet addFloareSuplimentara(ETipFloare floare) {
        this.floriSuplimentare.add(floare);
        return this;
    }

    public BuilderBuchet addDecoratiune(ETipDecoratiune decoratiune) {
        this.decoratiuni.add(decoratiune);
        return this;
    }

    public BuilderBuchet addMesaj(String mesaj) {
        this.mesajePersonalizate.add(mesaj);
        return this;
    }

    @Override
    public ABuchet build() {
        if(numarFlori < 3 || numarFlori > 101) {
            throw new RuntimeException("Buchetul poate contine intre 3 si 101 flori.");
        }
        if(tipAmbalaj == ETipAmbalaj.CUPOLASTICLAM && floriSuplimentare.size() > 3) {
            throw new RuntimeException("Cupola permite adaugare a maxim 3 flori suplimentare.");
        }
        int lungimeMesaje = 0;
        for(String mesaj : mesajePersonalizate) {
            lungimeMesaje += mesaj.length();
        }
        if(lungimeMesaje >= numarFlori) {
            throw new RuntimeException("Mesajele sunt prea lungi pentru dimensiunea buchetului.");
        }

        return new Buchet(tipAmbalaj, numarFlori, floarePrincipala, culoareDominanta, floriSuplimentare,mesajePersonalizate, decoratiuni);
    }
}
