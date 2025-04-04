package DP.Creationale.Examen1.factory;
import DP.Creationale.Examen1.AMasina;

public class FactoryMasina {
    public static AMasina creareMasina(TipMasina tip, String marca, String serieSasiu, int nrBoxe) throws Exception {
        switch (tip) {
            case SUV:
                return new FactorySUV(marca, serieSasiu, nrBoxe);
            case SEDAN:
                return new FactorySedan(marca, serieSasiu, nrBoxe);
            case VAN:
                return new FactoryVAN(marca, serieSasiu, nrBoxe);
             default:
                 throw new Exception("Nu este un tip de masina acceptat!");
        }
    }
}