package fr.diginamic.tp4.algorithmie;

import mochizukiTools.ArrayHelper;
import mochizukiTools.Utils;

import java.util.Arrays;

public class InteractifFibonacci {
    public static void run() {
        Utils.msgTitle("EXERCICE 18 : INTERACTIF FIBONNACI");
        Utils.msgInfo("""
                CONSIGNE :La suite de Fibonacci est une suite 
                qui commence par 0 et 1 et dans laquelle le nombre de
                rang N est égal à la somme des nombres de rangs N-1 et N-2
                    • Créer une classe TestFibonacci
                    • Demander à l’utilisateur de choisir un rang N
                    • Ecrire un algorithme qui calcule et affiche le nombre de rang N""");
        int result = FibonnacciFindNumber();
    }

    public static int FibonnacciFindNumber() {
        int[] FibonnaciSuit = new int[0];
        String menu = """
                \n
                 ______ _ _                                  _\s
                |  ____(_) |                                (_)
                | |__   _| |__   ___  _ __  _ __   __ _  ___ _\s
                |  __| | | '_ \\ / _ \\| '_ \\| '_ \\ / _` |/ __| |
                | |    | | |_) | (_) | | | | | | | (_| | (__| |
                |_|    |_|_.__/ \\___/|_| |_|_| |_|\\__,_|\\___|_| Finder""";
        Utils.msgInfo(menu);
        Utils.msgPrompt("Entrez le rang au sein de la suite de Fibonnaci:");
        int userInput = InteractifPlusGrand.inputStdin_noDisplayResult();
        int i = 0, numberToPush = 0;
        long numberToVerif = 0;
        boolean end = false;
        for (i = 0; i <= 0xFFFF; i++) {
            if (i == 0) numberToPush = 0;
            else if (i == 1) numberToPush = 1;
            else {
                numberToVerif = FibonnaciSuit[i - 1] + FibonnaciSuit[i - 2];
                if (numberToVerif > 65535) {
                    Utils.msgWarning("Le rang demandé est trop grand pour le programme");
                    return -1;
                } else numberToPush = (int) numberToVerif;
            }
            FibonnaciSuit = ArrayHelper.pushInt(FibonnaciSuit, numberToPush);
            if (i == userInput - 1) {
                String msgResult = "Génération de la suite de Fibonnaci jusqu'au rang " + userInput + " :";
                Utils.msgResult(msgResult);
                for (int j = 0; j <= i; j++) {
                    if (j != i) System.out.printf("%d ", FibonnaciSuit[j]);
                    else
                        System.out.printf("%s%d%s ", Utils.Colors.ANSI_GREEN, FibonnaciSuit[j], Utils.Colors.ANSI_RESET);
                }
                System.out.print("\n");
                end = true;
            }
            if (end) break;
        }
        return FibonnaciSuit[i];
    }
}
