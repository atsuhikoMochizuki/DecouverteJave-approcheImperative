package fr.diginamic.tp4.algorithmie;

import mochizukiTools.Utils;

public class InteractifSommeArithmetique {
    public static void run() {
        Utils.msgTitle("EXERCICE 14 : INTERACTIF SOMME ARITHMETIQUE");
        Utils.msgInfo("""
                => CONSIGNE :Ecrire un programme qui demande un nombre à l’utilisateur puis calcule la somme de tous les
                             entiers compris entre 1 et ce nombre.""");
        displayArithmeticSum();
    }

    public static void displayArithmeticSum() {
        int nbr = InteractifTantQue.inputStdin_1to10Nbr();
        String str = "Somme de tous les entiers entre 1 et " + nbr + ":";
        Utils.msgResult(str);
        int result = 0;
        for (int i = 1; i <= nbr; i++)
            result += i;
        String str1 = String.valueOf(result);
        Utils.msgResult(str1);
    }
}
