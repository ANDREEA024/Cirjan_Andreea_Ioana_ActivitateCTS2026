package DP2026.Teme.Practica.Singleton.multiplu;

import DP2026.Teme.Practica.Singleton.program.Nava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DanaAcostare {

    private static Map<Integer, DanaAcostare> instances;

    private int id;
    private int lungime;
    private List<Nava> naveAlocate;

    static {
        instances = new HashMap<>();
        instances.put(1, new DanaAcostare(1, 300));
        instances.put(2, new DanaAcostare(2, 250));
        instances.put(3, new DanaAcostare(3, 400));
    }

    private DanaAcostare(int id, int lungime) {
        this.id = id;
        this.lungime = lungime;
        this.naveAlocate = new ArrayList<>();
    }

    public int timpAsteptare() {
        int total = 0;
        for (Nava n : this.naveAlocate) {
            total += n.getNrMinuteAcostare();
        }
        return total;
    }

    public static void adaugaNava(Nava n) {
        DanaAcostare danaMinima = instances.get(1);
        for (DanaAcostare d : instances.values()) {
            if (d.timpAsteptare() < danaMinima.timpAsteptare()) {
                danaMinima = d;
            }
        }
        danaMinima.naveAlocate.add(n);
    }

    public static DanaAcostare getInstance(int id) {
        return instances.get(id);
    }

    @Override
    public String toString() {
        return "DanaAcostare [id=" + id + ", lungime=" + lungime + ", naveAlocate=" + naveAlocate + "]";
    }
}