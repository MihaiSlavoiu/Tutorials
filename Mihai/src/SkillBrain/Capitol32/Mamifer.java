package SkillBrain.Capitol32;

public interface Mamifer extends Animal1{
    void reproducere(); // in cazul metodelor, java o sa foloseasca public abstract
                        //orice metoda dintr o interfata este publica si abstracta - adica nu are implementare
                        //o interfata poate sa extinda o alta interfata prin extends;
                        //interfata mamifer va avea acces la toate caracteristile lui animal1

}
