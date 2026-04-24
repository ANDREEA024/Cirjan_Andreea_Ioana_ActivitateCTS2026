package DP2026.ProblemeCTS.Restaurant.B7.decorator;

import DP2026.ProblemeCTS.Restaurant.B7.clase.INotaDePlata;

public class NotaDePlataCuFelicitare extends DecoratorNotaDePlata {

    public NotaDePlataCuFelicitare(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani! An nou fericit!");
    }
}