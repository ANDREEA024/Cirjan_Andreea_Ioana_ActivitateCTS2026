package DP2026.Seminar.Feb21.FactoryMethod.factory;

import DP2026.Seminar.Feb21.FactoryMethod.dispozitive.Dispozitiv;
import DP2026.Seminar.Feb21.FactoryMethod.dispozitive.Smartwatch;

public class SmartwatchFactory implements FabricaAbstracta {
    @Override
    public Dispozitiv creeareDispozitiv(int nivelBaterie) {
        return new Smartwatch(nivelBaterie);
    }
}
