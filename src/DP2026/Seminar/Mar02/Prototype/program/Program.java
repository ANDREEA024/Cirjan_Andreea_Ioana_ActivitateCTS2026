package DP2026.Seminar.Mar02.Prototype.program;
import DP2026.Seminar.Mar02.Prototype.models.Rezervare;

public class Program {

    public static void main(String[] args) {
//        Prototype rezervare = new Rezervare("JohnDoe", "0723111111", 3);
//        Prototype rezervare2 = rezervare.copiaza();
//        ((Rezervare)rezervare2).setNrPersoane(20);

        Rezervare rezervare = new Rezervare("JohnDoe", "0723111111", 3);
        Rezervare rezervare2 = null;
        try {
            rezervare2 = rezervare.copiaza();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        rezervare2.setNrPersoane(20);

        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());
    }
}