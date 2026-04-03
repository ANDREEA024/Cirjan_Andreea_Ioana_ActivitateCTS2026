package DP2026.ProblemeCTS.Spital.A5.clase;

public class AdapterMedicament implements IMedicamentFarmacie {

    private IMedicamentSpital medicamentSpital;

    public AdapterMedicament(IMedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public boolean cumparaMedicament() {
        System.out.println("[ADAPTER] Farmacia folosește logica spitalului...");
        boolean rezultat = medicamentSpital.achizitioneazaMedicament();

        if (!rezultat) {
            System.out.println("[ADAPTER] Medicamentul nu a fost cumpărat deoarece rețeta nu este validă.");
        }
        return rezultat;
    }
}