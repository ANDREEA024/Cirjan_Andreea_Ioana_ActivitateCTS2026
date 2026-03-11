package DP2026.ProblemeCTS.Restaurant.B2.builderclass;

public class Rezervare2 {
    private boolean laGeam;
    private boolean scaunErgonomic;
    private String decorMasa;
    private String muzicaPreferata;

    private Rezervare2(BuilderRezervare builder) {
        this.laGeam = builder.laGeam;
        this.scaunErgonomic = builder.scaunErgonomic;
        this.decorMasa = builder.decorMasa;
        this.muzicaPreferata = builder.muzicaPreferata;
    }

    public static class BuilderRezervare {
        private boolean laGeam;
        private boolean scaunErgonomic;
        private String decorMasa = "flori simple";
        private String muzicaPreferata = "jazz";

        public BuilderRezervare setLaGeam(boolean laGeam) {
            this.laGeam = laGeam;
            return this;
        }

        public BuilderRezervare setScaunErgonomic(boolean scaunErgonomic) {
            this.scaunErgonomic = scaunErgonomic;
            return this;
        }

        public BuilderRezervare setDecorMasa(String decorMasa) {
            this.decorMasa = decorMasa;
            return this;
        }

        public BuilderRezervare setMuzicaPreferata(String muzicaPreferata) {
            this.muzicaPreferata = muzicaPreferata;
            return this;
        }

        public Rezervare2 build() {
            return new Rezervare2(this);
        }
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

