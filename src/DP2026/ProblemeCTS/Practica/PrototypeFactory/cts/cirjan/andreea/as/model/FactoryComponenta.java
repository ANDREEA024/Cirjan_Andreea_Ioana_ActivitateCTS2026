package DP2026.ProblemeCTS.Practica.PrototypeFactory.cts.cirjan.andreea.as.model;

public class FactoryComponenta implements IFactoryComponenta {

    @Override
    public IComponenta creareComponenta(ETipComponenta tip) {
        return switch (tip) {
            case USA -> new Usa();
            case CAPOTA -> new Capota();
            case BARA -> new Bara();
            case PORTBAGAJ -> new Portbagaj();
        };
    }
}