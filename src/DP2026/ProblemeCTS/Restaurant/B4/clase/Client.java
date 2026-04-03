package DP2026.ProblemeCTS.Restaurant.B4.clase;

public class Client implements Cloneable {
    private String nume;
    private String telefon;
    private String email;

    public Client(String nume, String telefon, String email) {
        System.out.println("Creare obiect Client..");
        this.nume = nume;
        this.telefon = telefon;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public Client clone() {
        try {
            return (Client) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Eroare la clonare.");
        }
    }

    @Override
    public String toString() {
        return "Client: [NUME: " + nume + ", NR. TELEFON: " + telefon + ", EMAIL: " + email + "]\n";
    }
}

