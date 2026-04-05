package DP2026.ProblemeCTS.Restaurant.B6.clase;

public class Facade {

    public static void verificareMasa(int numarMasa) {

        Receptionera receptionera = new Receptionera();
        MeseLibere meseLibere = new MeseLibere();

        if (numarMasa < 1 || numarMasa > receptionera.getNumarTotalMese()) {
            System.out.println("Masa [" + numarMasa + "] nu există.\n");
            return;
        }

        if (!meseLibere.verificaMasaLibera(numarMasa)) {
            System.out.println("Masa [" + numarMasa + "] este ocupată.\n");
            return;
        }

        boolean curata = receptionera.esteMasaCurata(numarMasa);
        boolean servetele = receptionera.areServeteleNoi(numarMasa);

        if (curata && servetele) {
            System.out.println("Masa [" + numarMasa + "] este disponibilă.\n");
        } else if (!curata && !servetele) {
            System.out.println("Masa [" + numarMasa + "] este liberă dar murdară și fără șervețele.\n");
        } else if (!curata) {
            System.out.println("Masa [" + numarMasa + "] este liberă dar murdară.\n");
        } else {
            System.out.println("Masa [" + numarMasa + "] este liberă dar fără șervețele.\n");
        }
    }
}
