package fr.diginamic.tp4.algorithmie;

import mochizukiTools.Utils;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.RuntimeException;

public class InteractifTantQue {
    public static void run() {
        System.out.println(Utils.Colors.ANSI_PURPLE + "[]EXERCICE 11 : INTERACTIF TANT QUE" + Utils.Colors.ANSI_RESET);
        System.out.printf("""
                %s=> CONSIGNE : Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement
                                compris entre 1 et 10 :
                                -Tant que ce nombre n’est pas compris entre 1 et 10, le programme redemande un
                                nombre à l’utilisateur.
                                -Si le nombre est compris entre 1 et 10, le programme affiche ce nombre et se termine.%s
                    """, Utils.Colors.ANSI_BLUE, Utils.Colors.ANSI_RESET);
        inputStdin_1to10Nbr();
    }

    static public void inputStdin_1to10Nbr() {
        int userInput = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            boolean badInput = false;
            try {
                Utils.msgRequest("Entrez un nombre compris entre 1 et 10:");
                //nextInt will throw InputMismatchException
                //if the next token does not match the Integer
                //regular expression, or is out of range
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
                if (verif)
                    break;
                else
                    Utils.msgWarning("Le nombre entré est incorrect");
            }
        }
        Utils.msgSuccess("Vous avez entré " + userInput + ". C'est très bien, je suis fier de vous.");
    }
}
