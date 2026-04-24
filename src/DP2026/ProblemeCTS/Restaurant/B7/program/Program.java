package DP2026.ProblemeCTS.Restaurant.B7.program;

import DP2026.ProblemeCTS.Restaurant.B7.clase.NotaDePlata;
import DP2026.ProblemeCTS.Restaurant.B7.decorator.DecoratorNotaDePlata;
import DP2026.ProblemeCTS.Restaurant.B7.decorator.NotaDePlataCuFelicitare;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        NotaDePlata nota = new NotaDePlata(Arrays.asList("Suc de portocale", "Tiramisu"), 42.5);
        nota.printeazaNotaDePlata();
        System.out.println();

        DecoratorNotaDePlata notaDecorata = new NotaDePlataCuFelicitare(nota);
        notaDecorata.printeazaNotaDePlata();
    }
}