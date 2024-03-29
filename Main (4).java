import ardoise.*;
import java.lang.Thread;
public class Main
{
    public static void main(String[] args) throws InterruptedException {
        Ardoise ardoise = new Ardoise();
        ardoise.dessinerGraphique();


        PointPlan p1 = new PointPlan(118,13);
        PointPlan p2 = new PointPlan(123,20);
        PointPlan p3 = new PointPlan(128,13);
        Chapeau oiseau1 = new Chapeau("oiseau1",p1,p2,p3);
        ardoise.ajouterForme(oiseau1);
        oiseau1.dessiner();



        PointPlan p4 = new PointPlan(133,30);
        PointPlan p5 = new PointPlan(136,32);
        PointPlan p6 = new PointPlan(138,30);
        Chapeau oiseau2 = new Chapeau("oiseau2",p4,p5,p6);
        ardoise.ajouterForme(oiseau2);
        oiseau2.dessiner();

        PointPlan p7 = new PointPlan(142,14);
        PointPlan p8 = new PointPlan(144,17);
        PointPlan p9 = new PointPlan(146,14);
        Chapeau oiseau3 = new Chapeau("oiseau3",p7,p8,p9);
        ardoise.ajouterForme(oiseau3);
        oiseau3.dessiner();

        PointPlan p10 = new PointPlan(9,100);
        PointPlan p11 = new PointPlan(20,100);
        PointPlan p12 = new PointPlan(20,198);
        PointPlan p13 = new PointPlan(9,198);
        Quadrilatere tour = new Quadrilatere("Tours",p10,p11,p12,p13);
        ardoise.ajouterForme(tour);
        tour.dessiner();

        FormeComposees Maison = new FormeComposees("Maison");
        PointPlan p14 = new PointPlan(80,140);
        PointPlan p15 = new PointPlan(180,140);
        PointPlan p16 = new PointPlan(180,198);
        PointPlan p17 = new PointPlan(80,198);
        Quadrilatere Corpsmaison = new Quadrilatere("Corps maison",p14,p15,p16,p17);
        Maison.AjtForme(Corpsmaison);


        PointPlan p18 = new PointPlan(80,140);
        PointPlan p19 = new PointPlan(130,100);
        PointPlan p20 = new PointPlan(180,140);
        Chapeau toit = new Chapeau("toit maison",p18,p19,p20);
        Maison.AjtForme(toit);


        PointPlan p21 = new PointPlan(120,170);
        PointPlan p22 = new PointPlan(140,170);
        PointPlan p23 = new PointPlan(140,198);
        PointPlan p24 = new PointPlan(120,198);
        Quadrilatere porte = new Quadrilatere("Porte maison",p21,p22,p23,p24);
        Maison.AjtForme(porte);
        ardoise.ajouterForme(Maison);
        Maison.dessiner();

        FormeComposees Etoile = new FormeComposees("Etoile");
        PointPlan p25 = new PointPlan(170,52);
        PointPlan p26 = new PointPlan(173,45);
        PointPlan p27 = new PointPlan(177,52);
        Chapeau Branche1 = new Chapeau("Branche1",p25,p26,p27);
        Etoile.AjtForme(Branche1);


        PointPlan p28 = new PointPlan(177,52);
        PointPlan p29 = new PointPlan(184,57);
        PointPlan p30 = new PointPlan(177,60);
        Chapeau Branche2 = new Chapeau("Branche2",p28,p29,p30);
        Etoile.AjtForme(Branche2);


        PointPlan p31 = new PointPlan(177,60);
        PointPlan p32 = new PointPlan(174,66);
        PointPlan p33 = new PointPlan(170,60);
        Chapeau Branche3 = new Chapeau("Branche3",p31,p32,p33);
        Etoile.AjtForme(Branche3);

        PointPlan p34 = new PointPlan(170,60);
        PointPlan p35 = new PointPlan(164,57);
        PointPlan p36 = new PointPlan(170,52);
        Chapeau Branche4 = new Chapeau("Branche4",p34,p35,p36);
        Etoile.AjtForme(Branche4);
        Etoile.dessiner();
        ardoise.ajouterForme(Etoile);





        PointPlan p37 = new PointPlan(3,14);
        PointPlan p38 = new PointPlan(43,3);
        PointPlan p39 = new PointPlan(112,14);
        Triangles Montagne1 = new Triangles("Montagne 1",p37,p38,p39);
        ardoise.ajouterForme(Montagne1);
        Montagne1.dessiner();

        PointPlan p40 = new PointPlan(152,7);
        PointPlan p41 = new PointPlan(166,3);
        PointPlan p42 = new PointPlan(172,7);
        Triangles Montagne2 = new Triangles("Montagne 2",p40,p41,p42);
        ardoise.ajouterForme(Montagne2);
        Montagne2.dessiner();

        try{
            Thread.sleep(1000);
            ardoise.deplacer("C", 10, 20);
        }
        catch (InterruptedException e){

        }// Patiente 1 secondes avant de deplacer les oiseaux

    }
}
