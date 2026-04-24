package DP2026.ProblemeCTS.Restaurant.B7.clase;

import java.util.List;

public class NotaDePlata implements INotaDePlata {

    private List<String> listaDePreparateComandate;
    private double totalNotaDePlata;

    public NotaDePlata(List<String> listaDePreparateComandate, double totalNotaDePlata) {
        this.listaDePreparateComandate = listaDePreparateComandate;
        this.totalNotaDePlata = totalNotaDePlata;
    }

    @Override
    public void printeazaNotaDePlata() {
        System.out.println("Nota de plata - "
                + listaDePreparateComandate
                + " - " + totalNotaDePlata + " lei.");
    }

    public List<String> getListaDePreparateComandate() {
        return listaDePreparateComandate;
    }

    public double getTotalNotaDePlata() {
        return totalNotaDePlata;
    }

    public void setTotalNotaDePlata(double totalNotaDePlata) {
        this.totalNotaDePlata = totalNotaDePlata;
    }
}