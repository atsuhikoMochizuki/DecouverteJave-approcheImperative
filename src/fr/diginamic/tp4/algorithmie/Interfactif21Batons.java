package fr.diginamic.tp4.algorithmie;

import mochizukiTools.Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Interfactif21Batons {
    enum player_e {USER, COMPUTER}

    public static void run() {
        Utils.msgTitle("EXERCICE 19 : INTERACTIF 21 BATONS");
        Utils.msgInfo("""
                CONSIGNE :Le jeu est simple mais la réalisation est plus délicate.
                Vous allez jouer contre l’ordinateur.
                Celui qui prend le dernier baton a perdu.
                Dans ce TP vous allez devoir imaginer vous-même le mécanisme à mettre en place, 
                sur la base de ce que vous avez vu précédemment.""");
        jeu21Batons();
    }

    public static void jeu21Batons() {
        int nbrBatons = 21;
        boolean lastPlayerIsUser = false;
        boolean nbreBatonsNull = false;
        String menu = """
                                \n
                             ___ _   ___   _ _____ ___  _  _ ___\s
                            |_  ) | | _ ) /_\\_   _/ _ \\| \\| / __|
                             / /| | | _ \\/ _ \\| || (_) | .` \\__ \\
                LE JEU DES  /___|_| |___/_/ \\_\\_| \\___/|_|\\_|___/
                \s""";
        Utils.msgInfo(menu);
        Utils.msgPrompt("""
                Chacun votre tour, retirer 1, 2 ou 3 bâtons.
                L’objectif est de ne pas retirer le dernier bâtonnet, sinon vous avez perdu.
                A vous de jouer !""");

        while (true) {
            String str = "Il reste " + nbrBatons + " bâtons. Veuillez en retirez 1,2 ou 3:";
            prompting21BationsGame(str, player_e.USER);
            int userChoice = inputStdin_1to3();
            lastPlayerIsUser = true;
            nbrBatons -= userChoice;
            if (nbrBatons < 1) {
                nbreBatonsNull = true;
            } else {
                switch (userChoice) {
                    case 1:
                        prompting21BationsGame("Je retire 3 bâtons", player_e.COMPUTER);
                        lastPlayerIsUser = false;
                        nbrBatons -= 3;
                        if (nbrBatons < 1)
                            nbreBatonsNull = true;
                        break;
                    case 2:
                        prompting21BationsGame("Je retire 2 bâtons", player_e.COMPUTER);
                        lastPlayerIsUser = false;
                        nbrBatons -= 2;
                        if (nbrBatons < 1)
                            nbreBatonsNull = true;
                        break;
                    case 3:
                        prompting21BationsGame("Je retire 1 bâtons", player_e.COMPUTER);
                        lastPlayerIsUser = false;
                        nbrBatons -= 1;
                        if (nbrBatons < 1)
                            nbreBatonsNull = true;
                        break;
                    default:
                        System.err.println("Erreur d'execution");
                }
            }
            if (nbreBatonsNull)
                break;
        }
        if (lastPlayerIsUser)
            prompting21BationsGame("Vous avez perdu cher utilisateur", player_e.USER);
        else
            prompting21BationsGame("Il semblerait que la machine a dépassé l'homme!", player_e.COMPUTER);
    }

    static public int inputStdin_1to3() {
        int userInput = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            boolean badInput = false;
            try {
                userInput = scanner.nextInt();
            } catch (InputMismatchException exception) {
                Utils.msgWarning("L'entrée n'est pas un nombre");
                badInput = true;
            }
            if (!badInput) {
                boolean verif = false;
                for (int i = 1; i <= 3; i++) {
                    if (i == userInput) {
                        verif = true;
                        i = 3;
                    }
                }
                if (verif)
                    break;
                else
                    Utils.msgWarning("Le nombre entré est incorrect");
            }
        }
        return userInput;
    }

    public static void prompting21BationsGame(String i_str, player_e typeOfgamer) {
        if (typeOfgamer == player_e.USER) {
            System.out.printf("[%sJoueur%s]%s%s%s\n",
                    Utils.Colors.ANSI_BLUE,
                    Utils.Colors.ANSI_RESET,
                    Utils.Colors.ANSI_BLUE,
                    i_str,
                    Utils.Colors.ANSI_RESET);
        } else {
            System.out.printf("[%sOrdinateur%s]%s%s%s\n",
                    Utils.Colors.ANSI_YELLOW,
                    Utils.Colors.ANSI_RESET,
                    Utils.Colors.ANSI_YELLOW,
                    i_str,
                    Utils.Colors.ANSI_RESET);
        }
    }
}
