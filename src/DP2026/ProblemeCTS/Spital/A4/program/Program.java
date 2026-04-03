package DP2026.ProblemeCTS.Spital.A4.program;

import DP2026.ProblemeCTS.Spital.A4.clase.IReteta;
import DP2026.ProblemeCTS.Spital.A4.clase.RetetaRegistry;

public class Program {

    public static void main(String[] args) {

        IReteta r1 = RetetaRegistry.obtineReteta("Antibiotic");
        IReteta r2 = RetetaRegistry.obtineReteta("Antibiotic");
        IReteta r3 = RetetaRegistry.obtineReteta("SiropTuse");
        IReteta r4 = RetetaRegistry.obtineReteta("SiropTuse");

        System.out.println("Reteta 1: " + r1);
        System.out.println("Reteta 2: " + r2);
        System.out.println("Reteta 3: " + r3);
        System.out.println("Reteta 4: " + r4);
    }
}
