package SkillBrain;

import java.util.*;

public class ExercitiiClasa {

    public static void main(String[] args) {
        System.out.println("introduceti un cnp pentru validare : ");
        long cnp = Utils.Utils.scanner().nextLong();
        String temp = Long.toString(cnp);
        ExercitiiClasa exercitiiClasa = new ExercitiiClasa();
        int[] numbers = new int[temp.length()];
        for(int i = 0;i<temp.length();i++){
 //           numbers[i] = Character.getNumericValue(temp.charAt(i));
            numbers[i] = Integer.parseInt(String.valueOf(temp.charAt(i)));
        }
        System.out.println(exercitiiClasa.verificareCNP(numbers));

    }

    public boolean verificareCNP(int[] numarCNP) {
        int sum = 0;
        int cifraDeControl = 0;
        int[] constanta = {2, 7, 9, 1, 4, 6, 3, 5, 8, 2, 7, 9};
        for (int i = 0; i < numarCNP.length - 1; i++) {
            sum = sum + (numarCNP[i] * constanta[i]);
        }
        if (sum % 11 < 10) {
            cifraDeControl = sum % 11;
        } else if (sum % 11 == 10) {
            cifraDeControl = 1;
        }
        return cifraDeControl==numarCNP[numarCNP.length-1] ? true : false;
    }


}

