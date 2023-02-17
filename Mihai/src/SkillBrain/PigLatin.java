package SkillBrain;

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introdu un cuvant");
        String cuvantInitial = scanner.nextLine();
        System.out.println(findPigLatin(cuvantInitial));
    }

    public static boolean verificareVocala(char vocala) {
        if (vocala == 'a' || vocala == 'A' || vocala == 'e' || vocala == 'E' || vocala == 'i' ||
                vocala == 'I' || vocala == 'o' || vocala == 'O' || vocala == 'u' || vocala == 'U') {
            return true;
        } else {
            return false;
        }
    }

    public static String findPigLatin(String cuvant) {

        if (verificareVocala(cuvant.charAt(0)) || cuvant.substring(0, 2).equals("xr") || cuvant.substring(0, 2).equals("yt")) {
            return cuvant + "ay";
        } else {
            int pozitieCaracter = 0;
            for (int i = 1; i < cuvant.length(); i++) {
                if (verificareVocala(cuvant.charAt(i)) && cuvant.charAt(i) != 'u') {
                    pozitieCaracter = i;
                    break;
                }
                if (verificareVocala(cuvant.charAt(i)) && cuvant.charAt(i) == 'u') {
                    int pozitieU = i;
                    if (cuvant.charAt(pozitieU - 1) == 'q') {
                        pozitieCaracter = i + 1;
                        break;
                    }else{
                        pozitieCaracter=i;
                        break;
                    }
                }
                if (cuvant.charAt(i) == 'y') {
                    boolean isAllCharactersConsonant = true;
                    for (int j = 0; j < i; j++) {
                        if (verificareVocala(cuvant.charAt(j))) {
                            isAllCharactersConsonant = false;
                            break;
                        }
                    }
                    if(isAllCharactersConsonant){
                        pozitieCaracter = i;
                        break;
                    }
                }
            }
            return cuvant.substring(pozitieCaracter) + cuvant.substring(0, pozitieCaracter) + "ay";
        }
    }
}
