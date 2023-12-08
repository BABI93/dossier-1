import ardoise.Forme;
import ardoise.PointPlan;
import ardoise.Segment;

import java.util.ArrayList;

public class Quadrilatere extends Forme
{
    private PointPlan Q1;
    private PointPlan Q2;
    private PointPlan Q3;
    private PointPlan Q4;

    public Quadrilatere(String nom, PointPlan unPoint, PointPlan deuxPoint, PointPlan troisPoint, PointPlan quatrePoint)
    {
        super(nom);
        this.Q1=unPoint;
        this.Q2=deuxPoint;
        this.Q3=troisPoint;
        this.Q4=quatrePoint;
    }
    @Override
    public ArrayList<Segment> dessiner()
    {
       ArrayList<Segment>Qseg = new ArrayList<>();
       Qseg.add(new Segment(Q1,Q2));
       Qseg.add(new Segment(Q1,Q4));
       Qseg.add(new Segment(Q2,Q3));
       Qseg.add(new Segment(Q3,Q4));
       return Qseg;
    }

    @Override
    public void deplacer(int i1, int i2)
    {
        Q1.deplacer(i1, i2);
        Q2.deplacer(i1, i2);
        Q3.deplacer(i1, i2);
        Q4.deplacer(i1, i2);
    }

    @Override
    public String typeForme() {
        return "Q";
    }
}
