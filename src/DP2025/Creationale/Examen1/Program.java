package DP2025.Creationale.Examen1;

import DP2025.Creationale.Examen1.AMasina;
import DP2025.Creationale.Examen1.factory.FactoryMasina;
import DP2025.Creationale.Examen1.factory.TipMasina;
import DP2025.Creationale.Examen1.singleton.ServiceAuto;

public class Program {
    public static void main(String[] args) throws Exception {
        ServiceAuto service = ServiceAuto.getInstance();

        AMasina m1 = FactoryMasina.creareMasina(TipMasina.SUV, "BMW", "X5-123", 3);
        AMasina m2 = FactoryMasina.creareMasina(TipMasina.SEDAN, "Audi", "A4-456", 2);
        AMasina m3 = FactoryMasina.creareMasina(TipMasina.VAN, "Skoda", "OCT-789", 2);
        AMasina m4 = FactoryMasina.creareMasina(TipMasina.SUV, "Toyota", "RAV-321", 4);

        service.preluareMasina(m1);
        service.preluareMasina(m2);
        service.preluareMasina(m3);
        service.preluareMasina(m4);
    }
}