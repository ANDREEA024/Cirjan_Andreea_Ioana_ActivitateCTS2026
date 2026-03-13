package DP2026.ProblemeCTS.Practica.SingletonFactory.cts.cirjan.andreea.as.singleton.main;

import DP2026.ProblemeCTS.Practica.SingletonFactory.cts.cirjan.andreea.as.singleton.model.*;

public class Main {
    public static void main(String[] args) {

        // SINGLETON
        System.out.println("\nSINGLETON");
        Service service = Service.getInstance();
        AMasina masina = new Masina(ETipMasina.SUV.toString(),"SUV9097YTGJBN",2);
        service.preluareMasina(masina);
        service.afisareMasina();

        AMasina masina2 = new Masina(ETipMasina.SUV.toString(),"SUV903567TGJBN",1);
        service.preluareMasina(masina2);
        service.afisareMasina();

        AMasina masina3 = new Masina(ETipMasina.SEDAN.toString(),"SEDAN907YIONN",2);
        service.preluareMasina(masina3);
        service.afisareMasina();

        AMasina masina4 = new Masina(ETipMasina.VAN.toString(),"VAN45706BHJG",1);
        service.preluareMasina(masina4);
        service.afisareMasina();


        //FACTORY
        System.out.println("\nFACTORY");
        IFactoryMasina factoryMasina1 = new FactoryMasina();
        AMasina masinaf1 = factoryMasina1.creareMasina(ETipMasina.SEDAN,"SEDANCVGFTY8675",2);
        IFactoryMasina factoryMasina2 = new FactoryMasina();
        AMasina masinaf2 = factoryMasina2.creareMasina(ETipMasina.VAN,"vANCVGFJK3565",2);
        IFactoryMasina factoryMasina3 = new FactoryMasina();
        AMasina masinaf3 = factoryMasina3.creareMasina(ETipMasina.SUV,"SUVCUYGJH3478Y8675",2);
        IFactoryMasina factoryMasina4 = new FactoryMasina();
        AMasina masinaf4 = factoryMasina4.creareMasina(ETipMasina.SUV,"SUVCUYGJH347807985",2);
        System.out.println(masinaf1);
        System.out.println(masinaf2);
        System.out.println(masinaf3);
        System.out.println(masinaf4);
    }
}
