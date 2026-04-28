package DP2026.ProblemeCTS.Restaurant.B9.program;

import DP2026.ProblemeCTS.Restaurant.B9.clase.Client;
import DP2026.ProblemeCTS.Restaurant.B9.clase.Rezervare;
import DP2026.ProblemeCTS.Restaurant.B9.clase.ProxyRezervare;

public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("Ioana M");
        Client c2 = new Client("Andreea C");

        Rezervare r1 = new Rezervare(c1, 2);
        Rezervare r2 = new Rezervare(c2, 6);

        ProxyRezervare proxy1 = new ProxyRezervare(r1);
        ProxyRezervare proxy2 = new ProxyRezervare(r2);

        proxy1.realizeazaRezervare();
        proxy2.realizeazaRezervare();
    }
}
