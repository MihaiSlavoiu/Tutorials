package SkillBrain;

public class ArmstrongMihai {
    public static void main(String[] args) {
        for (int i = 0; i <= 999; i++) {
            int[] ultimeleCifre;
            if (i <= 9) {
                ultimeleCifre = new int[1];
            }
            if (10 <= i && i <= 99) {
                ultimeleCifre = new int[2];
            } else {
                ultimeleCifre = new int[3];
            }
            int j = 0;
            int numar = i;
            while (numar != 0) {
                int ultimaCifra = numar % 10;
                ultimeleCifre[j] = ultimaCifra;
                numar = numar / 10;
                if (numar != 0) {
                    j++;
                }
            }
            int sum = 0;
            for (int k = 0; k < ultimeleCifre.length; k++) {
                sum = (int) (Math.pow(ultimeleCifre[k], ultimeleCifre.length) + sum);
            }
            if (i == sum) {
                System.out.println(sum + " e nr armstrong");
            }
        }
    }

}
