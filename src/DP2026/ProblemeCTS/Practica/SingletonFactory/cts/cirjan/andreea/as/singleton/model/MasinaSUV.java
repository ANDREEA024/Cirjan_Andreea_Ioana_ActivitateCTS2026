package DP2026.ProblemeCTS.Practica.SingletonFactory.cts.cirjan.andreea.as.singleton.model;

public class MasinaSUV extends AMasina {

    public MasinaSUV(String serieSasiu, int nrBoxe) {
        this.marca = ETipMasina.SUV.toString();
        this.serieSasiu = serieSasiu;
        this.nrBoxe = nrBoxe;
    }

    @Override
    public String toString() {
        return "MasinaSUV{" +
                "marca='" + marca + '\'' +
                ", serieSasiu='" + serieSasiu + '\'' +
                ", nrBoxe=" + nrBoxe +
                '}';
    }
}
