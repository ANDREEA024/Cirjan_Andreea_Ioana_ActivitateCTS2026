package DP2026.ProblemeCTS.Restaurant.B3.fabrici;

import DP2026.ProblemeCTS.Restaurant.B3.clase.*;

public class FactorySD implements AbstractFactorySD {
    @Override
    public ISupa creareSupa(TipSupa tipSupa) {
        return switch (tipSupa) {
            case LEGUME -> new SupaLegume();
            case CIUPERCI -> new SupaCiuperci();
            case VITA -> new SupaVita();
            default -> null;
        };
    }

    @Override
    public IDesert creareDesert(TipDesert tipDesert) {
        return switch (tipDesert) {
            case PAPANASI -> new Papanasi();
            case CLATITE -> new Clatite();
            case CHEESECAKE -> new CheeseCake();
            default -> null;
        };
    }
}
