package DP2026.ProblemeCTS.Spital.A1.builder;

import DP2026.ProblemeCTS.Spital.A1.clase.Pacient;

public class BuilderPacient implements IBuilder {

    private String nume;

    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halatPentruInterior;

    public BuilderPacient(String nume) {
        this.nume = nume;
    }

    public BuilderPacient setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public BuilderPacient setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
        return this;
    }

    public BuilderPacient setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
        return this;
    }

    public BuilderPacient setHalatPentruInterior(boolean halatPentruInterior) {
        this.halatPentruInterior = halatPentruInterior;
        return this;
    }

    @Override
    public Pacient build() {
        return new Pacient(nume, patRabatabil, micDejunInclus, papuciDeCamera, halatPentruInterior);
    }
}
