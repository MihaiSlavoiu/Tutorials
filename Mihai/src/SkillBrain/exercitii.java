package SkillBrain;

public class exercitii {
    public static void main(String[] args) {
        exercitiul5();
    }

    public static void exercitiul5() {
        double[][] zecimale = {{8.2, 1.9, 3.8, 4.5}, {5.7, 2.4, 4.5, 10.2, 0.6}};

        for (int i = 0; i < zecimale.length; i++) {
            for (int j = 0; j < zecimale[i].length; j++) {
                if (zecimale[i][j] == 4.5) {
                    System.out.println(zecimale[i][j]);
                }
                if (zecimale[i][j] > 5) {
                    System.out.println("Numarul este peste 5");
                }
            }
        }
    }
}





