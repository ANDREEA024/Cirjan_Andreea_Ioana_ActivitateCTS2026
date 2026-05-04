package DP2026.ProblemeCTS.Spital.A10.clase;

import java.util.HashMap;

public class FabricaDePacienti {

    private HashMap<String, IPacient> pacienti;

    public FabricaDePacienti() {
        pacienti = new HashMap<String, IPacient>();
    }

    public IPacient getPacient(String cnp, String nume, String telefon, String adresa) {
        if (pacienti.containsKey(cnp)) {
            return pacienti.get(cnp);
        } else {
            IPacient pacient = new Pacient(cnp, nume, telefon, adresa);
            pacienti.put(cnp, pacient);
            return pacient;
        }
    }

    public int getNumarPacienti() {
        return pacienti.size();
    }
}
