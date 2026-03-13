package DP2026.ProblemeCTS.Practica.PrototypeFactory.cts.cirjan.andreea.as.model;

import java.util.HashMap;
import java.util.Map;

public class StickerRegistry {

    private static final Map<String, Sticker> registry = new HashMap<>();

    private StickerRegistry() {
    }

    private static String genereazaCheie(IMasina masina) {
        return masina.getModelMasina() + "_" + masina.getAnFabricatie();
    }

    private static Sticker creeazaStickerNou(IMasina masina) {
        // simulăm consultarea producătorului: dimensiunile depind de model + an
        int lungime = 300 + masina.getModelMasina().length() * 10;
        int latime = 100 + (masina.getAnFabricatie() % 10) * 5;
        System.out.println("Se consultă producătorul pentru " + masina +
                " și se creează un nou Sticker...");
        return new Sticker(lungime, latime);
    }

    public static Sticker obtineSticker(IMasina masina) {
        String cheie = genereazaCheie(masina);

        if (!registry.containsKey(cheie)) {
            Sticker prototip = creeazaStickerNou(masina);
            registry.put(cheie, prototip);
        }

        return (Sticker) registry.get(cheie).clonare();
    }
}
