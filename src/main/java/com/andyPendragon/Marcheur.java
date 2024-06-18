package com.andyPendragon;

import java.util.ArrayList;
import java.util.Random;

public record Marcheur(String nom) {
    public Marche marcher(Lieu depart, Lieu arrivee) throws AucunLieuAdjacent {
        ArrayList<Lieu> lieuxVisites = new ArrayList<>();

        Random random = new Random();

        lieuxVisites.add(depart);
        Lieu lieuActuel = depart;

        while (!lieuxVisites.contains(arrivee)) {
            ArrayList<Lieu> lieuxAdjacents = lieuActuel.getLieuxAdjacents();

            if (lieuxAdjacents.isEmpty()) {
                System.out.println(lieuActuel.getNom() + ": " + lieuxAdjacents.size() +" elements");
                throw new AucunLieuAdjacent();
            }
            int indexAleatoire = random.nextInt(lieuxAdjacents.size());
            lieuActuel = lieuxAdjacents.get(indexAleatoire);

            lieuxVisites.add(lieuActuel);
        }

        return new Marche(lieuxVisites);
    }
}
