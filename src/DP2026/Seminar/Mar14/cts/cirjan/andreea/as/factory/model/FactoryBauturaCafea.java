package DP2026.Seminar.Mar14.cts.cirjan.andreea.as.factory.model;

public class FactoryBauturaCafea implements FactoryBautura {

    @Override
    public Bautura creareBautura(int volum) {
        return new BauturaCafea(volum);
    }
}
