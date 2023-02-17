package SkillBrain.Capitol32;
public class Main {
    public static void main(String[] args) {
        Caine sparky = new Caine();
        sparky.maraie();
        sparky.latra();
        sparky.merge();
        sparky.mananca();
        sparky.maia().mananca();
        Animal x = new Caine(); //upcasting (mic in mare)
        x.mananca();
        Caine z = (Caine) x; //downcasting (mare in mic)
        z.mananca();


        Animal pui = new Animal();
        pui.mananca();
         //  Pisica ou = (Pisica) pui;
        // ou.miauna();
        PuiCaine zuc = new PuiCaine();
        zuc.beaLapte();
        zuc.maraie();
    }

}

          //   Populatie(valoara) -> Persoana1/2/3 (valori) -> sportiv (valori) -> alergator(valori)
          //                                                      ->basketbalist
          //                              -> gamer (valori)