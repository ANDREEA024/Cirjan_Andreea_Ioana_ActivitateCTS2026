package DP2026.ProblemeCTS.Restaurant.B7.decorator;

import DP2026.ProblemeCTS.Restaurant.B7.clase.INotaDePlata;

public abstract class DecoratorNotaDePlata implements INotaDePlata {

    protected INotaDePlata notaDePlata;

    public DecoratorNotaDePlata(INotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeazaNotaDePlata() {
        notaDePlata.printeazaNotaDePlata();
        printeazaFelicitare();
    }

    public abstract void printeazaFelicitare();
}