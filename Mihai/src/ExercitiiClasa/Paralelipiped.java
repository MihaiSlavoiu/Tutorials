package ExercitiiClasa;
public class Paralelipiped {
    public static void main(String []args){
        Paralelipiped rezultat = new Paralelipiped();
        Transform blabla = new Transform();
        rezultat.calcul(blabla.getLungime(), blabla.getLatime(), blabla.getInaltime());
    }

    public void calcul (int l, int latime, int h){
        double volum = l * latime * h;
        volum = (volum * Math.pow(10,-6));
        int nrSticle = (int) (volum / 0.0005);
        System.out.println("Volumul este " + volum + " numarul de sticle este" + nrSticle);
    }
}
