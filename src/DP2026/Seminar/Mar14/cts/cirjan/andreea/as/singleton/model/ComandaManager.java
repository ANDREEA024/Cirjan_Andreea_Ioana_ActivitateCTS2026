package DP2026.Seminar.Mar14.cts.cirjan.andreea.as.singleton.model;

import DP2026.Seminar.Mar14.cts.cirjan.andreea.as.factory.model.Bautura;

public interface ComandaManager {

    void adaugaBautura(Bautura b);

    void afiseazaComanda();

    double calculeazaPretTotal();

    void resetComanda();
}