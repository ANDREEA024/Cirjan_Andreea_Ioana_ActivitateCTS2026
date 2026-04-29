package DP2026.ProblemeCTS.Spital.A9.program;

import DP2026.ProblemeCTS.Spital.A9.clase.Internare;
import DP2026.ProblemeCTS.Spital.A9.clase.Pacient;
import DP2026.ProblemeCTS.Spital.A9.clase.ProxyInternare;

public class Program {
    public static void main(String[] args) {

        Pacient p1 = new Pacient("Andreea C", "andreea@gmail.com", false);
        Pacient p2 = new Pacient("Lea I", "lea@gmail.com", true);

        Internare internare1 = new Internare(p1);
        Internare internare2 = new Internare(p2);

        ProxyInternare proxy1 = new ProxyInternare(internare1);
        ProxyInternare proxy2 = new ProxyInternare(internare2);

        proxy1.interneaza();
        proxy2.interneaza();
    }
}
