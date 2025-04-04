package DP.Creationale.Examen1.factory;
import DP.Creationale.Examen1.AMasina;

public class FactorySedan extends AMasina {
    public FactorySedan(String marca, String serieSasiu, int nrBoxe) {
        this.marca = marca;
        this.serieSasiu = serieSasiu;
        this.nrBoxe = nrBoxe;
    }

    @Override
    public String toString() {
        return "Sedan [marca=" + marca + ", serieSasiu=" + serieSasiu + ", nrBoxe=" + nrBoxe + "]";
    }
}