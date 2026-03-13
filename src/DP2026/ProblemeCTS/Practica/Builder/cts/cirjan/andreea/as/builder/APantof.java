package DP2026.ProblemeCTS.Practica.Builder.cts.cirjan.andreea.as.builder;

import DP2026.ProblemeCTS.Practica.Builder.cts.cirjan.andreea.as.clase.ETipMaterial;
import DP2026.ProblemeCTS.Practica.Builder.cts.cirjan.andreea.as.clase.ETipPantof;

import java.util.List;

public abstract class APantof {
    protected ETipPantof tipPantof;
    protected int nrPantof;
    protected float dimensiuneToc;
    protected ETipMaterial material;
    protected List<ETipMaterial> materialeSuplimentare;
    protected List<String> listaMesajeText;

    public abstract float calculPret();
    public abstract void addMesaj(String mesaj);
    public abstract void addMaterial(ETipMaterial tipMaterial);
}

