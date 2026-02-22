package DP2026.Seminar.Feb21.FactoryMethod.factory;

import DP2026.Seminar.Feb21.FactoryMethod.dispozitive.Dispozitiv;
import DP2026.Seminar.Feb21.FactoryMethod.dispozitive.Laptop;

public class LaptopFactory implements FabricaAbstracta {
    @Override
    public Dispozitiv creeareDispozitiv(int nivelBaterie) {
        return new Laptop(nivelBaterie);
    }
}
