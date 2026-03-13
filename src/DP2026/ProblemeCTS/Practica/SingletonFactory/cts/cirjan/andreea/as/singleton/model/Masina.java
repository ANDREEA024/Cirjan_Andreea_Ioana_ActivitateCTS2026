package DP2026.ProblemeCTS.Practica.SingletonFactory.cts.cirjan.andreea.as.singleton.model;

public class Masina extends AMasina {

    public Masina(String marca, String serieSasiu, int nrBoxe) {
        super();
        this.marca = marca;
        this.serieSasiu = serieSasiu;
        this.nrBoxe = nrBoxe;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                ", serieSasiu='" + serieSasiu + '\'' +
                ", nrBoxe=" + nrBoxe +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public String getSerieSasiu() {
        return serieSasiu;
    }

    public int getNrBoxe() {
        return nrBoxe;
    }
}
