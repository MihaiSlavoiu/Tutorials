package SkillBrain;

import java.util.Scanner;

public class PerfectNumbers {
    int a;

    public PerfectNumbers(int x) {
        if (x < 1) {
            throw new IllegalArgumentException("Please add a number grater than 1");
        } else {
            a=x;
        }
    }

    public static void main(String[] args) {
        System.out.println("Adaugati un numar: ");
//        int x = Utils.Utils.scanner().nextInt();
        PerfectNumbers perfectNumbers = new PerfectNumbers(Utils.Utils.scanner().nextInt());
        perfectNumbers.verificareNumar();
    }

    public void verificareNumar() {
        int sum = 0;
        for (int i = 1; i <= a - 1; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == a) {
            System.out.println("Numarul este perfect");
        } else if (sum > a) {
            System.out.println("Numarul este Abundant");
        } else {
            System.out.println("Numarul este Deficient");
        }
    }
}
