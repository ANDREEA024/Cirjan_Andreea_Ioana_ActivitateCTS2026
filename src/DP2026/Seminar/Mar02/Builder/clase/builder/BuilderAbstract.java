package DP2026.Seminar.Mar02.Builder.clase.builder;

import DP2026.Seminar.Mar02.Builder.models.Rezervare;

public interface BuilderAbstract {

    BuilderAbstract setGenMuzical(String genMuzical);
    BuilderAbstract setNrPersoane(int nrPersoane);
    BuilderAbstract setCuloareFataMasa(String culoareFataMasa);
    BuilderAbstract setScaunErgonomic(boolean scaunErgonomic);
    BuilderAbstract setLaGeam(boolean laGeam);

    Rezervare build();
}
