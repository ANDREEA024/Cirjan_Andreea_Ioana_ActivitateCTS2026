package DP2026.ProblemeCTS.Practica.Builder.cts.cirjan.andreea.as.main;

import DP2026.ProblemeCTS.Practica.Builder.cts.cirjan.andreea.as.builder.APantof;
import DP2026.ProblemeCTS.Practica.Builder.cts.cirjan.andreea.as.builder.BuilderPantof;
import DP2026.ProblemeCTS.Practica.Builder.cts.cirjan.andreea.as.clase.ETipMaterial;
import DP2026.ProblemeCTS.Practica.Builder.cts.cirjan.andreea.as.clase.ETipPantof;

public class Program {

    public static void main(String[] args) {
        APantof pantof1 = new BuilderPantof()
                .setTipPantof(ETipPantof.STILETTO)
                .setNrPantof(40)
                .setDimensiuneToc(10)
                .setMaterial(ETipMaterial.PIELE)
                .addMaterial(ETipMaterial.CATIFEA)
                .addMesaj("Prada")
                .build();

        APantof pantof2 = new BuilderPantof()
                .setTipPantof(ETipPantof.BALERINI)
                .setNrPantof(36)
                .setDimensiuneToc(0.5f)
                .setMaterial(ETipMaterial.TEXTIL)
                .addMaterial(ETipMaterial.CROSLITE)
                .build();

        APantof pantof3 = new BuilderPantof()
                .setTipPantof(ETipPantof.BALERINI)
                .setNrPantof(36)
                .setDimensiuneToc(0.5f)
                .setMaterial(ETipMaterial.TEXTIL)
                .addMesaj("new collection")
                .build();

        APantof pantof4 = new BuilderPantof()
                .setTipPantof(ETipPantof.GHETE)
                .setNrPantof(309)
                .setDimensiuneToc(4)
                .setMaterial(ETipMaterial.PIELE)
                .addMesaj("new collection")
                .build();

        APantof pantof5 = new BuilderPantof()
                .setTipPantof(ETipPantof.BALERINI)
                .setNrPantof(36)
                .setDimensiuneToc(0)
                .setMaterial(ETipMaterial.TEXTIL)
                .addMesaj("new collection")
                .build();

        System.out.println(pantof1);
        System.out.println(pantof2);
        System.out.println(pantof3);
        System.out.println(pantof4);
        System.out.println(pantof5);

    }
}
