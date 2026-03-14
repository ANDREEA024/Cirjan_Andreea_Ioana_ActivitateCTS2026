package DP2026.Seminar.Mar14.cts.cirjan.andreea.as.factory.model;

public class FactoryBauturaCeai implements FactoryBautura {

    @Override
    public Bautura creareBautura(int volum) {
        return new BauturaCeai(volum);
    }
}
