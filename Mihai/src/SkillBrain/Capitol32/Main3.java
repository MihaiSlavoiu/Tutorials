package SkillBrain.Capitol32;

import org.checkerframework.checker.units.qual.C;

public class Main3 {
    public static void main(String[] args) {
        Caine1 caine = new Caine1();
        caine.mananca();
        caine.sunet();
        caine.reproducere();
        caine.vaneaza();

        Labrador labrador = new Labrador();
        labrador.mananca();
        labrador.vaneaza();
        labrador.sunet();
        labrador.reproducere();
//        System.out.println(labrador.rasa());//nu poate fi accesat deoarece e privat
//        System.out.println(labrador.rasa); //nu poate fi accesat deoarece e privat
        System.out.println(labrador.acceseazaRasa());

        System.out.println(caine.inteligenta);
        //daca dorim sa modificam atributul inteligenta:
//        caine.inteligenta = "ridicata"; //nu o sa mearga pentru ca nu putem modifica o variabila finala

        //modificatorul de acces private este cel ami restrictiv pentru ca ne limiteaza utilizarea doar in interiorul clasei in care a fost facut
        //modificatorul de acces defaultpermite accesarea unei variabile, metode, sau clase de catre alte clase din interiorul aceluiasi pachet
        //modificatorul de acces protected - ne ofera acces si la metode si clase care sunt continute de o clasa care se afla in trun alt pachet, doar daca clasa aceea extinde clasa din afara pachetului.

    }
}
