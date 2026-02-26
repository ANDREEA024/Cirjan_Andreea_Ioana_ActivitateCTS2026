package DP2025.Creationale.Examen1.singleton;
import DP2025.Creationale.Examen1.AMasina;
import DP2025.Creationale.Examen1.IService;

public class ServiceAuto implements IService {
    private static ServiceAuto instanta = null;

    private ServiceAuto() {}

    public static synchronized ServiceAuto getInstance() {
        if (instanta == null) {
            instanta = new ServiceAuto();
        }
        return instanta;
    }

    @Override
    public void preluareMasina(AMasina masina) {
        System.out.println("Masina preluata pentru reparatii: " + masina.toString());
    }
}