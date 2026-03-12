package DP2026.ProblemeCTS.Restaurant.B3.fabrici;

import DP2026.ProblemeCTS.Restaurant.B3.clase.IDesert;
import DP2026.ProblemeCTS.Restaurant.B3.clase.ISupa;
import DP2026.ProblemeCTS.Restaurant.B3.clase.Papanasi;
import DP2026.ProblemeCTS.Restaurant.B3.clase.SupaLegume;

public class FactoryMeniu1 implements AbstractFactoryMeniu {
    @Override
    public ISupa creareSupa() {
        return new SupaLegume();
    }

    @Override
    public IDesert creareDesert() {
        return new Papanasi();
    }
}
