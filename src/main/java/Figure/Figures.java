package Figure;

import parametrage.IParametrage;
import parametrage.Parametrage;

import java.util.ArrayList;
import java.util.List;

public class Figures extends Figure{
    List<Figure> figures=new ArrayList<>();

    public Figures(String nom,Parametrage parametrage) {
        super(nom,parametrage);
    }
    public List<Figure> getFigures(){
        return figures;
    }
    public void addFigure(Figure figure){
        figure.level=this.level+1;
        System.out.println(figure.level+" "+this.level);
        figures.add(figure);
    }
    public void removeFigure(Figure figure){
        figures.remove(figure);
    }
    @Override
    public void update(IParametrage parametrage) {
        for(Figure figure:figures){
            figure.update(parametrage);
        }
    }

    @Override
    public double calculerSurface() {
        for(Figure figure:figures){
            figure.calculerSurface();
        }
        return 0;
    }

    @Override
    public double calculerPerimetre() {
        for(Figure figure:figures){
            figure.calculerPerimetre();
        }
        return 0;
    }

    @Override
    public void dessinerFigure() {
        String tab="";
        for (int i=0; i<this.level;i++)tab+="\t";
        System.out.println(tab+"----------"+nom);
        for(Figure figure:figures){
            figure.dessinerFigure();
        }
    }
}
