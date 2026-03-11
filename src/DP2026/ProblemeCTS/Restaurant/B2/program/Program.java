package DP2026.ProblemeCTS.Restaurant.B2.program;

import DP2026.ProblemeCTS.Restaurant.B2.builder.BuilderRezervare;
import DP2026.ProblemeCTS.Restaurant.B2.clase.Rezervare;
import DP2026.ProblemeCTS.Restaurant.B2.builderclass.Rezervare2;

public class Program {

    public static void main(String[] args) {

        System.out.println("V1 - builder with parameters");
        Rezervare rezervare = new BuilderRezervare()
                .setLaGeam(true)
                .setDecorMasa("lumanari")
                .build();

        System.out.println(rezervare);


        System.out.println("V2 - inner static class builder");
        Rezervare2 rezervare2 = new Rezervare2.BuilderRezervare()
                .setLaGeam(false)
                .setDecorMasa("beculete")
                .setMuzicaPreferata("pop")
                .build();

        System.out.println(rezervare2);
    }
}
