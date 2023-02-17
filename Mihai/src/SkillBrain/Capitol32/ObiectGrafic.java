package SkillBrain.Capitol32;

public abstract class ObiectGrafic {
    public double x, y;

    //o clasa abstracta nu poate fi instatiata, adica nu poate fi transformata intr un obiect
    public abstract double aria(); //nu trebuie sa ii punem ghilimele si sa scriem logica pentru ca nu au implementare

    public abstract double perimetru();

    public ObiectGrafic(double x, double y) {
        super();
        this.x=x;
        this.y=y;

    }

}
