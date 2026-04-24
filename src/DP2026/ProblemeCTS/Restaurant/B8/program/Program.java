package DP2026.ProblemeCTS.Restaurant.B8.program;

import DP2026.ProblemeCTS.Restaurant.B8.clase.*;

public class Program {

    public static void main(String[] args) {

        IMeniu meniuPrincipal = new SectiuneMeniu("Meniu Restaurant");

        IMeniu sectiuneStartere = new SectiuneMeniu("Startere");
        IMeniu sectiuneBauturi = new SectiuneMeniu("Bauturi");
        IMeniu sectiuneDesert = new SectiuneMeniu("Desert");

        IMeniu subsectiuneSucuri = new SectiuneMeniu("Sucuri");
        IMeniu subsectiuneCafea = new SectiuneMeniu("Cafea");

        IMeniu itemApaPlata = new ItemMeniu("Apa plata");
        IMeniu itemApaMinerala = new ItemMeniu("Apa minerala");
        IMeniu itemCocaCola = new ItemMeniu("Coca-Cola");
        IMeniu itemEspresso = new ItemMeniu("Espresso");
        IMeniu itemBruschete = new ItemMeniu("Bruschete");
        IMeniu itemTiramisu = new ItemMeniu("Tiramisu");
        IMeniu itemCheeseCake = new ItemMeniu("CheeseCake");

        try {
            subsectiuneSucuri.adaugaNod(itemApaPlata);
            subsectiuneSucuri.adaugaNod(itemApaMinerala);
            subsectiuneSucuri.adaugaNod(itemCocaCola);

            subsectiuneCafea.adaugaNod(itemEspresso);

            sectiuneStartere.adaugaNod(itemBruschete);

            sectiuneDesert.adaugaNod(itemTiramisu);
            sectiuneDesert.adaugaNod(itemCheeseCake);

            sectiuneBauturi.adaugaNod(subsectiuneSucuri);
            sectiuneBauturi.adaugaNod(subsectiuneCafea);

            meniuPrincipal.adaugaNod(sectiuneStartere);
            meniuPrincipal.adaugaNod(sectiuneBauturi);
            meniuPrincipal.adaugaNod(sectiuneDesert);

            System.out.println("MENIU INITIAL");
            meniuPrincipal.descriereMeniu();

            IMeniu nod = sectiuneBauturi.getNod(0);
            System.out.println("\n\n\n\nPrimul nod din sectiunea Bauturi:");
            nod.descriereMeniu();

            subsectiuneSucuri.stergeNod(itemCocaCola);
            System.out.println("\n\n\n\nMENIU DUPA STERGERE ITEM:");
            meniuPrincipal.descriereMeniu();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
