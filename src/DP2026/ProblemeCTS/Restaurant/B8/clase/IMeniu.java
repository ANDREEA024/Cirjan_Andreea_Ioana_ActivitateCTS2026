package DP2026.ProblemeCTS.Restaurant.B8.clase;

public interface IMeniu {
    void adaugaNod(IMeniu nod) throws Exception;
    void stergeNod(IMeniu nod) throws Exception;
    IMeniu getNod(int index) throws Exception;
    void descriereMeniu();
}
