package DP2026.Seminar.Mar14.cts.cirjan.andreea.as.singleton.model;

import DP2026.Seminar.Mar14.cts.cirjan.andreea.as.factory.model.Bautura;

import java.util.ArrayList;
import java.util.List;

public class SingletonComandaManager implements ComandaManager {

    private static SingletonComandaManager instance = null;

    private final List<Comanda> listaComenziBauturi = new ArrayList<>();

    private SingletonComandaManager() {
    }

    public static synchronized SingletonComandaManager getInstance(){
        if(instance==null){
            instance=new SingletonComandaManager();
        }
        return instance;
    }

    public void adaugaComandaBautura(Comanda comanda) {
        this.listaComenziBauturi.add(comanda);
    }

    public void afisareUltimaComanda() {
        System.out.println(listaComenziBauturi.getLast());
    }
    @Override
    public void adaugaBautura(Bautura b) {

    }

    @Override
    public void afiseazaComanda() {

    }

    @Override
    public double calculeazaPretTotal() {
        return 0;
    }

    @Override
    public void resetComanda() {
        this.listaComenziBauturi.removeLast();
    }
}
