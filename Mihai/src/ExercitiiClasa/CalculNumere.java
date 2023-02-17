package ExercitiiClasa;

public class CalculNumere {
    public static void main(String[] args) {
        CalculNumere calculNumere = new CalculNumere();
        calculNumere.calcul();
    }

    public void calcul() {
        Numere numere = new Numere(); //instanta
        numere.setNr2(44/4.4);
        numere.setNr1(44- numere.getNr2());
        System.out.println(numere.getNr1() + " " + numere.getNr2());
    }
}
