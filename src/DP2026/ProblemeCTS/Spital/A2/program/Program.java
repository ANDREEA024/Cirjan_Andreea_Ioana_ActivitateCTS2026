package DP2026.ProblemeCTS.Spital.A2.program;

import DP2026.ProblemeCTS.Restaurant.B1.fabrici.FactoryRestaurantSingleton;
import DP2026.ProblemeCTS.Spital.A2.clase.PersonalSpital;
import DP2026.ProblemeCTS.Spital.A2.fabrici.FactoryPersonalSpital;
import DP2026.ProblemeCTS.Spital.A2.fabrici.TipPersonalSpital;

public class Program {

    public static void main(String[] args) {
        FactoryPersonalSpital fabricaPS = new FactoryPersonalSpital();
        PersonalSpital personalSpital = null;

        try {
            personalSpital = fabricaPS.crearePersonalSpital(TipPersonalSpital.Asistent);
        } catch (Exception e) {
            e.printStackTrace();
        }

        personalSpital.prezentareAtributii();
    }
}
