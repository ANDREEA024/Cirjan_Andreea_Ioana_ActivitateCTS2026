package DP2026.ProblemeCTS.Restaurant.B6.clase;

import java.util.ArrayList;
import java.util.List;

public class Receptionera {
    private List<Boolean> listaMeseCurate;
    private List<Boolean> listaMeseCuServeteleNoi;

    public Receptionera() {
        listaMeseCurate = new ArrayList<>();
        listaMeseCuServeteleNoi = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            listaMeseCurate.add(true);
            listaMeseCuServeteleNoi.add(true);
        }
        for (int i = 6; i < 15; i++) {
            listaMeseCurate.add(false);
            listaMeseCuServeteleNoi.add(false);
        }
    }

    public boolean esteMasaCurata(int numarMasa) {
        return listaMeseCurate.get(numarMasa - 1);
    }

    public boolean areServeteleNoi(int numarMasa) {
        return listaMeseCuServeteleNoi.get(numarMasa - 1);
    }

    public int getNumarTotalMese() {
        return listaMeseCurate.size();
    }
}