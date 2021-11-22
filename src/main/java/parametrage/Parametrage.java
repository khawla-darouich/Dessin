package parametrage;

public class Parametrage {
    private String couleurContour;
    private String couleurRemplissage;
    private Double epaisseur;

    public Parametrage(String couleurContour, String couleurRemplissage, Double epaisseur) {
        this.couleurContour = couleurContour;
        this.couleurRemplissage = couleurRemplissage;
        this.epaisseur = epaisseur;
    }

    public String getCouleurContour() {
        return couleurContour;
    }

    public void setCouleurContour(String couleurContour) {
        this.couleurContour = couleurContour;
    }

    public String getCouleurRemplissage() {
        return couleurRemplissage;
    }

    public void setCouleurRemplissage(String couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
    }

    public Double getEpaisseur() {
        return epaisseur;
    }

    public void setEpaisseur(Double epaisseur) {
        this.epaisseur = epaisseur;
    }

    @Override
    public String toString() {
        return "Parametrage: " +
                "couleur du Contour: '" + couleurContour + '\'' +
                ", couleur du Remplissage: '" + couleurRemplissage + '\'' +
                ", epaisseur: " + epaisseur ;
    }
}
