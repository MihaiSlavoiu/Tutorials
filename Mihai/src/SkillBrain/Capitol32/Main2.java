package SkillBrain.Capitol32;

public class Main2 {
    public static void main(String[] args) {
        //pentru clasele Cerc, Dreptunghi, ObiectGrafic
        Cerc cerc = new Cerc(11.5, 2.9,-7.1); // in stanga egalului este tipul de referinta - in dreapta e obiectul - new apeleaza constructorul cercului care creeaza obiectul
        System.out.println(cerc.x);
        System.out.println(cerc.y);
        System.out.println(cerc.raza);
        System.out.println(cerc.aria());
        System.out.println(cerc.perimetru());

        //creare obiect in mod indirect prin polimorfism
        ObiectGrafic dreptunghi = new Dreptunghi(2.1, -3.2, 10.0,2.5);
        System.out.println(dreptunghi.x);
        System.out.println(dreptunghi.y);
        System.out.println("latime = " + ((Dreptunghi)dreptunghi).latime);
        System.out.println("lungime = " + ((Dreptunghi)dreptunghi).lungime);
        System.out.println(dreptunghi.aria());
        System.out.println(dreptunghi.perimetru());
    }
}
