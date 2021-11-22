package parametrage;

import Figure.Figure;

public interface IParametrage {
   public void addFigure(Figure figure);
   public void removeFigure(Figure figure);
   public void notifyFigures();
   public Parametrage getParametrage();

}
