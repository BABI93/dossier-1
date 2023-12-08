import ardoise.Forme;
import ardoise.Segment;

import java.util.ArrayList;

public class FormeComposees extends Forme {
    private  ArrayList<Forme> GF;

    public FormeComposees(String nom)
    {
        super(nom);
        this.GF=new ArrayList<Forme>();
    }
    @Override
    public ArrayList<Segment> dessiner()
    {
        ArrayList <Segment> FC = new ArrayList<>();
        for (Forme forme : this.GF)
        {
            FC.addAll(forme.dessiner());
        }
        return FC;
    }

    @Override
    public void deplacer(int A1, int A2)
    {
        for (Forme forme : this.GF)
        {
            forme.deplacer(A1, A2);
        }

    }

    public void AjtForme (Forme commejeveux)
    {
        this.GF.add(commejeveux);
    }

    @Override
    public String typeForme() {
        return "GF";
    }
}
