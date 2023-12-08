import ardoise.Forme;
import ardoise.PointPlan;
import ardoise.Segment;

import java.awt.*;
import java.util.ArrayList;

public class Chapeau extends Forme
{
    private PointPlan C1;

    private PointPlan C2;

    private PointPlan C3;

    public Chapeau(String nom, PointPlan unPoint, PointPlan deuxPoint, PointPlan troisPoint)
    {
        super(nom);
        this.C1=unPoint;
        this.C2=deuxPoint;
        this.C3=troisPoint;
    }

    @Override
    public ArrayList<Segment> dessiner()
    {
        ArrayList<Segment>Cseg = new ArrayList<>();
        Cseg.add(new Segment(C1,C2));
        Cseg.add(new Segment(C2,C3));
        return Cseg;
    }

    @Override
    public void deplacer(int i1, int i2)
    {
        C1.deplacer(i1, i2);
        C2.deplacer(i1, i2);
        C3.deplacer(i1, i2);

    }

    @Override
    public String typeForme()
    {
        return "C";
    }
}
