package DP2026.ProblemeCTS.Spital.A6.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> paturiLibere;
    private List<Integer> paturiOcupate;

    public Salon(int nrPaturi) {
        paturiLibere = new ArrayList<>();
        paturiOcupate = new ArrayList<>();

        for (int i = 1; i <= nrPaturi; i++) {
            paturiLibere.add(i);
        }
    }

    public boolean existaPatLiber() {
        return !paturiLibere.isEmpty();
    }

    public int seOcupaPat() {
        if (existaPatLiber()) {
            int pat = paturiLibere.remove(0);
            paturiOcupate.add(pat);
            return pat;
        }
        return -1;
    }
}