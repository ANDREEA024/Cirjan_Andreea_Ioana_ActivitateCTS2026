package DP2026.ProblemeCTS.Spital.A5.program;

import DP2026.ProblemeCTS.Spital.A5.clase.*;

public class Program {

    public static void main(String[] args) {

        System.out.println("________ FARMACIE NORMALĂ ________");
        IMedicamentFarmacie mf1 = new MedicamentFarmacie();
        mf1.cumparaMedicament();

        System.out.println("\n________ SPITAL (cu rețetă validă) ________");
        IMedicamentSpital ms1 = new MedicamentSpital(true);
        ms1.achizitioneazaMedicament();

        System.out.println("\n________ SPITAL (fără rețetă) ________");
        IMedicamentSpital ms2 = new MedicamentSpital(false);
        ms2.achizitioneazaMedicament();

        System.out.println("\n________ FARMACIE + ADAPTER (cu rețetă) ________");
        IMedicamentFarmacie mfa1 = new AdapterMedicament(ms1);
        mfa1.cumparaMedicament();

        System.out.println("\n________ FARMACIE + ADAPTER (fără rețetă) ________");
        IMedicamentFarmacie mfa2 = new AdapterMedicament(ms2);
        mfa2.cumparaMedicament();
    }
}