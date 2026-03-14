package DP2026.Seminar.Mar14.cts.cirjan.andreea.as.factory.model;

public class FactoryBauturaCiocolataCalda implements FactoryBautura {

    @Override
    public Bautura creareBautura(int volum) {
        return new BauturaCiocolataCalda(volum);
    }
}
