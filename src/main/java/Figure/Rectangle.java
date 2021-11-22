package Figure;

import parametrage.IParametrage;
import parametrage.Parametrage;

public class Rectangle extends Figure {
    private Point coinSuperieur;
    private double largeur;
    private double hauteur;

    public Rectangle(String nom,Parametrage parametrage,int x , int y, double largeur, double hauteur) {
        super(nom,parametrage);
        this.coinSuperieur = new Point(x,y);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public void update(IParametrage parametrage) {
        this.parametrage= parametrage.getParametrage();
        System.out.println("le rectangle a reçu un nouveau parametrage"+this.parametrage);
    }

    @Override
    public double calculerSurface() {
        return largeur*hauteur;
    }

    @Override
    public double calculerPerimetre() {
        return 2*(largeur+hauteur);
    }

    @Override
    public void dessinerFigure() {
        String tab="";
        for (int i=0; i<this.level;i++)tab+="\t";
        System.out.println(tab+"----------Rectangle: "+nom);
        System.out.println(tab+"\t"+"largeur : "+largeur);
        System.out.println(tab+"\t"+"hauteur : "+hauteur);
        System.out.println(tab+"\t"+"coin supérieur: "+coinSuperieur);
        System.out.println(tab+"\t"+this.parametrage);

    }
}
