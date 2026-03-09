package DP2026.ProblemeCTS.Spital.A2.fabrici;

import DP2026.ProblemeCTS.Spital.A2.clase.Asistent;
import DP2026.ProblemeCTS.Spital.A2.clase.Brancardier;
import DP2026.ProblemeCTS.Spital.A2.clase.Medic;
import DP2026.ProblemeCTS.Spital.A2.clase.PersonalSpital;

public class FactoryPersonalSpital {
    public PersonalSpital crearePersonalSpital(TipPersonalSpital tip) {
        return switch (tip) {
            case Brancardier -> new Brancardier();
            case Asistent -> new Asistent();
            case Medic -> new Medic();
            default -> null;
        };
    }
}
