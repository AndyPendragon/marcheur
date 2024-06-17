package com.andyPendragon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public record Marcheur(String nom) {
    public Marche marcher(Carte carte, Lieu depart, Lieu arrivee) {
        List<Lieu> lieuxVisites = new ArrayList<>();
        Random random = new Random();

        lieuxVisites.add(depart);
        Lieu lieuActuel = depart;

        while (!lieuActuel.equals(arrivee)) {
            List<Lieu> lieuxAdjacents = lieuActuel.getLieuxAdjacents();

            if (lieuxAdjacents.isEmpty()) {
                break;
            }

            int indexAleatoire = random.nextInt(lieuxAdjacents.size());
            lieuActuel = lieuxAdjacents.get(indexAleatoire);

            lieuxVisites.add(lieuActuel);
        }

        return new Marche(lieuxVisites);
    }
}
