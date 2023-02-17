package SkillBrain;

import java.util.Arrays;
import java.util.Scanner;


public class Exercitii2 {


    //    public static void main(String[] args) {
//
//        String cardNumber = "4417123456789113";
//
//        boolean validCreditCardNumber = isValidCreditCardNumber(cardNumber);
//
//        if (validCreditCardNumber) {
//            System.out.println(cardNumber + " is valid as per luhn algorithm");
//        } else {
//            System.out.println(cardNumber + " is not valid as per luhn algorithm");
//        }
//    }
//
//    public static boolean isValidCreditCardNumber(String cardNumber) {
//        int[] cardIntArray = new int[cardNumber.length()];
//
//        for (int i = 0; i < cardNumber.length(); i++) {
//            char c = cardNumber.charAt(i);
//            cardIntArray[i] = Integer.parseInt("" + c);
//        }
//
//        for (int i = cardIntArray.length - 2; i >= 0; i = i - 2) {
//            int num = cardIntArray[i];
//            num = num * 2;  // step 1
//            if (num > 9) {
//                num = num % 10 + num / 10;  // step 2
//            }
//            cardIntArray[i] = num;
//        }
//
//        int sum = sumDigits(cardIntArray);  // step 3
//
//        System.out.println(sum);
//
//        if (sum % 10 == 0)  // step 4
//        {
//            return true;
//        }
//
//        return false;
//
//    }
//
//    public static int sumDigits(int[] arr) {
//        return Arrays.stream(arr).sum();
//    }
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Add a word for");
        char[] addword = word.nextLine().toCharArray();

        Exercitii2 giveaword = new Exercitii2();
        System.out.println(giveaword.scoreWord(addword));

    }

    public int scoreWord(char[] wor) {
        int scoreword = 0;
        for (int i = 0; i < wor.length; i++) {
            switch (wor[i]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'l':
                case 'n':
                case 'r':
                case 's':
                case 't':
                    scoreword = scoreword + 1;
                    break;
                case 'd':
                case 'g':
                    scoreword = scoreword + 2;
                    break;
                case 'b':
                case 'c':
                case 'm':
                case 'p':
                    scoreword = scoreword + 3;
                    break;
                case 'f':
                case 'h':
                case 'v':
                case 'w':
                case 'y':
                    scoreword = scoreword + 4;
                    break;
                case 'k':
                    scoreword = scoreword + 5;
                    break;
                case 'j':
                case 'x':
                    scoreword = scoreword + 8;
                    break;
                case 'q':
                case 'z':
                    scoreword = scoreword + 10;
                    break;

            }

        }
        return scoreword;
    }

}