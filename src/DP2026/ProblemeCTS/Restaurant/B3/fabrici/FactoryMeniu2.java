package DP2026.ProblemeCTS.Restaurant.B3.fabrici;

import DP2026.ProblemeCTS.Restaurant.B3.clase.*;

public class FactoryMeniu2 implements AbstractFactoryMeniu {
    @Override
    public ISupa creareSupa() {
        return new SupaCiuperci();
    }

    @Override
    public IDesert creareDesert() {
        return new CheeseCake();
    }
}
