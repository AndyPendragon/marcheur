package com.andyPendragon.marcheur;

import com.andyPendragon.Carte;
import com.andyPendragon.Lieu;
import com.andyPendragon.Marcheur;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

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

        marais.addLieuxAdjacents(sekolintsika);

        sekolintsika.addLieuxAdjacents(marais);
        sekolintsika.addLieuxAdjacents(hei);

        hei.addLieuxAdjacents(sekolintsika);
        hei.addLieuxAdjacents(pullman);
        hei.addLieuxAdjacents(balancoire);

        pullman.addLieuxAdjacents(hei);
        pullman.addLieuxAdjacents(nexta);
        pullman.addLieuxAdjacents(balancoire);

        balancoire.addLieuxAdjacents(pullman);
        balancoire.addLieuxAdjacents(hei);
        balancoire.addLieuxAdjacents(nexta);
        balancoire.addLieuxAdjacents(boulevard_de_l_europe);
        balancoire.addLieuxAdjacents(esti);

        var carteAntananarivo = new Carte("Antananarivo", Set.of(marais, sekolintsika, hei, pullman, nexta, balancoire, boulevard_de_l_europe, esti));

        var bjarni = new Marcheur("Bjarni");

        var marcheDeBjarni = bjarni.marcher(carteAntananarivo, hei, esti);

        List<Lieu> lieuxVisites = marcheDeBjarni.lieuxVisitee();
        System.out.println(lieuxVisites);

//        assertEquals(hei, lieuxVisites.getFirst(), "Le lieu de départ doit être HEI");
//        assertEquals(esti, lieuxVisites.getLast(), "Le lieu d'arrivée doit être ESTI");
//
//        int meilleurMarchePossible = 3;
//        assertTrue(lieuxVisites.size() >= meilleurMarche);

//        for (int i = 0; i < lieuxVisites.size() - 1; i++) {
//            Lieu lieuActuel = lieuxVisites.get(i);
//            Lieu lieuSuivant = lieuxVisites.get(i + 1);
//            assertTrue(lieuActuel.getLieuxAdjacents().contains(lieuSuivant), "Chaque lieu visité doit être adjacent au lieu précédent");
//        }
    }
}
