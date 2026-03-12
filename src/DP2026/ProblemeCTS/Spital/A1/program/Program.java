package DP2026.ProblemeCTS.Spital.A1.program;

import DP2026.ProblemeCTS.Spital.A1.builder.BuilderPacient;
import DP2026.ProblemeCTS.Spital.A1.clase.Pacient;

public class Program {

    public static void main(String[] args) {

        Pacient pacient = new BuilderPacient("Andreea")
                .setMicDejunInclus(true)
                .setPapuciDeCamera(true)
                .build();

        System.out.println(pacient);
    }
}
