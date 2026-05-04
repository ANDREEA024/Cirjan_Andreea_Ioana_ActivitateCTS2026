package DP2026.ProblemeCTS.Spital.A10.clase;

public class Pacient implements IPacient {

    private String cnp;
    private String nume;
    private String telefon;
    private String adresa;

    public Pacient(String cnp, String nume, String telefon, String adresa) {
        this.cnp = cnp;
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    @Override
    public void printareInternare(Internare internare) {
        System.out.println(this.toString() + " " + internare.toString());
    }

    @Override
    public String toString() {
        return "PACIENT [CNP: " + cnp + ", nume: " + nume + ", telefon: " + telefon + ", adresa: " + adresa + "]";
    }
}
