package DP2026.ProblemeCTS.Spital.A9.clase;

public class ProxyInternare implements IPacient {

    private Internare internare;

    public ProxyInternare(Internare internare) {
        this.internare = internare;
    }

    @Override
    public void interneaza() {
        if (internare.getPacient().isAreAsigurare()) {
            internare.interneaza();
        } else {
            System.out.println("PACIENT: [" + internare.getPacient().getNume() + "], INTERNARE: [NU poate fi realizata fara asigurare medicala]");
        }
    }
}
