package DP2026.ProblemeCTS.Practica.SingletonFactory.cts.cirjan.andreea.as.singleton.model;

public class Service implements IService {

    private static Service instance = null;
    private AMasina masinaCurenta;

    private Service() {}

    public static synchronized Service getInstance() {
        if (instance == null) {
            instance = new Service();
        }
        return instance;
    }

    @Override
    public void preluareMasina(AMasina masina) {
        this.masinaCurenta = masina;
    }

    public void afisareMasina() {
        System.out.println("In service se afla: " + masinaCurenta);
    }
}