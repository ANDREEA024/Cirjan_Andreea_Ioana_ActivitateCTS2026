package DP2025.Creationale.Examen1.factory;
import DP2025.Creationale.Examen1.AMasina;

public class FactorySUV extends AMasina {
    public FactorySUV(String marca, String serieSasiu, int nrBoxe) {
        this.marca = marca;
        this.serieSasiu = serieSasiu;
        this.nrBoxe = nrBoxe;
    }

    @Override
    public String toString() {
        return "SUV [marca=" + marca + ", serieSasiu=" + serieSasiu + ", nrBoxe=" + nrBoxe + "]";
    }
}

