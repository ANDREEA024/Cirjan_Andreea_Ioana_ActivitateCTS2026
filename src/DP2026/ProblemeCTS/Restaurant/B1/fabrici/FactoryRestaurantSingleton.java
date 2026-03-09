package DP2026.ProblemeCTS.Restaurant.B1.fabrici;

import DP2026.ProblemeCTS.Restaurant.B1.clase.Supa;
import DP2026.ProblemeCTS.Restaurant.B1.clase.SupaCiuperci;
import DP2026.ProblemeCTS.Restaurant.B1.clase.SupaLegume;
import DP2026.ProblemeCTS.Restaurant.B1.clase.SupaVita;

public class FactoryRestaurantSingleton {

    private static FactoryRestaurantSingleton instance = null;

    private FactoryRestaurantSingleton() {}

    public static synchronized FactoryRestaurantSingleton getInstance() {
        if(instance==null) {
            instance = new FactoryRestaurantSingleton();
        }
        return instance;
    }

    public Supa preparaSupa(TipSupa tip) {
        return switch (tip) {
            case LEGUME -> new SupaLegume();
            case CIUPERCI -> new SupaCiuperci();
            case VITA -> new SupaVita();
            default -> null;
        };
    }
}
