package DP2026.ProblemeCTS.Restaurant.B8.clase;

public class ItemMeniu implements IMeniu {

    private String nume;

    public ItemMeniu(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(IMeniu nod) throws Exception {
        throw new Exception("Nu se poate adauga nod la un item simplu.");
    }

    @Override
    public void stergeNod(IMeniu nod) throws Exception {
        throw new Exception("Nu se poate sterge nod dintr-un item simplu.");
    }

    @Override
    public IMeniu getNod(int index) throws Exception {
        throw new Exception("Itemul nu contine sub-noduri.");
    }

    @Override
    public void descriereMeniu() {
        System.out.println("   Item: " + nume);
    }
}
