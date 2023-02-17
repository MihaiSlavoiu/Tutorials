package SkillBrain.Capitol32;

public class Labrador extends Caine1 {
    //    public String rasa = "Labrador"; // pulbic e vizibil din orice lod din proiect
    private String rasa = "Labrador";

    //   public String rasa(){
//       return rasa;
//   }
    private String rasa() {
        return rasa;
    }

    public String acceseazaRasa() {
//        return rasa;
        return rasa();
    }

    @Override
    public void mananca() { // ca sa il suprascriem, folosim aceeasi definitie
        System.out.println("eu sunt un labrador si mi place pedigree");
    }

//    public void returneazaAlergare(){  //nu poate fi acesat pentru ca in clasa caine1 este definit ca private
//        return alearga();             //nu os a avem acces la el din alta clasa
//    }

    //atributele default permite acceasarea unei metode, variabile sau clase de catre alte clase din interiorul aceluasi pachet
}
