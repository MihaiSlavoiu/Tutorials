package SkillBrain;


import java.util.Arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        //int numar = 0;
        int suma = 0;
        int count = 0;
        PrimeNumber primeNumber = new PrimeNumber();
        for (int i = 2; i < 1000; i++) {
            if (primeNumber.verificareNumarPrim(i)) {
                System.out.println(i); //afisare numere prime
                count++;
                suma = suma + i;
                if (count == 100) {
                    break;
                }
            }
        }
        System.out.println(suma);
    }

    public boolean verificareNumarPrim(int numar) {
        for (int i = 2; i * i <= numar; i++) {   //sau i<= numar/2 sau i< numar
            if (numar % i == 0) {
                return false;
            }
        }
        return true;
    }


}



