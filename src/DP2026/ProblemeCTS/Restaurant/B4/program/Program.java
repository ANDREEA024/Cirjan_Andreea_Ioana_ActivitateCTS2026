package DP2026.ProblemeCTS.Restaurant.B4.program;

import DP2026.ProblemeCTS.Restaurant.B4.clase.Client;
import DP2026.ProblemeCTS.Restaurant.B4.clase.ClientRegistry;
import DP2026.ProblemeCTS.Restaurant.B4.clase.Rezervare;

public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("Andreea Cirjan", "0738608921", "andreea@gmail.com");
        ClientRegistry.adaugaClient(c1);
        Rezervare r1 = new Rezervare(c1, 4);
        System.out.println(r1);

        Client c2 = ClientRegistry.getClient("Andreea Cirjan");
        Rezervare r2 = new Rezervare(c2, 2);
        System.out.println(r2);
    }
}
