package DP2026.ProblemeCTS.Practica.PrototypeFactory.cts.cirjan.andreea.as.model;

public class Portbagaj implements IComponenta {

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
        return false;
    }

    @Override
    public String toString() {
        return "Portbagaj{culoare=" + getCuloareComponenta() +
                ", material=" + tipMaterial() +
                ", detasabila=" + esteDetasabila() + "}";
    }
}