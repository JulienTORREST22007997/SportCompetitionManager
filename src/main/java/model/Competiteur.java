package model;

public class Competiteur extends Participant implements Comparable<Competiteur> {

    private int classement;

    public Competiteur(String nom, int score) {
        super(nom, score);
    }

    public int getClassement() {
        return classement;
    }

    public void setClassement(int classement) {
        this.classement = classement;
    }

    @Override
    public int compareTo(Competiteur autreCompetiteur) {
        // ordre décroissant
        return autreCompetiteur.getScore() - this.getScore();
    }

    @Override
    public String toString() {
        return "Competiteur{" +
                "nom='" + getNom() + '\'' +
                ", score=" + getScore() +
                ", classement=" + classement +
                '}';
    }
}
