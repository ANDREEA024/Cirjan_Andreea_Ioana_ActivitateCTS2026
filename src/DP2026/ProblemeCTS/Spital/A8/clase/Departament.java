package DP2026.ProblemeCTS.Spital.A8.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IStructuraSpital {

    private String numeDepartament;
    private List<IStructuraSpital> lista = new ArrayList<>();

    public Departament(String numeDepartament) {
        this.numeDepartament = numeDepartament;
    }

    @Override
    public void adaugaNod(IStructuraSpital nod) {
        lista.add(nod);
    }

    @Override
    public void stergeNod(IStructuraSpital nod) {
        lista.remove(nod);
    }

    @Override
    public IStructuraSpital getNod(int index) {
        return lista.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Departament [" + numeDepartament + "]");
        for (IStructuraSpital nod : lista) {
            nod.descriere();
        }
    }
}
