package DP2026.ProblemeCTS.Restaurant.B8.clase;

import java.util.ArrayList;
import java.util.List;

public class SectiuneMeniu implements IMeniu {

    private String numeSectiune;
    private List<IMeniu> lista = new ArrayList<>();

    public SectiuneMeniu(String numeSectiune) {
        this.numeSectiune = numeSectiune;
    }

    @Override
    public void adaugaNod(IMeniu nod) {
        lista.add(nod);
    }

    @Override
    public void stergeNod(IMeniu nod) {
        lista.remove(nod);
    }

    @Override
    public IMeniu getNod(int index) {
        return lista.get(index);
    }

    @Override
    public void descriereMeniu() {
        System.out.println("__________________________\nSectiune: " + numeSectiune);
        for (IMeniu nod : lista) {
            nod.descriereMeniu();
        }
    }
}