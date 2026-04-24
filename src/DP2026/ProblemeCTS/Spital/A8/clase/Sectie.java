package DP2026.ProblemeCTS.Spital.A8.clase;

public class Sectie implements IStructuraSpital {

    private String numeSectie;
    private int etaj;

    public Sectie(String numeSectie, int etaj) {
        this.numeSectie = numeSectie;
        this.etaj = etaj;
    }

    @Override
    public void adaugaNod(IStructuraSpital nod) throws Exception {
        throw new Exception("Nu se pot adauga noduri într-o secție.");
    }

    @Override
    public void stergeNod(IStructuraSpital nod) throws Exception {
        throw new Exception("Nu se pot sterge noduri dintr-o secție.");
    }

    @Override
    public IStructuraSpital getNod(int index) throws Exception {
        throw new Exception("Secția nu conține sub-noduri.");
    }

    @Override
    public void descriere() {
        System.out.println("   Secție: " + numeSectie + " - etaj " + etaj);
    }
}