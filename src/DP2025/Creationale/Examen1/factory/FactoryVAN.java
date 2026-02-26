package DP2025.Creationale.Examen1.factory;
import DP2025.Creationale.Examen1.AMasina;

public class FactoryVAN extends AMasina {
    public FactoryVAN(String marca, String serieSasiu, int nrBoxe) {
        this.marca = marca;
        this.serieSasiu = serieSasiu;
        this.nrBoxe = nrBoxe;
    }

    @Override
    public String toString() {
        return "VAN [marca=" + marca + ", serieSasiu=" + serieSasiu + ", nrBoxe=" + nrBoxe + "]";
    }
}
