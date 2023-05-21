package fr.diginamic.tp4.algorithmie;

import mochizukiTools.Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractifTantQue {
    public static void run() {
        Utils.msgTitle("EXERCICE 11 : INTERACTIF TANT QUE");
        Utils.msgInfo("""
                CONSIGNE : Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement
                                compris entre 1 et 10 :
                                -Tant que ce nombre n’est pas compris entre 1 et 10, le programme redemande un
                                nombre à l’utilisateur.
                                -Si le nombre est compris entre 1 et 10, le programme affiche ce nombre et se termine.""");
        inputStdin_1to10Nbr();
    }

    static public int inputStdin_1to10Nbr() {
        int userInput = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            boolean badInput = false;
            try {
                Utils.msgPrompt("Entrez un nombre compris entre 1 et 10:");
                userInput = scanner.nextInt();
            } catch (InputMismatchException exception) {
                Utils.msgWarning("L'entrée n'est pas un nombre");
                badInput = true;
            }
            if (!badInput) {
                boolean verif = false;
                for (int i = 1; i <= 10; i++) {
                    if (i == userInput) {
                        verif = true;
                        i = 10;
                    }
                }
                if (verif) break;
                else Utils.msgWarning("Le nombre entré est incorrect");
            }
        }
        Utils.msgResult("Vous avez entré " + userInput + ". C'est très bien, je suis fier de vous.");
        return userInput;
    }
}
