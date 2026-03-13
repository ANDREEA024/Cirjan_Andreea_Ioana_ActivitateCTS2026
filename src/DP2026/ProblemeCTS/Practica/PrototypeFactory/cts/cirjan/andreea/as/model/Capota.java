package DP2026.ProblemeCTS.Practica.PrototypeFactory.cts.cirjan.andreea.as.model;

public class Capota implements IComponenta {

    @Override
    public String getCuloareComponenta() {
        return "neagra";
    }

    @Override
    public String tipMaterial() {
        return "aluminiu";
    }

    @Override
    public boolean esteDetasabila() {
        return false;
    }

    @Override
    public String toString() {
        return "Capota{culoare=" + getCuloareComponenta() +
                ", material=" + tipMaterial() +
                ", detasabila=" + esteDetasabila() + "}";
    }
}