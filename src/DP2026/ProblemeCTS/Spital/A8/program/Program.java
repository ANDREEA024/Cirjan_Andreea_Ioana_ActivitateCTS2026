package DP2026.ProblemeCTS.Spital.A8.program;

import DP2026.ProblemeCTS.Spital.A8.clase.*;

public class Program {

    public static void main(String[] args) {

        IStructuraSpital spital = new Departament("Spitalul Județean");

        IStructuraSpital depMedical = new Departament("Departament Medical");
        IStructuraSpital depChirurgie = new Departament("Departament Chirurgie");
        IStructuraSpital depBoliInfectioase = new Departament("Departament Boli Infecțioase");

        IStructuraSpital sectieOrtopedie = new Sectie("Ortopedie", 2);
        IStructuraSpital sectieCardiologie = new Sectie("Cardiologie", 3);
        IStructuraSpital sectiePediatrie = new Sectie("Pediatrie", 1);
        IStructuraSpital sectieBoliInfectioase = new Sectie("Boli Infecțioase", 1);

        try {
            depChirurgie.adaugaNod(sectieOrtopedie);

            depMedical.adaugaNod(sectieCardiologie);
            depMedical.adaugaNod(sectiePediatrie);

            depBoliInfectioase.adaugaNod(sectieBoliInfectioase);

            spital.adaugaNod(depMedical);
            spital.adaugaNod(depChirurgie);
            spital.adaugaNod(depBoliInfectioase);

            System.out.println("STRUCTURA INITIALA:");
            spital.descriere();

            System.out.println("\n\n\n\nPrimul nod din Departamentul Medical:");
            IStructuraSpital primulNodMedical = depMedical.getNod(0);
            primulNodMedical.descriere();

            System.out.println("\n\n\n\nSTRUCTURA DUPA STERGERE:");
            depMedical.stergeNod(sectiePediatrie);
            spital.descriere();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
