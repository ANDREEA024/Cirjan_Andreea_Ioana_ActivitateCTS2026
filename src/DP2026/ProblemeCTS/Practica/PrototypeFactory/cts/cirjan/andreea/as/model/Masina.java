package DP2026.ProblemeCTS.Practica.PrototypeFactory.cts.cirjan.andreea.as.model;

public class Masina implements IMasina {

    private final String modelMasina;
    private final int anFabricatie;

    public Masina(String modelMasina, int anFabricatie) {
        this.modelMasina = modelMasina;
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String getModelMasina() {
        return modelMasina;
    }

    @Override
    public int getAnFabricatie() {
        return anFabricatie;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "modelMasina='" + modelMasina + '\'' +
                ", anFabricatie=" + anFabricatie +
                '}';
    }
}
