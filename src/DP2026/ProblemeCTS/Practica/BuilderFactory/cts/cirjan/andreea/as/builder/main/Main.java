package DP2026.ProblemeCTS.Practica.BuilderFactory.cts.cirjan.andreea.as.builder.main;

import DP2026.ProblemeCTS.Practica.BuilderFactory.cts.cirjan.andreea.as.builder.factory.FactoryDecoratiune;
import DP2026.ProblemeCTS.Practica.BuilderFactory.cts.cirjan.andreea.as.builder.factory.IDecoratiune;
import DP2026.ProblemeCTS.Practica.BuilderFactory.cts.cirjan.andreea.as.builder.model.*;
import DP2026.ProblemeCTS.Practica.BuilderFactory.cts.cirjan.andreea.as.builder.factory.*;

public class Main {

    public static void main(String[] args) {

        //BUILDER
        ABuchet buchet1 = new BuilderBuchet()
                .setTipAmbalaj(ETipAmbalaj.GHIVECI)
                .setNumarFlori(6)
                .setCuloareDominanta("albastru")
                .setFloarePrincipala(ETipFloare.LALEA)
                .addFloareSuplimentara(ETipFloare.BUJOR)
                .addFloareSuplimentara(ETipFloare.CRIN)
                .addDecoratiune(ETipDecoratiune.FIGURINATEMATICA)
                .addMesaj("Felicitari!")
                .build();
        System.out.println(buchet1);

        //FACTORY METHOD
        IFactoryDecoratiune factory = new FactoryDecoratiune();
        IDecoratiune decoratiune1 = factory.creareDecoratiune(ETipDecoratiune.FIGURINATEMATICA);
        decoratiune1.descriere();
    }
}