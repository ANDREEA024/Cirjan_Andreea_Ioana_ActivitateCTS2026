package DP2026.ProblemeCTS.Spital.A8.clase;

public interface IStructuraSpital {
    void adaugaNod(IStructuraSpital nod) throws Exception;
    void stergeNod(IStructuraSpital nod) throws Exception;
    IStructuraSpital getNod(int index) throws Exception;
    void descriere();
}
