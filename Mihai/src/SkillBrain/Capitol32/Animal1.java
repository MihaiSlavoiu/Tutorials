package SkillBrain.Capitol32;

public interface Animal1 {
    //interfetele renunta la orice implementare a metodelor, reusind sa obtinem o abstractizare si mai mare a codului
    //interfetele pot sa aiba : atribute si metode

    //atribute
    String inteligenta="scazuta"; //daca nu specficam un modificator de acces in cazul interfelor, acesta mereu va fi public
                                    //implicit java adauga : public static final - public(modificator de acces; static
                                    // static face referire ca un atribut apartine clasei si nu
                                    // instantei, adica obiectului, iar final inseamna ca odata
                                    // instatiata aceasta variabila, nu mai poate fi modificate)
                                    //acesta este un atribut

    //metode //poate contine doar metode fara implementare
    void mananca ();
    void sunet();
}
