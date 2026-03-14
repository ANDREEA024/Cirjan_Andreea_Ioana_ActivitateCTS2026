package DP2026.Seminar.Mar14.cts.cirjan.andreea.as.singleton.model;

import DP2026.Seminar.Mar14.cts.cirjan.andreea.as.factory.model.Bautura;

import java.util.ArrayList;
import java.util.List;

public class Comanda implements ComandaManager {

    private List<Bautura> listaBauturiComanda = new ArrayList<>();

    public Comanda(List<Bautura> listaBauturiComanda) {
        this.listaBauturiComanda = listaBauturiComanda;
    }

    public List<Bautura> getListaBauturiComanda() {
        return listaBauturiComanda;
    }

    @Override
    public String toString() {
        return "Comanda{" +
                "listaBauturiComanda=" + listaBauturiComanda +
                '}';
    }

    @Override
    public void adaugaBautura(Bautura bautura) {
        this.listaBauturiComanda.add(bautura);
    }

    @Override
    public void afiseazaComanda() {
        System.out.println("Comanda contine bauturile: ");
        for(Bautura bautura : listaBauturiComanda){
            System.out.println(bautura);
        }
    }

    @Override
    public double calculeazaPretTotal() {
        double pretTotalComanda =0;
        for(Bautura bautura : this.listaBauturiComanda){
            pretTotalComanda += bautura.getPret();
        }
        return pretTotalComanda;
    }

    @Override
    public void resetComanda() {
        this.listaBauturiComanda.removeLast();
    }


}
