package DP2026.ProblemeCTS.Spital.A9.clase;

public class Internare implements IPacient {

    private Pacient pacient;

    public Internare(Pacient pacient) {
        this.pacient = pacient;
    }

    public Pacient getPacient() {
        return pacient;
    }

    @Override
    public void interneaza() {
        System.out.println("PACIENT: [" + pacient.getNume() + "], INTERNARE: [reusita]");
    }
}
