package DP2026.ProblemeCTS.Restaurant.B1.program;

import DP2026.ProblemeCTS.Restaurant.B1.clase.Supa;
import DP2026.ProblemeCTS.Restaurant.B1.fabrici.FactoryRestaurantSingleton;
import DP2026.ProblemeCTS.Restaurant.B1.fabrici.TipSupa;

public class Program {

    public static void main(String[] args) {

        FactoryRestaurantSingleton restaurant = FactoryRestaurantSingleton.getInstance();
        Supa supaLegume = null;

        try {
            supaLegume = restaurant.preparaSupa(TipSupa.LEGUME);
        } catch (Exception e) {
            e.printStackTrace();
        }

        supaLegume.descriere();
    }
}
