package DP2026.ProblemeCTS.Restaurant.B4.clase;

import java.util.HashMap;

public class ClientRegistry {
    private static HashMap<String, Client> listaClienti = new HashMap<>();

    public static void adaugaClient(Client client) {
        listaClienti.put(client.getNume(), client);
    }

    public static Client getClient(String nume) {
        Client c = listaClienti.get(nume);
        if (c != null) {
            System.out.println("\nClonare client existent..");
            return c.clone();
        }
        return null;
    }
}

