package DP2026.ProblemeCTS.Spital.A4.clase;

public class Reteta implements IReteta {

    private final String nume;
    private final int cantitateSolutieA;
    private final int cantitateSolutieB;
    private final int cantitateSolutieC;

    public Reteta(String nume, int a, int b, int c) {
        this.nume = nume;
        this.cantitateSolutieA = a;
        this.cantitateSolutieB = b;
        this.cantitateSolutieC = c;
    }

    @Override
    public IReteta clonare() {
        System.out.println("Clonare rețetă pentru " + nume + "...");
        return new Reteta(this.nume, this.cantitateSolutieA, this.cantitateSolutieB, this.cantitateSolutieC);
    }

    @Override
    public String toString() {
        return "Reteta {" +
                "nume - " + nume +
                ", A - " + cantitateSolutieA +
                "ml, B - " + cantitateSolutieB +
                "ml, C - " + cantitateSolutieC +
                "ml}";
    }
}