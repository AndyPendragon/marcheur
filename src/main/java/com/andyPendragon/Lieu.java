package com.andyPendragon;

import java.util.List;

public class Lieu {
    private String nom;
    private ArrayList<Lieu> lieuxAdjacents; // Must be a Set<Lieu> but List ease the readibility
    private ArrayList<Lieu> lieuxAdjacents; // Must be a Set<Lieu> but List ease the readibility

    public Lieu(String nom){
        this.nom = nom;
        this.lieuxAdjacents = List.of();
    }

    public String getNom() {
        return nom;
    }

    public List<Lieu> getLieuxAdjacents() {
        return lieuxAdjacents;
    }

    public void addLieuxAdjacents(Lieu lieuAjoutee) {
        lieuxAdjacents.add(lieuAjoutee);
    }
}
