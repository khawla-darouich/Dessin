import Dessin.Dessin;
import Dessin.Strategy.ITraiter;
import Dessin.Strategy.ITraiterImpl1;
import Dessin.Strategy.ITraiterImpl2;
import Figure.Cercle;
import Figure.Figure;
import Figure.Figures;
import Figure.Rectangle;
import parametrage.IParametrage;
import parametrage.IParametrageImpl;
import parametrage.Parametrage;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        Dessin dessin=new Dessin();
        Parametrage parametrage=new Parametrage("black","blue",2.0);
        IParametrageImpl parametrageObservable =new IParametrageImpl(parametrage);
        Figures figures=new Figures("root",parametrage);
        Figures groupe1=new Figures("G1",parametrage);
        Figures groupe2=new Figures("G2",parametrage);
        Figures groupe3=new Figures("G3",parametrage);
        Figure cercle1=new Cercle("C1",parametrage,1,1,3);
        Figure cercle2=new Cercle("C2",parametrage,3,3,2);
        Figure cercle3=new Cercle("C3",parametrage,4,4,5);
        Figure rectangle1=new Rectangle("R1",parametrage,2,2,4,6);
        Figure rectangle2=new Rectangle("R2",parametrage,5,5,2,8);
        Figure rectangle3=new Rectangle("R3",parametrage,6,6,5,7);
        figures.addFigure(groupe3);
        groupe3.addFigure(groupe1);
        groupe3.addFigure(groupe2);
        figures.addFigure(rectangle3);
        figures.addFigure(cercle3);
        groupe1.addFigure(cercle1);
        groupe1.addFigure(rectangle1);
        groupe2.addFigure(cercle2);
        groupe2.addFigure(rectangle2);
        dessin.setTraiterStrategy(new ITraiterImpl1());
        figures.dessinerFigure();
        parametrageObservable.addFigure(figures);
        parametrageObservable.setParametrage(new Parametrage("red","white",2.0));
        System.out.println(parametrageObservable.getParametrage());
        Scanner scanner;
        while(true){
            scanner= new Scanner(System.in);
            System.out.print("Quelle stratégie:");
            String strategyClassName=scanner.nextLine();
            if(strategyClassName.equals("quit")) break;
            ITraiter strategy=(ITraiter) Class.forName("Dessin.Strategy."+strategyClassName).newInstance();
            dessin.setTraiterStrategy(strategy);
            dessin.traiter();

            }

    }
}
