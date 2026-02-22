package DP2026.Seminar.Feb21.FactoryMethod.program;

import DP2026.Seminar.Feb21.FactoryMethod.dispozitive.Dispozitiv;
import DP2026.Seminar.Feb21.FactoryMethod.factory.FabricaAbstracta;
import DP2026.Seminar.Feb21.FactoryMethod.factory.SmartphoneFactory;

public class Program {

    private static void printareDispozitiv(FabricaAbstracta fabrica, int nivelBaterie){
        Dispozitiv dispozitiv = fabrica.creeareDispozitiv(nivelBaterie);
        System.out.println(dispozitiv.toString());
    }

    public static void main(String[] args) {
        printareDispozitiv(new SmartphoneFactory(), 50);
    }
}
