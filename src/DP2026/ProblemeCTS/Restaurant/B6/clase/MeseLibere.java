package DP2026.ProblemeCTS.Restaurant.B6.clase;

import java.util.ArrayList;
import java.util.List;

public class MeseLibere {
    private List<Integer> listaMeseLibere;

    public MeseLibere() {
        listaMeseLibere = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            listaMeseLibere.add(i);
        }
    }

    public boolean verificaMasaLibera(int numarMasa) {
        return listaMeseLibere.contains(numarMasa);
    }
}