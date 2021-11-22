package Figure;

import parametrage.IParametrage;
import parametrage.Parametrage;

public class Cercle extends Figure {
    private Point cetre;
    private double rayon;
    private static final double pi=3.14;

    public Cercle(String nom,Parametrage parametrage,int x, int y, double rayon) {
        super(nom,parametrage);
        this.cetre = new Point(x,y);
        this.rayon = rayon;
    }

    @Override
    public void update(IParametrage parametrage) {
        this.parametrage= parametrage.getParametrage();
        System.out.println("le cercle a reçu un nouveau parametrage"+this.parametrage);
    }

    @Override
    public double calculerSurface() {
        return pi*Math.pow(rayon,2);
    }

    @Override
    public double calculerPerimetre() {
        return 2*pi*rayon;
    }

    @Override
    public void dessinerFigure() {
        String tab="";
        for (int i=0; i<this.level;i++)tab+="\t";
        System.out.println(tab+"----------Cercle: "+nom);
        System.out.println(tab+"\t"+"rayon : "+rayon);
        System.out.println(tab+"\t"+"centre: "+cetre);
        System.out.println(tab+"\t"+this.parametrage);
    }
}
