package fr.diginamic.tp4.algorithmie;

import mochizukiTools.Utils;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractifPlusGrand {
    public static void run() {
        Utils.msgTitle("EXERCICE 15 : INTERACTIF PLUS GRAND QUE");
        Utils.msgInfo("""
                 CONSIGNE :Ecrire un programme qui demande 10 nombres à un utilisateur et qui affiche le plus grand de
                ces nombres.""");
        askNbrAndShowBiggie(10);
    }

    public static void askNbrAndShowBiggie(int i_nbrOfNumbers) {
        int[] listNumbers = new int[i_nbrOfNumbers];
        for (int i = 0; i < listNumbers.length; i++)
            listNumbers[i] = 0;
        Utils.msgPrompt("Entrez " + i_nbrOfNumbers + " nombres:");

        for (int i = 0; i < listNumbers.length; i++) {
            listNumbers[i] = inputStdin_noDisplayResult();
            if (i != (listNumbers.length) - 1) {
                String str = "Merci, il vous manque encore " + (listNumbers.length - i - 1) + " nombres à entrer.";
                Utils.msgInfo(str);
            }
        }
        String str = "Merci. La liste entrée est la suivante: " + Arrays.toString(listNumbers);
        Utils.msgInfo(str);
        Utils.msgInfo("Recherche du nombre le plus grand...");
        int biggieNbr = 0;
        for (int i = 0; i < listNumbers.length; i++) {
            if (listNumbers[i] > biggieNbr) biggieNbr = listNumbers[i];
        }
        str = String.valueOf(biggieNbr);
        Utils.msgResult(str);
    }

    static public int inputStdin_noDisplayResult() {
        int userInput = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            boolean badInput = false;
            try {
                userInput = scanner.nextInt();
            } catch (InputMismatchException exception) {
                Utils.msgWarning("L'entrée n'est pas un nombre");
                java.awt.Toolkit.getDefaultToolkit().beep();
                badInput = true;
            }
            if (!badInput) break;
        }
        return userInput;
    }
}
