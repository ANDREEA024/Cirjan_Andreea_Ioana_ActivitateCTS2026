package DP2026.ProblemeCTS.Practica.Builder.cts.cirjan.andreea.as.clase;

import DP2026.ProblemeCTS.Practica.Builder.cts.cirjan.andreea.as.builder.APantof;

import java.util.ArrayList;
import java.util.List;

public class PantofPersonalizat extends APantof {

    public PantofPersonalizat(ETipPantof tipPantof, int nrPantof, float dimensiuneToc, ETipMaterial material, List<ETipMaterial> materialeSuplimentare, List<String> listaMesaje) {

        this.tipPantof = tipPantof;
        this.nrPantof = nrPantof;
        this.dimensiuneToc = dimensiuneToc;
        this.material = material;

        this.materialeSuplimentare = new ArrayList<>(materialeSuplimentare);
        this.listaMesajeText = new ArrayList<>(listaMesaje);
    }

    @Override
    public float calculPret() {
        float pret = 100;
        pret += materialeSuplimentare.size() * 20;
        pret += listaMesajeText.size() * 5;
        return pret;
    }

    @Override
    public void addMesaj(String mesaj) {
        listaMesajeText.add(mesaj);
    }

    @Override
    public void addMaterial(ETipMaterial tipMaterial) {
        materialeSuplimentare.add(tipMaterial);
    }

    @Override
    public String toString() {
        return "Pantof{" +
                "tipPantof=" + tipPantof +
                ", nrPantof=" + nrPantof +
                ", dimensiuneToc=" + dimensiuneToc +
                ", material=" + material +
                ", materialeSuplimentare=" + materialeSuplimentare +
                ", listaMesajeText=" + listaMesajeText +
                ", pret=" + calculPret() +
                '}';
    }
}