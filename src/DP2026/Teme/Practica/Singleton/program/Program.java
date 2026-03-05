package DP2026.Teme.Practica.Singleton.program;

import DP2026.Teme.Practica.Singleton.multiplu.DanaAcostare;
import DP2026.Teme.Practica.Singleton.simplu.PortMaritim;

public class Program {

    public static void main(String[] args) {

        // singleton simplu
        PortMaritim p1 = PortMaritim.getInstance();
        PortMaritim p2 = PortMaritim.getInstance();
        p2.setNume("f");

        if (p1 == p2) {
            System.out.println("același port\n");
        }
        else {
            System.out.println("porturi diferite\n");
        }


        // singleton multiplu
        Nava n1 = new Nava("HYDRO-A1", 50900, 10);
        Nava n2 = new Nava("Black Pearl", 3780, 32);
        Nava n3 = new Nava("GSP-Saturn", 15200, 45);
        Nava n4 = new Nava("RO-CARGO 500-B", 20000, 20);

        DanaAcostare.adaugaNava(n1);
        DanaAcostare.adaugaNava(n2);
        DanaAcostare.adaugaNava(n3);
        DanaAcostare.adaugaNava(n4);

        System.out.println(DanaAcostare.getInstance(1));
        System.out.println(DanaAcostare.getInstance(2));
        System.out.println(DanaAcostare.getInstance(3));
    }
}
