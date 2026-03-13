package DP2026.ProblemeCTS.Practica.SingletonFactory.cts.cirjan.andreea.as.singleton.model;

public class MasinaSEDAN extends AMasina {

    public MasinaSEDAN(String serieSasiu, int nrBoxe) {
        this.marca = ETipMasina.VAN.toString();
        this.serieSasiu = serieSasiu;
        this.nrBoxe = nrBoxe;
    }

    @Override
    public String toString() {
        return "MasinaSEDAN{" +
                "marca='" + marca + '\'' +
                ", serieSasiu='" + serieSasiu + '\'' +
                ", nrBoxe=" + nrBoxe +
                '}';
    }
}
