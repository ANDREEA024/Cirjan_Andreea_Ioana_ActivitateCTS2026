package DP2026.ProblemeCTS.Restaurant.B3.fabrici;

import DP2026.ProblemeCTS.Restaurant.B3.clase.IDesert;
import DP2026.ProblemeCTS.Restaurant.B3.clase.ISupa;

public interface AbstractFactorySD {
    ISupa creareSupa(TipSupa tipSupa);
    IDesert creareDesert(TipDesert tipDesert);
}
