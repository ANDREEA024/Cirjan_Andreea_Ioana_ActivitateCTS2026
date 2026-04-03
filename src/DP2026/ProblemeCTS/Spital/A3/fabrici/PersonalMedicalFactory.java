package DP2026.ProblemeCTS.Spital.A3.fabrici;

import DP2026.ProblemeCTS.Spital.A3.clase.*;

public class PersonalMedicalFactory implements IPersonalFactory {
    @Override
    public PersonalSpital createPersonal(ETipPersonal tip) {
        return switch (tip) {
            case BRANCARDIER -> new Brancardier();
            case ASISTENT -> new Asistent();
            case MEDIC -> new Medic();
            default -> throw new IllegalArgumentException("Tipul nu este personal medical!");
        };
    }
}