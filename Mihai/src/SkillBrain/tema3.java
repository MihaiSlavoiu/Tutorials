package SkillBrain;

import java.util.ArrayList;
import java.util.Scanner;

class tema3 {
    public static void main(String[] args) {
        // introducereNumar();
        //caracter();
        //array();
        // arrayChar();
        //arrayDouble();
        //arrayElemente();
        //arrayInteger();
        arrayList();
    }

    //b.1
    public static void introducereNumar() {
        System.out.println("Introduceti un numar: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double minim = 1;
        double maxim = 100;
        double numarRandom = Math.random() * (maxim - minim) + minim;
        if (a < numarRandom) {
            System.out.println("Numarul introdus este mai mic decat " + numarRandom);
        }
    }

    //b.2
    public static void caracter() {
        System.out.println("Introduceti un caracter:");
        Scanner scanner = new Scanner(System.in);
        char caracter = scanner.next().charAt(0);
        System.out.println("Introduceti primul numar: ");
        int numar1 = scanner.nextInt();
        System.out.println("Introduceti al doilea numar");
        int numar2 = scanner.nextInt();
        switch (caracter) {
            case 'a': {
                System.out.println(numar1 + numar2);
                break;
            }
            case 's': {
                System.out.println(numar1 - numar2);
                break;
            }
            case 'i': {
                System.out.println(numar1 * numar2);
                break;
            }
            case 'p': {
                System.out.println(numar1 / numar2);
                break;
            }
            case 'm': {
                System.out.println(numar1 % numar2);
                break;
            }
            default:
                System.out.println("Eroare");
        }
    }

    //b.3
    public static void array() {
        int[][] array = {{1, 2, 3}, {4, 5, 6, 7, 8}};
        System.out.println("primulElementPrimaDimensiune " + array[0][0]);
        System.out.println("ultimulElelemntPrimaDimensiune " + array[0][2]);
        System.out.println("primulElementDouaDimensiune " + array[1][0]);
        System.out.println("ulimulElementDouaDimensiune " + array[1][4]);
    }

    //b.4
    //Definiti un array de char-uri. Iterati array-ul folosind structura for, si afisati pe ecran cate al doilea caracter din sir.
    public static void arrayChar() {
        char[][] array = {{'a', 'b', 'c'}, {'b', 'c', 'a'}, {'a', 'd'}};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][1]);
        }
    }

    //b.5
  /*Definiti un array de double, cu valori zecimale. Iterati array-ul folosind strutura for, si daca un element este egal
  cu valoarea 4.5, afisati-l pe ecran. Daca un element este mai mare decat 5, afisati mesajul “Element peste 5”*/
    public static void arrayDouble() {
        double[] array = {3.5, 4.2, 4.5, 4.9, 5.5, 5.9};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4.5) {
                System.out.println(array[i]);
            }
            if (array[i] > 5) {
                System.out.println("Element peste 5");
            }
        }
    }

    //b.6
    /*Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date este la alegere). Daca iteratia
     este la indexul 2, sa se sara peste. Daca iteratia este la indexul 7, sa se opreasca iteratia. Altfel, sa se
     afiseze mesajul “Index valid” pe ecran.*/
    public static void arrayElemente() {
        char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        for (int i = 0; i < a.length; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 7) {
                break;
            }
            if (i != 2 && i != 7) {
                System.out.println("Index valid.");
            }
        }
    }

    //b.7
    /*Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor*/
    public static void arrayInteger() {
        int[] elements = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum = sum + elements[i];
        }
        System.out.println(sum);

    }

    //b.8
    /*Definiti un array si o lista. Determinati daca ele sunt goale sau nu.*/
    public static void arrayList() {
        int[] elements = {1, 2, 3, 4, 5};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        if (elements.length == 0) {
            System.out.println("Array-ul este gol");
        } else {
            System.out.println("Array-ul nu este gol");
        }
        if (list.size() == 0) {
            System.out.println("Lista este goala");

        } else {
            System.out.println("Lista nu este goala");
        }
    }

}