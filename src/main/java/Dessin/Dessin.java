package Dessin;

import Dessin.Strategy.ITraiter;
import Figure.Figure;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Dessin {
    public List<Figure> figures=new ArrayList<Figure>();
    private ITraiter traiterStrategy;
    public void traiter(){
        traiterStrategy.traiter();
    }

    public void setTraiterStrategy(ITraiter traiterStrategy) {
        this.traiterStrategy = traiterStrategy;
    }

    public void addFigure(Figure figure){
        figures.add(figure);
    }
    public void removeFigure(Figure figure){
        figures.remove(figure);
    }
    public void afficherDessin(){
        for(Figure figure:figures){
            figure.dessinerFigure();
        }
    }
    public static void serialiser(Dessin dessin)
    {
        try  {
            System.out.println("FEATURE A");
            FileOutputStream fout=new FileOutputStream("auth.bin");
            ObjectOutputStream oout=new ObjectOutputStream(fout);
            oout.writeObject(dessin);
            System.out.println("le dessin a ete serialise");
            oout.close();
            fout.close();
        }  catch(Exception e) {
            e.printStackTrace();
        }
    }
}
