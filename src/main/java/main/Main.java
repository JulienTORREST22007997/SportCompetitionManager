package main;

import model.Amateur;
import model.Competiteur;
import model.Competition;

public class Main {
        public static void main(String[] args) {
                Competition competition = new Competition();

                competition.ajouterCompetiteur(new Competiteur("Damso", 20));
                competition.ajouterCompetiteur(new Competiteur("Jul", 15));
                competition.ajouterCompetiteur(new Competiteur("Obama", 25));
                competition.ajouterCompetiteur(new Competiteur("Travis", 10));

                competition.ajouterAmateur(new Amateur("John", 5));
                competition.ajouterAmateur(new Amateur("Einstein", 8));
                competition.ajouterAmateur(new Amateur("Rihanna", 12));
                competition.ajouterAmateur(new Amateur("Walter", 3));

                competition.mettreAJourClassement();

                System.out.println("Compétiteurs (triés par score):");
                for (Competiteur competiteur : competition.getCompetiteurs()) {
                        System.out.println(competiteur);
                }

                System.out.println("\nAmateurs (pas trié):");
                for (Amateur amateur : competition.getAmateurs()) {
                        System.out.println(amateur);
                }
        }
}
