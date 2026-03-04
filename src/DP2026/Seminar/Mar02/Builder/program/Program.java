package DP2026.Seminar.Mar02.Builder.program;

import DP2026.Seminar.Mar02.Builder.models.Rezervare;
import DP2026.Seminar.Mar02.Builder.clase.builder.BuilderAbstract;
import DP2026.Seminar.Mar02.Builder.clase.builder.RezervareBuilder;
import DP2026.Seminar.Mar02.Builder.clase.builder2.RezervareBuilder2;

public class Program {

    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(true, true, "Rosu cu Alb", "Romantic", 2);
        Rezervare rezervare2 = new Rezervare(true, true, "Rosu cu Alb", "Romantic", 2);

        Rezervare rezervare3 = new Rezervare();
        rezervare3.setLaGeam(true);
        rezervare3.setNrPersoane(4);

        Rezervare rezervare4 = new Rezervare();
        rezervare4.setLaGeam(true);
        rezervare4.setNrPersoane(6);

        System.out.println(rezervare4.toString() + "\n");


        BuilderAbstract builder = new RezervareBuilder();
        Rezervare rezervare5 = builder
                .setNrPersoane(4)
                .setCuloareFataMasa("Verde")
                .build();

        Rezervare rezervare6 = new RezervareBuilder()
                .setNrPersoane(1)
                .build();

        System.out.println(rezervare6.toString() + "\n");

        BuilderAbstract builderTwo = new RezervareBuilder2();
        Rezervare rezervare7 = builderTwo.setScaunErgonomic(true).setNrPersoane(3).build();
        Rezervare rezervare8 = builderTwo.setNrPersoane(5).build();

        System.out.println(rezervare7.toString() + "\n");
        System.out.println(rezervare8.toString() + "\n");

        rezervare7.setNrPersoane(10);
        System.out.println(rezervare7.toString() + "\n");
    }
}