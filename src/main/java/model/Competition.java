package model;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Competition {
    private final List<Amateur> amateurs;
    private final TreeSet<Competiteur> competiteurs;

    public Competition() {
        this.amateurs = new ArrayList<>();
        this.competiteurs = new TreeSet<>();
    }

    public void mettreAJourClassement() {
        int rang = 1;
        for (Competiteur competiteur : competiteurs) {
            competiteur.setClassement(rang++);
        }
    }
    public void ajouterAmateur(Amateur amateur) {
        amateurs.add(amateur);
    }

    public void ajouterCompetiteur(Competiteur competiteur) {
        competiteurs.add(competiteur);
    }

    public Amateur getAmateur(String nom) {
        for (Amateur amateur : amateurs) {
            if (amateur.getNom().equals(nom)) {
                return amateur;
            }
        }
        return null;
    }

    public List<Amateur> getAmateurs() {
        return amateurs;
    }

    public TreeSet<Competiteur> getCompetiteurs() {
        return new TreeSet<>(competiteurs); // trié
    }

}
