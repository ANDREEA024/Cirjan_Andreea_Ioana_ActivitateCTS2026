package DP2026.Seminar.Mar02.Builder.clase.builder;

import DP2026.Seminar.Mar02.Builder.models.Rezervare;

public class RezervareBuilder implements BuilderAbstract{
    //versiunea 1 - cu instanta de tip Rezervare
    private Rezervare rezervare=null;

    public RezervareBuilder(){
        rezervare=new Rezervare();
    }

    @Override
    public RezervareBuilder setGenMuzical(String genMuzical){
        rezervare.setGenMuzical(genMuzical);
        return this;
    }

    @Override
    public RezervareBuilder setNrPersoane(int nrPersoane){
        rezervare.setNrPersoane(nrPersoane);
        return this;
    }

    @Override
    public RezervareBuilder setCuloareFataMasa(String culoareFataMasa){
        rezervare.setCuloareFataMasa(culoareFataMasa);
        return this;
    }

    @Override
    public RezervareBuilder setLaGeam(boolean laGeam){
        rezervare.setLaGeam(laGeam);
        return this;
    }

    @Override
    public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic){
        rezervare.setScaunErgonomic(scaunErgonomic);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
