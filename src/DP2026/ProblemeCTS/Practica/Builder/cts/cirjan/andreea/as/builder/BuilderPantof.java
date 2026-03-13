package DP2026.ProblemeCTS.Practica.Builder.cts.cirjan.andreea.as.builder;

import DP2026.ProblemeCTS.Practica.Builder.cts.cirjan.andreea.as.clase.ETipMaterial;
import DP2026.ProblemeCTS.Practica.Builder.cts.cirjan.andreea.as.clase.ETipPantof;
import DP2026.ProblemeCTS.Practica.Builder.cts.cirjan.andreea.as.clase.PantofPersonalizat;
import DP2026.ProblemeCTS.Practica.Builder.cts.cirjan.andreea.as.exceptii.DimensiuneTocException;
import DP2026.ProblemeCTS.Practica.Builder.cts.cirjan.andreea.as.exceptii.LimitaMesajeException;
import DP2026.ProblemeCTS.Practica.Builder.cts.cirjan.andreea.as.exceptii.TipMaterialeException;
import DP2026.ProblemeCTS.Practica.Builder.cts.cirjan.andreea.as.exceptii.NumarPantofException;

import java.util.ArrayList;
import java.util.List;

public class BuilderPantof implements IBuilder {

    private ETipPantof tipPantof;
    private int nrPantof;
    private float dimensiuneToc;
    private ETipMaterial material;

    private List<ETipMaterial> materialeSuplimentare = new ArrayList<>();
    private List<String> listaMesaje = new ArrayList<>();

    public BuilderPantof setTipPantof(ETipPantof tipPantof) {
        this.tipPantof = tipPantof;
        return this;
    }

    public BuilderPantof setNrPantof(int nrPantof) {
        this.nrPantof = nrPantof;
        return this;
    }

    public BuilderPantof setDimensiuneToc(float dimensiuneToc) {
        this.dimensiuneToc = dimensiuneToc;
        return this;
    }

    public BuilderPantof setMaterial(ETipMaterial material) {
        this.material = material;
        return this;
    }

    public BuilderPantof addMaterial(ETipMaterial material) {
        materialeSuplimentare.add(material);
        return this;
    }

    public BuilderPantof addMesaj(String mesaj) {
        listaMesaje.add(mesaj);
        return this;
    }

    @Override
    public APantof build() {

        if (nrPantof < 35 || nrPantof > 45)
            throw new NumarPantofException("Numarul pantofului trebuie sa fie o valoare intre 35 si 45");

        if (dimensiuneToc < 0.5 || dimensiuneToc > 12.5)
            throw new DimensiuneTocException("Dimensiunea tocului trebuie intre 0.5 si 12.5");

        if (tipPantof == ETipPantof.STILETTO && materialeSuplimentare.size() > 1)
            throw new TipMaterialeException("Stiletto permite maxim 1 material suplimentar");

        int total = 0;
        for (String m : listaMesaje)
            total += m.length();

        if (total >= nrPantof)
            throw new LimitaMesajeException("Mesajele sunt prea lungi pentru marimea pantofului");

        return new PantofPersonalizat(tipPantof, nrPantof, dimensiuneToc, material, materialeSuplimentare, listaMesaje
        );
    }
}