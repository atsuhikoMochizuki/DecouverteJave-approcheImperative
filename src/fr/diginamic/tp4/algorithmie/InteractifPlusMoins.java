package fr.diginamic.tp4.algorithmie;

import mochizukiTools.Utils;

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


//        while(true) {
//            String prompt = "Choisissez un nombre entre " + i_min + " et " + i_max;
//            Utils.msgRequest(prompt);
//            int choice = InteractifPlusGrand.inputStdin_noDisplayResult();
//            if (choice > 1 && choice > 100) {
//
//                break;
//            }
//        }
    }
}
