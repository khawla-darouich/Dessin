package Figure;

import parametrage.IParametrage;
import parametrage.Parametrage;

public abstract class Figure {
    protected int level;
    protected String nom;
    public Parametrage parametrage;
    public Figure(String nom,Parametrage parametrage) {
        this.level = 0;
        this.parametrage=parametrage;
        this.nom=nom;

    }

    public abstract void update(IParametrage parametrage);
    public abstract double calculerSurface();
    public abstract double calculerPerimetre();
    public abstract void dessinerFigure();
}
