package fr.diginamic.tp4.algorithmie;

import mochizukiTools.Utils;

public class InteractifChiffresSuivants {
    public static void run() {
        Utils.msgTitle("EXERCICE 13 : INTERACTIF CHIFFRES SUIVANTS");
        Utils.msgInfo("""
                => CONSIGNE :Ecrire un programme qui demande un nombre à l’utilisateur 
                   puis qui affiche les 10 nombres suivants. 
                   Par exemple si l’utilisateur saisit 5, le programme 
                   affiche : 6, 7, 8, 9, 10, 11, 12, 13,14, 15.""");
        displayFollowingTenNumbers();
    }

    public static void displayFollowingTenNumbers() {
        int nbr = InteractifTantQue.inputStdin_1to10Nbr();
        String str = "Les dix chiffres succédant à " + nbr + " sont: ";
        Utils.msgResult(str);
        for (int i = 1; i <= 10; i++)
            System.out.printf(nbr + i + " ");
        System.out.print("\n");
    }
}
