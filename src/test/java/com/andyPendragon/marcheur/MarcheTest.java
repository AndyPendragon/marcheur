package com.andyPendragon.marcheur;

import com.andyPendragon.Lieu;
import com.andyPendragon.Marche;
import com.andyPendragon.Marcheur;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MarcheTest {

    @Test
    void marche_de_bjarni_commence_par_hei() {
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

        var bjarni = new Marcheur("Bjarni");

        Marche marcheDeBjarni = bjarni.marcher(hei, esti);

        ArrayList<Lieu> lieuxVisites = marcheDeBjarni.lieuxVisitee();

        assertEquals(hei, lieuxVisites.getFirst());
        }

    @Test
    void marche_de_bjarni_fini_par_esti() {
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

        var bjarni = new Marcheur("Bjarni");

        Marche marcheDeBjarni = bjarni.marcher(hei, esti);

        ArrayList<Lieu> lieuxVisites = marcheDeBjarni.lieuxVisitee();

        assertEquals(esti, lieuxVisites.getLast());
    }

    @Test
    void marche_de_bjarni_superieur_a_3(){
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

        var bjarni = new Marcheur("Bjarni");

        Marche marcheDeBjarni = bjarni.marcher(hei, esti);

        ArrayList<Lieu> lieuxVisites = marcheDeBjarni.lieuxVisitee();

        int deplacementMinimale = 3;
        assertTrue(lieuxVisites.size() >= deplacementMinimale);
    }

    @Test
    void marche_bjarni_possede_des_lieux_adjacents(){
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

        var bjarni = new Marcheur("Bjarni");

        Marche marcheDeBjarni = bjarni.marcher(hei, esti);

        ArrayList<Lieu> lieuxVisites = marcheDeBjarni.lieuxVisitee();

        System.out.println("---");
        for (Lieu lieuVisite : lieuxVisites) System.out.println(lieuVisite.getNom());

        for(int i = 0; i < lieuxVisites.size() - 1 ; i++) {
            if (i + 1 >= lieuxVisites.size()) {
                break;
            }
            Lieu lieuActuel = lieuxVisites.get(i);
            Lieu lieuSuivant = lieuxVisites.get(i + 1);

        assertTrue(lieuActuel.getLieuxAdjacents().contains(lieuSuivant), "Chaque lieu visité doit être adjacent au lieu précédent");
        }
    }

    @Test
    void marche_de_bjarni_retourne_de_esti_a_hei() {
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

        var bjarni = new Marcheur("Bjarni");

        Marche marcheDeBjarni = bjarni.marcher(esti, hei);

        ArrayList<Lieu> lieuxVisites = marcheDeBjarni.lieuxVisitee();

        System.out.println("---");
        for (Lieu lieuVisite : lieuxVisites) System.out.println(lieuVisite.getNom());

        assertEquals(esti, lieuxVisites.getFirst());
        assertEquals(hei, lieuxVisites.getLast());
    }

    @Test
    void marche_de_bjarni_de_pullman_a_sekolintsika() {
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

        var bjarni = new Marcheur("Bjarni");

        Marche marcheDeBjarni = bjarni.marcher(pullman, sekolintsika);

        ArrayList<Lieu> lieuxVisites = marcheDeBjarni.lieuxVisitee();

        System.out.println("---");
        for (Lieu lieuVisite : lieuxVisites) System.out.println(lieuVisite.getNom());

        assertEquals(pullman, lieuxVisites.getFirst());
        assertEquals(sekolintsika, lieuxVisites.getLast());
    }
}