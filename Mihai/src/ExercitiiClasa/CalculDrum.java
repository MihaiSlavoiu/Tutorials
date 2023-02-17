package ExercitiiClasa;

public class CalculDrum {
    public static void main(String[] args) {
        Drum drum = new Drum();
        CalculDrum calculDrum = new CalculDrum();
        calculDrum.calcul(drum);
        System.out.println(drum.getDistantaTraseu());
    }


    public void calcul(Drum drum) {
        int lungime = (int) (drum.getDistantaDeParcurs() / (1 - drum.getDistantaParcursa()));
        drum.setDistantaTraseu(lungime);

    }

}


