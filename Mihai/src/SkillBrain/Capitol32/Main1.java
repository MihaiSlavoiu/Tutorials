package SkillBrain.Capitol32;

public class Main1 {
    public static void main(String[] args) {
        Persoana persoana1 = new Persoana(); //instantiem o noua clasa prin folosirea cuvantului cheie new, tot ce scriem dupa new apeleaza
        // unul din contrauctorii clasei respective
        //daca apelam atributul fara parametri ne instantiaza atributele la valorile predefinite

        System.out.println(persoana1.nume);
        System.out.println(persoana1.varsta);
        System.out.println(persoana1.adresa);
        persoana1.gateste();
        persoana1.gateste();

//        //creare de element folosind alt constructor
//        Persoana persoana2 = new Persoana("Mihai",21);
//        System.out.println(persoana2.nume);
//        System.out.println(persoana2.varsta);
//        System.out.println(persoana2.adresa);
//        persoana2.gateste();
//        persoana2.plimbare();

        //variabilele statice ca si metodele statice apartin clasei si pot fi accesate fara sa ne creem o instanta in obiectul nostru
        System.out.println(Persoana.SPECIE);
        System.out.println(Persoana.respira(0));

        System.out.println(persoana1.SPECIE);
        System.out.println(persoana1.respira(12));
    }
}
