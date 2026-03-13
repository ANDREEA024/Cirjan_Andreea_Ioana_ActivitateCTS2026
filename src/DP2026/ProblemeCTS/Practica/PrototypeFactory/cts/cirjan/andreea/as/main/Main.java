package DP2026.ProblemeCTS.Practica.PrototypeFactory.cts.cirjan.andreea.as.main;

import DP2026.ProblemeCTS.Practica.PrototypeFactory.cts.cirjan.andreea.as.model.*;

public class Main {

    public static void main(String[] args) {

        //PROTOTYPE
        IMasina masina1 = new Masina("Hyundai Tucson", 2025);
        IMasina masina2 = new Masina("Harrier", 2024);
        IMasina masina3 = new Masina("Tesla Model Y", 2021);
        IMasina masina4 = new Masina("Byd Atto 3", 2023);

        Sticker sticker1 = StickerRegistry.obtineSticker(masina1);
        Sticker sticker2 = StickerRegistry.obtineSticker(masina2);
        Sticker sticker3 = StickerRegistry.obtineSticker(masina3);
        Sticker sticker4 = StickerRegistry.obtineSticker(masina4);

        System.out.println("Sticker 1: " + sticker1);
        System.out.println("Sticker 2: " + sticker2);
        System.out.println("Sticker 3: " + sticker3);
        System.out.println("Sticker 4: " + sticker4);


        // FACTORY
        IFactoryComponenta factory = new FactoryComponenta();

        IComponenta componenta1 = factory.creareComponenta(ETipComponenta.USA);
        IComponenta componenta2 = factory.creareComponenta(ETipComponenta.CAPOTA);
        IComponenta componenta3 = factory.creareComponenta(ETipComponenta.BARA);
        IComponenta componenta4 = factory.creareComponenta(ETipComponenta.USA);

        System.out.println("Componenta 1: " + componenta1);
        System.out.println("Componenta 2: " + componenta2);
        System.out.println("Componenta 3: " + componenta3);
        System.out.println("Componenta 4: " + componenta4);
    }
}
