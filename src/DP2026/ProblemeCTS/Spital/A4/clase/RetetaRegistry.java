package DP2026.ProblemeCTS.Spital.A4.clase;

import java.util.HashMap;
import java.util.Map;

public class RetetaRegistry {

    private static final Map<String, Reteta> listaRetete = new HashMap<>();

    private RetetaRegistry() {}

    private static Reteta creareRetetaNoua(String nume) {
        int a = nume.length() * 3;
        int b = nume.length() * 2;
        int c = nume.length();

        System.out.println("Creare rețetă pentru " + nume + "...");
        return new Reteta(nume, a, b, c);
    }

    public static IReteta obtineReteta(String nume) {
        if (!listaRetete.containsKey(nume)) {
            Reteta prototip = creareRetetaNoua(nume);
            listaRetete.put(nume, prototip);
        }
        return listaRetete.get(nume).clonare();
    }
}

