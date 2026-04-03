package DP2026.ProblemeCTS.Spital.A3.program;

import DP2026.ProblemeCTS.Spital.A3.clase.ETipPersonal;
import DP2026.ProblemeCTS.Spital.A3.clase.PersonalSpital;
import DP2026.ProblemeCTS.Spital.A3.fabrici.IPersonalFactory;
import DP2026.ProblemeCTS.Spital.A3.fabrici.PersonalMedicalFactory;
import DP2026.ProblemeCTS.Spital.A3.fabrici.PersonalNonMedicalFactory;

public class Program {
    public static void main(String[] args) {

        IPersonalFactory factoryMedical = new PersonalMedicalFactory();
        IPersonalFactory factoryNonMedical = new PersonalNonMedicalFactory();

        PersonalSpital medic = factoryMedical.createPersonal(ETipPersonal.MEDIC);
        //PersonalSpital asistent = factoryNonMedical.createPersonal(ETipPersonal.ASISTENT);
        PersonalSpital secretar = factoryNonMedical.createPersonal(ETipPersonal.SECRETAR);

        medic.prezentareAtributii();
        //asistent.prezentareAtributii();
        secretar.prezentareAtributii();
    }
}