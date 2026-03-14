package DP2026.Seminar.Mar14.cts.cirjan.andreea.as.singleton.main;

import DP2026.Seminar.Mar14.cts.cirjan.andreea.as.factory.model.*;
import DP2026.Seminar.Mar14.cts.cirjan.andreea.as.singleton.model.Comanda;
import DP2026.Seminar.Mar14.cts.cirjan.andreea.as.singleton.model.SingletonComandaManager;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FactoryBautura factoryBauturaCeai = new FactoryBauturaCeai();
        Bautura bautura1 = factoryBauturaCeai.creareBautura(100);
        Bautura bautura2 = factoryBauturaCeai.creareBautura(50);
        Bautura bautura3 = factoryBauturaCeai.creareBautura(200);
        Bautura bautura4 = factoryBauturaCeai.creareBautura(160);

        //SINGLETON
        System.out.println("SINGLETON REGISTRY");
        SingletonComandaManager casaDeMarcat = SingletonComandaManager.getInstance();
        List<Bautura> listaBauturiComandaTemporara = new ArrayList<>();
        listaBauturiComandaTemporara.add(bautura1);
        listaBauturiComandaTemporara.add(bautura2);
        Comanda comanda = new Comanda(listaBauturiComandaTemporara);
        comanda.afiseazaComanda();

        FactoryBautura factoryBauturaCafea = new FactoryBauturaCafea();
        Bautura bautura5 = factoryBauturaCafea.creareBautura(80);
        listaBauturiComandaTemporara.clear();
        listaBauturiComandaTemporara.add(bautura5);
        listaBauturiComandaTemporara.add(bautura4);
        comanda = new Comanda(listaBauturiComandaTemporara);
        comanda.afiseazaComanda();

        System.out.println("\nUltima comanda este:");
        casaDeMarcat.adaugaComandaBautura(comanda);
        casaDeMarcat.afisareUltimaComanda();
    }
}
