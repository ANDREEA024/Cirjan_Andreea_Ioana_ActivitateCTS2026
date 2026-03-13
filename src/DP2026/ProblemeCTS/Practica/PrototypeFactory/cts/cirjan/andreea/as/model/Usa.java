package DP2026.ProblemeCTS.Practica.PrototypeFactory.cts.cirjan.andreea.as.model;

public class Usa implements  IComponenta {

    @Override
    public String getCuloareComponenta() {
        return "negru";
    }

    @Override
    public String tipMaterial() {
        return "otel";
    }

    @Override
    public boolean esteDetasabila() {
        return true;
    }

    @Override
    public String toString() {
        return "Usa{culoare=" + getCuloareComponenta() +
                ", material=" + tipMaterial() +
                ", detasabila=" + esteDetasabila() + "}";
    }
}