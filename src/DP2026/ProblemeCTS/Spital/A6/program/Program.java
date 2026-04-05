package DP2026.ProblemeCTS.Spital.A6.program;

import DP2026.ProblemeCTS.Spital.A6.clase.Facade;
import DP2026.ProblemeCTS.Spital.A6.clase.Medic;
import DP2026.ProblemeCTS.Spital.A6.clase.Pacient;
import DP2026.ProblemeCTS.Spital.A6.clase.Salon;

public class Program {
    public static void main(String[] args) {

        Pacient p1 = new Pacient("Andreea Cirjan", true);
        Pacient p2 = new Pacient("Ioana C", false);
        Pacient p3 = new Pacient("Andreea C", true);

        Medic medic = new Medic("Dr. Alexandru");
        Salon salon = new Salon(1);

        Facade.interneazaPacient(p1, medic, salon);
        Facade.interneazaPacient(p2, medic, salon);
        Facade.interneazaPacient(p3, medic, salon);
    }
}