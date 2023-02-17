package SkillBrain;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        System.out.println("Sa calculam pe niste numere");
        System.out.println("Introduceti primul numar fractionar:");
        Scanner scanner= new Scanner(System.in);
        double numar1 = scanner.nextDouble();
        System.out.println("Introduceti al doilea numar fractionar:");
        double numar2 = scanner.nextDouble();
        double rezultatInmultire = inmultire(numar1,numar2);
        double rezultatAdaugare = adaugare(numar1,numar2);
        double rezultatScadere = scadere(numar1,numar2);
        double rezultatImpartire = impartire(numar1,numar2);
        double rezultatModul = modul((int) numar1,(int) numar2);
        double random = genereazaNumarRandom(rezultatScadere,rezultatInmultire);
        System.out.println("Rezultatul inmultirii este: "+rezultatInmultire);
        System.out.println("Rezultatul adunarii este: "+rezultatAdaugare);
        System.out.println("Rezultatul scaderii este: "+rezultatScadere);
        System.out.println("Rezultatul impartirii este: "+rezultatImpartire);
        System.out.println("Rezultatul modulului este: "+rezultatModul);
        System.out.println("Numarul random este intre: "+ rezultatScadere + " si " + rezultatInmultire+ " este " + random );

    }
    public static double inmultire(double nr1, double nr2){
        double rezultat = nr1 * nr2;
        return rezultat;
    }
    public static Double adaugare(double numar1, double nr2){
        double rezultat = numar1+nr2;
        return rezultat;
    }
    public static double scadere (Double numar1, Double numar2){
        Double rezultat = numar1-numar2;
        return rezultat;
    }
    public static Double impartire(Double numar1, double numar2){
        return numar1/numar2;
    }
    public static int modul(int numar1, Integer numar2){
        return numar1 & numar2;
    }

    public static double genereazaNumarRandom(double minim, double maxim){
        return Math.random()*(maxim-minim)+minim;
    }
}
