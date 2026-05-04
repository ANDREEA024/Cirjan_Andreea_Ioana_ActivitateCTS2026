package DP2026.ProblemeCTS.Spital.A10.program;

import DP2026.ProblemeCTS.Spital.A10.clase.FabricaDePacienti;
import DP2026.ProblemeCTS.Spital.A10.clase.IPacient;
import DP2026.ProblemeCTS.Spital.A10.clase.Internare;

public class Program {

    public static void main(String[] args) {

        FabricaDePacienti fabrica = new FabricaDePacienti();

        Internare internare1 = new Internare(4, 5, 10);
        Internare internare2 = new Internare(3, 1, 2);
        Internare internare3 = new Internare(2, 2, 4);

        IPacient pacient1 = fabrica.getPacient("468902573120", "Andreea Cirjan", "0745123456", "Str. Stefan cel Mare nr. 22");
        pacient1.printareInternare(internare1);
        fabrica.getPacient("456900304333", "Andreea Cirjan", "0738018459", "Str. Stefan cel Mare nr. 20").printareInternare(internare2);
        fabrica.getPacient("468902573120", "Popescu", "0745123456", "Str. Libertatii 10").printareInternare(internare3);

        System.out.println("\nNr. pacienti: " + fabrica.getNumarPacienti());
    }
}
