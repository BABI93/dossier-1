import ardoise.Forme;
import ardoise.PointPlan;
import ardoise.Segment;

import java.util.ArrayList;

public class Triangles extends Forme
{
    private PointPlan T1;
    private PointPlan T2;
    private PointPlan T3;

    public Triangles(String nom, PointPlan unPoint, PointPlan deuxPoint, PointPlan troisPoint) // constructeur champs à champs
    {
        super(nom);
        this.T1 = unPoint;
        this.T2 = deuxPoint;
        this.T3 = troisPoint;

    }

    @Override
    public ArrayList<Segment> dessiner()
    {
      ArrayList <Segment> Tseg = new ArrayList<>();
      Tseg.add(new Segment(T1,T2));
      Tseg.add(new Segment(T1,T3));
      Tseg.add(new Segment(T2,T3));
      return Tseg;
    }

    @Override
    public void deplacer(int i1, int i2)
    {
        T1.deplacer(i1, i2);
        T2.deplacer(i1, i2);
        T3.deplacer(i1, i2);
    }

    

    @Override
    public String typeForme()
    {
        return "T";
    }
}
