package parametrage;

import Figure.Figure;

import java.util.ArrayList;
import java.util.List;

public class IParametrageImpl implements IParametrage {
    Parametrage parametrage;

    public IParametrageImpl(Parametrage parametrage) {
        this.parametrage = parametrage;
    }

    public List<Figure> figures=new ArrayList<Figure>();
    @Override
    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    @Override
    public void notifyFigures() {
        System.out.println("\n\n----------Notification des figures-------------");
        for(Figure figure:figures)
        {
            figure.update(this);
        }
        System.out.println("\n----------Figures notifiés-------------\n\n");
    }

    @Override
    public void removeFigure(Figure figure) {
        figures.remove(figure);
    }

    @Override
    public Parametrage getParametrage() {
        return parametrage;
    }

    public void setParametrage(Parametrage parametrage) {
        this.parametrage = parametrage;
        notifyFigures();
    }
}

