package DP2026.Seminar.Feb21.SimpleFactory.dispozitive;

public class Smartwatch extends Dispozitiv {
    public Smartwatch(int nivelBaterie) {
        super(nivelBaterie);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Smartwatch {");
        sb.append("nivelBaterie=").append(super.nivelBaterie);
        sb.append('}');
        return sb.toString();
    }
}
