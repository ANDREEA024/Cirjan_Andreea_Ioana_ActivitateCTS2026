package DP2026.ProblemeCTS.Spital.A3.fabrici;

import DP2026.ProblemeCTS.Spital.A3.clase.ETipPersonal;
import DP2026.ProblemeCTS.Spital.A3.clase.PersonalSpital;
import DP2026.ProblemeCTS.Spital.A3.clase.Registrator;
import DP2026.ProblemeCTS.Spital.A3.clase.Secretar;

public class PersonalNonMedicalFactory implements IPersonalFactory {
    @Override
    public PersonalSpital createPersonal(ETipPersonal tip) {
        return switch (tip) {
            case SECRETAR -> new Secretar();
            case REGISTRATOR -> new Registrator();
            default -> throw new IllegalArgumentException("Tipul nu este personal non-medical!");
        };
    }
}