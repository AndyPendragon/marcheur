package com.andyPendragon.marcheur;

import com.andyPendragon.Carte;
import com.andyPendragon.Lieu;
import com.andyPendragon.Marche;
import com.andyPendragon.Marcheur;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MarcheTest {

    @Test
    void marche_aleatoire_de_bjarni() {

        var marais = new Lieu("Marais");
        var sekolintsika = new Lieu("Sekolintsika");
        var hei = new Lieu("HEI");
        var pullman = new Lieu("Pullman");
        var nexta = new Lieu("NextA");
        var balancoire = new Lieu("Balancoire");
        var boulevard_de_l_europe = new Lieu("Boulevard de l'Europe");
        var esti = new Lieu("ESTI");
        
        marais.addLieuAdjacent(sekolintsika);

        sekolintsika.addLieuAdjacent(marais);
        sekolintsika.addLieuAdjacent(hei);

        hei.addLieuAdjacent(sekolintsika);
        hei.addLieuAdjacent(pullman);
        hei.addLieuAdjacent(balancoire);

        pullman.addLieuAdjacent(hei);
        pullman.addLieuAdjacent(nexta);
        pullman.addLieuAdjacent(balancoire);

        nexta.addLieuAdjacent(pullman);

        balancoire.addLieuAdjacent(pullman);
        balancoire.addLieuAdjacent(hei);
        balancoire.addLieuAdjacent(boulevard_de_l_europe);
        balancoire.addLieuAdjacent(esti);

        boulevard_de_l_europe.addLieuAdjacent(esti);
        boulevard_de_l_europe.addLieuAdjacent(balancoire);

        esti.addLieuAdjacent(boulevard_de_l_europe);
        esti.addLieuAdjacent(balancoire);

        var carteAntananarivo = new Carte("Antananarivo", Set.of(marais, sekolintsika, hei, pullman, nexta, balancoire, boulevard_de_l_europe, esti));

        var bjarni = new Marcheur("Bjarni");

        Marche marcheDeBjarni = bjarni.marcher(carteAntananarivo, hei, esti);

        ArrayList<Lieu> lieuxVisites = marcheDeBjarni.lieuxVisitee();
        for (Lieu lieuxVisite : lieuxVisites) System.out.println(lieuxVisite.getNom());

        assertEquals(hei, lieuxVisites.getFirst(), "Le lieu de départ doit être HEI");
        assertEquals(esti, lieuxVisites.getLast(), "Le lieu d'arrivée doit être ESTI");

        int deplacementMinimale = 3;
        assertTrue(lieuxVisites.size() >= deplacementMinimale);

//        for (int i = 0; i < lieuxVisites.size() - 1; i++) {
//            Lieu lieuActuel = lieuxVisites.get(i);
//            Lieu lieuSuivant = lieuxVisites.get(i + 1);
//            assertTrue(lieuActuel.getLieuxAdjacents().contains(lieuSuivant), "Chaque lieu visité doit être adjacent au lieu précédent");
//        }
    }
}
