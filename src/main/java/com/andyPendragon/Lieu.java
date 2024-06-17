package com.andyPendragon;

import java.util.ArrayList;

public class Lieu {
    private String nom;
    private ArrayList<Lieu> lieuxAdjacents; // Must be a Set<Lieu> but List ease the readibility

    public Lieu(String nom){
        this.nom = nom;
        this.lieuxAdjacents = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Lieu> getLieuxAdjacents() {
        return lieuxAdjacents;
    }

    public void addLieuAdjacent(Lieu lieuAdjacent) {
        lieuxAdjacents.add(lieuAdjacent);
    }
}
