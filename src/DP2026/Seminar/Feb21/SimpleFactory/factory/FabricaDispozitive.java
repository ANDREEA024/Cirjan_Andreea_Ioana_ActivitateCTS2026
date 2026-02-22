package DP2026.Seminar.Feb21.SimpleFactory.factory;

import DP2026.Seminar.Feb21.SimpleFactory.dispozitive.Dispozitiv;
import DP2026.Seminar.Feb21.SimpleFactory.dispozitive.Laptop;
import DP2026.Seminar.Feb21.SimpleFactory.dispozitive.Smartphone;
import DP2026.Seminar.Feb21.SimpleFactory.dispozitive.Smartwatch;


public class FabricaDispozitive {

    private static FabricaDispozitive instanta = null;

    public static synchronized FabricaDispozitive getInstanta() {
        if (instanta == null) {
            instanta = new FabricaDispozitive();
        }
        return instanta;
    }

    private FabricaDispozitive() {
    }

    public Dispozitiv getDispozitiv(TipDispozitiv tip, int nivelBaterie) {
        return switch (tip) {
            case Laptop -> new Laptop(nivelBaterie);
            case TipDispozitiv.Smartphone -> new Smartphone(nivelBaterie);
            case TipDispozitiv.Smartwatch -> new Smartwatch(nivelBaterie);
            default -> null;
        };
    }
}