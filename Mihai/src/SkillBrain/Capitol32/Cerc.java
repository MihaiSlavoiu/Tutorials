package SkillBrain.Capitol32;

public class Cerc extends ObiectGrafic { //clasa cerc devine copilul clasei ObiectGrafic
    double raza;

    public Cerc(double raza, double x, double y) {
        super(x,y);//el va apela in prima faza constructorul parintelui sau (ObiectGrafic)
        this.raza = raza; //this face referire la obectul curent, adica eu fiind in clasa Cerc, thi se refera la calasa cerc
    }

    @Override
    public double aria() {
        return Math.PI * raza * raza;
    }

    @Override
    public double perimetru() {
        return 2 * Math.PI * raza;
    }

//    double arie() {
//        return Math.PI * raza * raza;
//    }
//
//    // clasele abstracte sunt utilizate in general pentru a generaliza functionalitatea uneor clase, insa fara a oferi implmentare
//
//    double perimetru(){
//        return 2 * Math.PI * raza;
//    }
}
