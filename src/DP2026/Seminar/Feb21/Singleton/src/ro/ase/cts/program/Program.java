package DP2026.Seminar.Feb21.Singleton.src.ro.ase.cts.program;

import DP2026.Seminar.Feb21.Singleton.src.ro.ase.cts.aplicatii.AplicatieMobila;

public class Program {
    public static void main(String[] args) {
        AplicatieMobila ap1= AplicatieMobila.getInstanta();
        AplicatieMobila ap2 = AplicatieMobila.getInstanta();

        ap2.setNume("Telegram");
        System.out.println(ap1.getNume());
    }
}
