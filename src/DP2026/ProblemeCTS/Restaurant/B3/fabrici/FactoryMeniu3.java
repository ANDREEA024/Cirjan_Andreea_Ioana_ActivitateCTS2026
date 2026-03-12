package DP2026.ProblemeCTS.Restaurant.B3.fabrici;

import DP2026.ProblemeCTS.Restaurant.B3.clase.*;

public class FactoryMeniu3 implements AbstractFactoryMeniu {
    @Override
    public ISupa creareSupa() {
        return new SupaVita();
    }

    @Override
    public IDesert creareDesert() {
        return new Clatite();
    }
}
