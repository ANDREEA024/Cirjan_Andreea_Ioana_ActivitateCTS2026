package DP2026.ProblemeCTS.Practica.BuilderFactory.cts.cirjan.andreea.as.builder.factory;

import DP2026.ProblemeCTS.Practica.BuilderFactory.cts.cirjan.andreea.as.builder.model.ETipDecoratiune;

public class FactoryDecoratiune implements IFactoryDecoratiune {
    @Override
    public IDecoratiune creareDecoratiune(ETipDecoratiune tip) {
        switch (tip) {
            case PANGLICASATINATA:
                return new PanglicaSatinata();
            case FIGURINATEMATICA:
                return new FigurinaTematica();
            default:
                throw new RuntimeException("Tip accesoriu necunoscut.");
        }
    }
}