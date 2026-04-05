package DP2026.ProblemeCTS.Spital.A6.clase;

public class Facade {

    public static void interneazaPacient(Pacient pacient, Medic medic, Salon salon) {

        System.out.println("Verificare criterii internare..");

        if (!pacient.areStareGrava()) {
            System.out.println("Pacient: '" + pacient.getNume() + "', internat: 'NU', motiv: 'starea NU este gravă'\n");
            return;
        }

        if (!medic.confirmaInternarea(pacient)) {
            System.out.println("Pacient: '" + pacient.getNume() + "', internat: 'NU', motiv: 'medicul NU confirmă internarea'.\n");
            return;
        }

        if (!salon.existaPatLiber()) {
            System.out.println("Pacient: '" + pacient.getNume() + "', internat: 'NU', motiv: 'NU există paturi libere în salon'.\n");
            return;
        }

        int pat = salon.seOcupaPat();
        System.out.println("Pacient: '" + pacient.getNume() + "', internat: 'DA', motiv: 'stare gravă', pat: '" + pat + "'.\n");
    }
}