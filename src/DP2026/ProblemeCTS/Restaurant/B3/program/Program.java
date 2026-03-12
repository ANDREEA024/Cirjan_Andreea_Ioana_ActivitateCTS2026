package DP2026.ProblemeCTS.Restaurant.B3.program;

import DP2026.ProblemeCTS.Restaurant.B3.clase.IDesert;
import DP2026.ProblemeCTS.Restaurant.B3.clase.ISupa;
import DP2026.ProblemeCTS.Restaurant.B3.fabrici.*;

public class Program {

    public static void main(String[] args) {

        System.out.println("METODA 1");
        AbstractFactorySD factorySD = new FactorySD();
        IDesert desert = factorySD.creareDesert(TipDesert.CHEESECAKE);
        desert.descriere();

        System.out.println("\nMETODA 2");
        AbstractFactoryMeniu factoryMeniu2 = new FactoryMeniu2();
        ISupa supa2 = factoryMeniu2.creareSupa();
        IDesert desert2 = factoryMeniu2.creareDesert();
        supa2.descriere();
        desert2.descriere();
    }
}
