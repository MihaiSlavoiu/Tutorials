package SkillBrain;

import java.util.Random;
import java.util.Scanner;

public class tema2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        //variabile de jucator
        int sanatate = 100;
        int atacDeterioare = 50;
        int nrPotiuni = 3;
        int valoareRegenerarePotiune = 30;
        int sansaPotiune = 50; //procentaj


        //variabile inamic
        String[] inamici = {"Zombie", "Skeleton", "Warrior", "Assasin"};
        int maxSanatateInamic = 75;
        int inamicAtacDeteriorare = 25;

        boolean running = true;
        System.out.println("Bine ai venit in temnita!");

        GAME:
        while (running) {
            System.out.println("-----------------------------------");
            int sanatateInamic = rand.nextInt(maxSanatateInamic);
            String inamic = inamici[rand.nextInt(inamici.length)];
            System.out.println("\t# " + inamic + " a aparut! #");
            while (sanatateInamic > 0) {
                System.out.println("\tSanatatea ta este : " + sanatate);
                System.out.println("\tSanatatea inamicului este : " + inamic + " este de " + sanatateInamic);
                System.out.println("\t\nCe ai vrea sa faci?");
                System.out.println("\t1. Ataca");
                System.out.println("\t2. Bea potiune");
                System.out.println("\t3. Fugi");
                String input = scanner.nextLine();

                if (input.equals("1")) {
                    //cod pentru actiunea de a ataca
                    int deterioareProdusa = rand.nextInt(atacDeterioare);
                    int deterioaraPrimita = rand.nextInt(inamicAtacDeteriorare);
                    sanatateInamic -= deterioareProdusa;
                    sanatate -= deterioaraPrimita;
                    System.out.println("\tL-ai lovit pe " + inamic + " cu " + deterioareProdusa + " deterioare");
                    System.out.println("\tAi primit " + deterioaraPrimita + " deterioare");
                    if (sanatate < 1) {
                        System.out.println("\tAi fost lovit prea tare, esti prea slabit sa continui.");
                        break;
                    }
                } else if (input.equals("2")) {
                    //cod pentru actiunea de a bea potiune
                    if (nrPotiuni > 0) {
                        sanatate += valoareRegenerarePotiune;
                        nrPotiuni--;
                        System.out.println("Ai baut o potiune, te-ai vindecat cu " + valoareRegenerarePotiune +
                                "\n\tAcum ai: " + sanatate + " sanatate" +
                                "\n\tTi-au ramas " + nrPotiuni + " potiuni");
                    } else {
                        System.out.println("\tAi ramas fara potiuni! Invinge un inamic ca sa ai sansa de a mai castiga potiuni\n");
                    }
                } else if (input.equals("3")) {
                    //cod pentru actiunea de a fugi
                    System.out.println("\tAi fugit de " + inamic);
                    continue GAME;
                } else {
                    //cod pentru optiune invalida
                    System.out.println("\tComanda invalida!");
                }
            }
            if (sanatate < 1) {
                System.out.println("Te-au batut crunt in temnita!");
                break;
            }

        System.out.println("-----------------------------------");
        System.out.println("# " + inamic  + " a fost invins! #");
        System.out.println(" # Ai " + sanatate + " sanatate #");
        if (rand.nextInt(100)<sansaPotiune){
            nrPotiuni++;
            System.out.println(" # Ai castigat o potiune pe urma infragerii lui " + inamic);
            System.out.println(" # Mai ai " + nrPotiuni + " potiuni! #");

        }
            System.out.println("Ce ai vrea sa faci in continuare?");
            System.out.println("1. Continua lupta");
            System.out.println("2. Termina jocul");
            String input = scanner.nextLine();
            while (!input.equals("1") && !input.equals("2")){
                System.out.println("Comanda invalida!");
                input = scanner.nextLine();
            }
            switch (input){
                case"1":{
                    System.out.println("Continui lupta");
                    break ;
                } case "2":{
                    System.out.println("Ai ales sa iesi din temnita!");
                    break GAME;
                }

            }

    }
        System.out.println("################");
}}
