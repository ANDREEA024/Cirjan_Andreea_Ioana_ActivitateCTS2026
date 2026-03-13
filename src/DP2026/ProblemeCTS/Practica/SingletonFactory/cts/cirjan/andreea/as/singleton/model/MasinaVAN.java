package DP2026.ProblemeCTS.Practica.SingletonFactory.cts.cirjan.andreea.as.singleton.model;

public class MasinaVAN extends AMasina {

    public MasinaVAN(String serieSasiu, int nrBoxe) {
        this.marca = ETipMasina.VAN.toString();
        this.serieSasiu = serieSasiu;
        this.nrBoxe = nrBoxe;
    }

    @Override
    public String toString() {
        return "MasinaVAN{" +
                "marca='" + marca + '\'' +
                ", serieSasiu='" + serieSasiu + '\'' +
                ", nrBoxe=" + nrBoxe +
                '}';
    }
}

