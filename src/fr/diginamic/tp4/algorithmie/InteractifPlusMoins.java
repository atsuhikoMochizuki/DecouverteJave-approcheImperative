package fr.diginamic.tp4.algorithmie;

import mochizukiTools.Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void run() {
        Utils.msgTitle("EXERCICE 16 : INTERACTIF PLUS MOINS");
        Utils.msgInfo("""
                CONSIGNE :Ecrire un jeu qui :
                          -choisit un nombre aléatoire entre 1 et 100
                          -puis demande à l’utilisateur de trouver ce nombre en lui indiquant s’il est au-dessus ou
                          en dessous du nombre,
                          -Lorsque l’utilisateur a trouvé le nombre, le programme affiche « Bravo, vous avez
                          trouvé en N coups » où N représente le nombre d’essais effecté par l’utilisateur
                          -le programme se termine.""");
        game(1, 100);
    }

    public static void game(int i_min, int i_max) {
        int numberToFind = Utils.generateRandomInt(1, 100);
        String str = String.valueOf(numberToFind);
        int triesNumber = 1;
        int i = 0;
        while (true) {
            int userInput = 0;
            if (i < 1) {
                userInput = inputNumberInRange(1, 100, true);
                i++;
            } else userInput = inputNumberInRange(1, 100, false);
            if (userInput < numberToFind) {
                Utils.msgInfo("PLUS!");
                triesNumber++;
            } else if (userInput > numberToFind) {
                Utils.msgInfo("MOINS!");
                triesNumber++;
            } else {
                String WinnerMsg = "BINGO!: Vous avez découvert le nombre " + numberToFind + " en " + triesNumber + " coups!";
                Utils.msgResult(WinnerMsg);
                break;
            }
        }
    }

    static public int inputNumberInRange(int i_min, int i_max, boolean i_promptDisplay) {
        int userInput = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            boolean badInput = false;
            if (i_promptDisplay) {
                String str = "Entrez un nombre compris entre " + i_min + " et " + i_max + " :";
                Utils.msgPrompt(str);
            }
            try {
                userInput = scanner.nextInt();
            } catch (InputMismatchException exception) {
                Utils.msgWarning("L'entrée n'est pas un nombre");
                badInput = true;
            }
            if (!badInput) {
                boolean verif = false;
                for (int i = i_min; i <= i_max; i++) {
                    if (i == userInput) {
                        verif = true;
                        i = i_max;
                    }
                }
                if (verif) break;
                else Utils.msgWarning("Le nombre entré est incorrect");
            }
        }
        return userInput;
    }
}
