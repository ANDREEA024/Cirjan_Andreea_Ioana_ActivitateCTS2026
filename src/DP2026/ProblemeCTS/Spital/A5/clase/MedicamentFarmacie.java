package DP2026.ProblemeCTS.Spital.A5.clase;

public class MedicamentFarmacie implements IMedicamentFarmacie {

    @Override
    public boolean cumparaMedicament() {
        System.out.println("[FARMACIE] Medicamentul a fost cumpărat fără rețetă.");
        return true;
    }
}