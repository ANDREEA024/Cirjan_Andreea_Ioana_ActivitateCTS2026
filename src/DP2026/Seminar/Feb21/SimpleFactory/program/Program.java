package DP2026.Seminar.Feb21.SimpleFactory.program;

import DP2026.Seminar.Feb21.SimpleFactory.dispozitive.Dispozitiv;
import DP2026.Seminar.Feb21.SimpleFactory.factory.FabricaDispozitive;
import DP2026.Seminar.Feb21.SimpleFactory.factory.TipDispozitiv;

public class Program {
    public static void main(String[] args) {
        FabricaDispozitive fabrica = FabricaDispozitive.getInstanta();
        Dispozitiv laptop = fabrica.getDispozitiv(TipDispozitiv.Laptop, 80);
        Dispozitiv telefon = fabrica.getDispozitiv(TipDispozitiv.Smartphone, 73);
        Dispozitiv smartwatch = fabrica.getDispozitiv(TipDispozitiv.Smartwatch, 50);

        System.out.println(laptop.toString());
        System.out.println(telefon.toString());
        System.out.println(smartwatch.toString());
    }
}
