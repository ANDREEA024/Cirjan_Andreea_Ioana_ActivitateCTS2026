package DP2026.ProblemeCTS.Spital.A5.clase;

public class MedicamentSpital implements IMedicamentSpital {

    private boolean areReteta;

    public MedicamentSpital(boolean areReteta) {
        this.areReteta = areReteta;
    }

    @Override
    public boolean prezintaReteta() {
        System.out.println("[SPITAL] Se verifică rețeta...");
        return areReteta;
    }

    @Override
    public boolean achizitioneazaMedicament() {
        System.out.println("[SPITAL] Se încearcă achiziționarea medicamentului...");

        if (!prezintaReteta()) {
            System.out.println("[SPITAL] Rețeta NU este validă. Medicamentul NU poate fi eliberat.");
            return false;
        }

        System.out.println("[SPITAL] Rețetă validă. Medicamentul a fost eliberat.");
        return true;
    }
}