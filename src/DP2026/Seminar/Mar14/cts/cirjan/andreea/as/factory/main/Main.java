package DP2026.Seminar.Mar14.cts.cirjan.andreea.as.factory.main;

import DP2026.Seminar.Mar14.cts.cirjan.andreea.as.factory.model.*;

public class Main {

    public static void main(String[] args) {
        //FACTORY METHOD
        System.out.println("FACTORY METHOD");
        FactoryBautura factoryBauturaCeai = new FactoryBauturaCeai();
        Bautura bautura1 = factoryBauturaCeai.creareBautura(100);
        Bautura bautura2 = factoryBauturaCeai.creareBautura(50);
        Bautura bautura3 = factoryBauturaCeai.creareBautura(200);
        Bautura bautura4 = factoryBauturaCeai.creareBautura(160);
        System.out.println("Detalli bautura 1: " + bautura1.getDetalii());
        bautura1.preparare();
        System.out.println("Bautura 2 costa: " + bautura2.getPret() + " lei");
        System.out.println("Bautura 3 costa: " + bautura3.getPret() + " lei");
        System.out.println("Bautura 4 costa: " + bautura4.getPret() + " lei\n\n");

    }
}
