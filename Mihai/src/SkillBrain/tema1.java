package SkillBrain;

import java.util.Scanner;

public class tema1 {
    public static void main(String[] args) {
        System.out.println("Imi place Java");
        int nrCasa = 45;
        String fructe = "mere";
        boolean adevarat = true;
        propozitii();
        varsta();
        propozitieTastatura();
        myVariables(nrCasa, fructe, adevarat);
        punctul6();
        punctul7();
        punctul8();

    }

    public static void propozitii() {

        for (int i = 0; i < 6; i++) {
            System.out.println("Cursul acesta este foarte fain!");
        }

    }

    public static void varsta() {
        int Ana = 24;
        int David = Ana - 6;
        System.out.println("Varsta lui david este de " + David + " ani!");
    }

    public static void propozitieTastatura() {
        String nume;
        int varsta;
        char sex;
        double salariu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numele este:");
        nume = scanner.nextLine();
        System.out.println("Varsta este :");
        varsta = scanner.nextInt();
        System.out.println("Sexul este:");
        sex = scanner.next().charAt(0);
        System.out.println("Salariul este:");
        salariu = scanner.nextDouble();
        System.out.println("Numele este " + nume + " varsta este " + varsta + " sexul este " + sex + " salariul este " + salariu + " lei!");
    }

    public static void myVariables(int nrCasa, String fructe, boolean adevarat) {
        System.out.println("Numarul casei este: " + nrCasa);
        System.out.println("Fructul preferat este: " + fructe);
        System.out.println("Casa de la numarul: " + nrCasa + " are fructul preferat : " + fructe + " " + adevarat);

    }

    public static void punctul6() {
        int nr1;
        int nr2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrieti primul numar:");
        nr1 = scanner.nextInt();
        System.out.println("Scrieti al doilea numar:");
        nr2 = scanner.nextInt();
        System.out.println("Primul numar pe care l-ati scris este: " + nr1 + ", iar al doilea numar pe care l-ati scris este : " + nr2);

    }

    public static void punctul7() {
        System.out.println("Introduceti un numar de la tastatura: ");
        Scanner scanare = new Scanner(System.in);
        double a = scanare.nextDouble();
        System.out.println("Numarul introdus, adunat cu 5 este: " + (a + 5));
        System.out.println("Numarul introdus, scazut cu 12.3 este: " + (a - 12.3));
        System.out.println("Numarul introdus, inmultit cu 3.2 este: " + (a * 3.2));
        System.out.println("Numarul introdus, impartit la 4 este: " + (a / 4));
        System.out.println("Modulul cu 6 al numarul introdus este: " + (a % 6));
    }

    public static void punctul8() {

        int x = 2;
        int y = 12;
        // y = x * y;
        y = x + y;
        x = y - x;
        y = y - x;
        System.out.println(x);
        System.out.println(y);

    }
}
