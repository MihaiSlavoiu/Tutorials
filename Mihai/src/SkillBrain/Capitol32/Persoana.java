package SkillBrain.Capitol32;

public class Persoana {
    //definitia clasei incepe cu un specificator de acces (public in cazul nostru), apoi cuvantul cheie class urmat de numele clasei

    //o clasa poata sa contina : atribute, constructori si metode

    //atribute - modeleaza caracteristicile unui obiect
    String nume;
    int varsta;
    String adresa;

    //constructori - pentru a crea un obiect dintr o clasa, procesul se face prin apelarea functiilor numite constructori din interiorul unei clasa
    //are numele clasei si nu returneaza niciun tip anum, poate avea oricati parametri
    Persoana() {
        nume = "Maria";
        varsta = 25;
        adresa = "Pitesti";

    }

    Persoana(String nume1, int varsta1) { //un constructor poate sa aiba diferiti parametri pe care ii scriem in paranteze de ex (String nume)
        this.nume = nume1;    //ne folosim de this pt a face referire la atributul din obiectul curent, adica obiectul care se afla in interiorul obiectului de tip persoana(cel de sus)
        //astfel initializam atributul care aparteine obiectului clasei de sus cu valoarea parametrilui pe care l am primit cu acest constructor
        this.varsta = varsta1;
        //orice clasa pe care noi o sctiem in java primeste imlpicit un constructor, dar el nu itiaza atributele cu nimic
        //variabilele numerice se vor initializa cu 0, de string cu null, boolean cu false
    }


    //metode - definesc aciunile pe care obiectul le poate executa
    void plimbare() {
        //aici definim implentarea metodei, adica logica pe care dorim sa i o atribuim
        System.out.println("Eu ma plimb in parc");
    }

    //o clasa poate sa aiba mai mult metode
    //daca casele reprezinta ceva abstract, obiectele reprezinta ceva concret
    void gateste() {
        System.out.println("eu gatesc cina");
    }

    //static poate fi folosit atat in atribute, adica variabile, cat si pe metode
    //orice variabila sau metoda definita ca fiind statica o sa apartina clasei si nu obiectului creat din clasa
    public static String SPECIE = "homo-sapiens";

    public static boolean respira(int dataDecedarii){
    if (dataDecedarii>0){
        return false; //adica daca decedarii e valida si persoana e decedata
    }else {
        return true;
    }
    //daca incercam sa accesam elemente din clasa intr o metoda statica o sa ne dea eroare pentru ca fieldurile
        // non statice nu pot fi referentiate dintr un cotext static
        //orice definim ca static trebie sa acceseze tot static
        //nu putem sa accesam un atribut care nu e statica intr o metoda statica
        //la fel nu putem nici sa apelam o metoda care nu e statica dintr o metoda non statica

}
}