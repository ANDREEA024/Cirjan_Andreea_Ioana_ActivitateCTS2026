package DP2026.ProblemeCTS.Practica.Singleton.simplu;

public class PortMaritim {
    private String nume;
    private String tara;
    private static PortMaritim instance = null;

    private PortMaritim(String nume, String tara){
        this.nume=nume;
        this.tara=tara;
    }

    public static synchronized PortMaritim getInstance(){
        if(instance==null)
            instance=new PortMaritim("Port Constanta", "Romania");
        return instance;
    }

    public String getNume() {
        return nume;
    }

    public String getTara() {
        return tara;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    @Override
    public String toString() {
        return "PortMaritim{" +
                "nume='" + nume + '\'' +
                ", tara='" + tara + '\'' +
                '}';
    }
}
