package SkillBrain.Capitol32;

public class Dreptunghi extends ObiectGrafic{
    double lungime;
    double latime;

    public Dreptunghi(double x, double y, double lungime, double latime) {
        super(x, y);
        this.lungime = lungime;
        this.latime = latime;
    }

    @Override
    public double aria() {
        return latime*lungime;
    }

    @Override
    public double perimetru() {
        return 2*(latime+lungime);
    }
    //    double arie() {
//        return 0;
//    }
//
//    double perimetru() {
//        return 0;
//    }
}
