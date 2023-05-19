package fr.diginamic.tp4.algorithmie;

import mochizukiTools.Utils;

public class InteractifTableMult {
    public static void run() {
        Utils.msgTitle("EXERCICE 12 : INTERACTIF TABLE MULT");
        Utils.msgInfo("""
                => CONSIGNE : Ecrire un programme qui demande un nombre à l’utilisateur qui doit être compris entre 1 et
                              10. Une fois que le nombre est bien entre 1 et 10, le programme affiche la table de
                              multiplication de ce nombre.""");
        displayMultiplicationTable();
    }

    public static void displayMultiplicationTable() {
        int nbr = InteractifTantQue.inputStdin_1to10Nbr();
        String str = "Table de multiplication de " + nbr + ":";
        Utils.msgResult(str);
        for (int i = 1; i <= 10; i++) {
            int result = nbr * i;
            System.out.printf("%d fois %d = %d\n", nbr, i, result);
        }
    }
}
