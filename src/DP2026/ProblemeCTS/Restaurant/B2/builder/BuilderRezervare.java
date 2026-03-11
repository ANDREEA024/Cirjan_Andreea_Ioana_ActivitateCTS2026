package DP2026.ProblemeCTS.Restaurant.B2.builder;

import DP2026.ProblemeCTS.Restaurant.B2.clase.Rezervare;

public class BuilderRezervare implements IBuilder {
    private boolean laGeam;
    private boolean scaunErgonomic;
    private String decorMasa = "flori simple";
    private String muzicaPreferata = "jazz";

    public BuilderRezervare setLaGeam(boolean laGeam) {
        this.laGeam = laGeam;
        return this;
    }

    public BuilderRezervare setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return this;
    }

    public BuilderRezervare setDecorMasa(String decorMasa) {
        this.decorMasa = decorMasa;
        return this;
    }

    public BuilderRezervare setMuzicaPreferata(String muzicaPreferata) {
        this.muzicaPreferata = muzicaPreferata;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(laGeam, scaunErgonomic, decorMasa, muzicaPreferata);
    }
}
