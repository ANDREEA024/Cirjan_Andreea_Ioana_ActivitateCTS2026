package DP2026.ProblemeCTS.Practica.PrototypeFactory.cts.cirjan.andreea.as.model;

public class Bara implements IComponenta {

    @Override
    public String getCuloareComponenta() {
        return "gri";
    }

    @Override
    public String tipMaterial() {
        return "plastic";
    }

    @Override
    public boolean esteDetasabila() {
        return true;
    }

    @Override
    public String toString() {
        return "Bara{culoare=" + getCuloareComponenta() +
                ", material=" + tipMaterial() +
                ", detasabila=" + esteDetasabila() + "}";
    }
}