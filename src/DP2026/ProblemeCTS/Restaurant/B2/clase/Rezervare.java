package DP2026.ProblemeCTS.Restaurant.B2.clase;

public class Rezervare {
    private boolean laGeam;
    private boolean scaunErgonomic;
    private String decorMasa;
    private String muzicaPreferata;

    public Rezervare(boolean laGeam, boolean scaunErgonomic, String decorMasa, String muzicaPreferata) {
        this.laGeam = laGeam;
        this.scaunErgonomic = scaunErgonomic;
        this.decorMasa = decorMasa;
        this.muzicaPreferata = muzicaPreferata;
    }

    public boolean isLaGeam() {
        return laGeam;
    }

    public void setLaGeam(boolean laGeam) {
        this.laGeam = laGeam;
    }

    public boolean isScaunErgonomic() {
        return scaunErgonomic;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public String getDecorMasa() {
        return decorMasa;
    }

    public void setDecorMasa(String decorMasa) {
        this.decorMasa = decorMasa;
    }

    public String getMuzicaPreferata() {
        return muzicaPreferata;
    }

    public void setMuzicaPreferata(String muzicaPreferata) {
        this.muzicaPreferata = muzicaPreferata;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "laGeam=" + laGeam +
                ", scaunErgonomic=" + scaunErgonomic +
                ", decorMasa='" + decorMasa + '\'' +
                ", muzicaPreferata='" + muzicaPreferata + '\'' +
                '}';
    }
}
