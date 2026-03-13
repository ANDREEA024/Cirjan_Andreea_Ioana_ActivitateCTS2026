package DP2026.ProblemeCTS.Practica.SingletonFactory.cts.cirjan.andreea.as.singleton.model;

public class FactoryMasina implements IFactoryMasina {

    @Override
    public AMasina creareMasina(ETipMasina marca, String serieSasiu, int nrBoxe) {
        return switch(marca) {
            case SUV -> new MasinaSUV(serieSasiu,nrBoxe);
            case VAN -> new MasinaVAN(serieSasiu,nrBoxe);
            case SEDAN -> new MasinaSEDAN(serieSasiu,nrBoxe);
            default -> null;
        };
    }
}
