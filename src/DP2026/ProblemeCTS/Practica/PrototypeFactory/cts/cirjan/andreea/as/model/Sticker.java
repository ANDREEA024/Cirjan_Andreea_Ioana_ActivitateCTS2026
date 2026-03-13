package DP2026.ProblemeCTS.Practica.PrototypeFactory.cts.cirjan.andreea.as.model;

public class Sticker implements IPrototypeSticker {

    private final int lungime;
    private final int latime;

    public Sticker(int lungime, int latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    @Override
    public IPrototypeSticker clonare() {
        return new Sticker(this.lungime, this.latime);
    }

    public int getLungime() {
        return lungime;
    }

    public int getLatime() {
        return latime;
    }

    @Override
    public String toString() {
        return "Sticker{" +
                "lungime=" + lungime +
                ", latime=" + latime +
                '}';
    }
}
