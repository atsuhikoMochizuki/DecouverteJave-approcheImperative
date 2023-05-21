package fr.diginamic.tp4.algorithmie;

import jdk.jshell.execution.Util;
import mochizukiTools.Utils;

public class FabriquerMur {
    public static void run() {
        System.out.println(Utils.Colors.ANSI_PURPLE + "[]EXERCICE 10 : FABRIQUER UN MUR" + Utils.Colors.ANSI_RESET);
        System.out.printf("Effectuez une rotation à droite des éléments\n%s", Utils.Colors.ANSI_RESET);
        System.out.printf("""
                %s=> CONSIGNE : Produire un algorithme qui retourne s’il est possible ou non de
                fabriquer un mur avec des briques de longueur 1 et des briques de longueur 5
                    Exemple:
                        - j’ai 2 briques de longueur 1 et 2 briques de longueur 5, est-il possible de créer un
                         mur de 11m ? la réponse est oui, il suffit de prendre 2 briques de 5 et une brique
                         de 1.
                        - j’ai 3 briques de longueur 1 et 1 brique de longueur 5, est-il possible de créer un
                          mur de 9m ? la réponse est non.
                    Veuillez compléter la méthode fabriquerMur qui prend en paramètres :
                        - nbSmall : le nombre de briques de longueur 1
                        - nbBig : le nombre de briques de longueur 5
                        - longueur : la taille du mur
                    A l’exécution les méthodes verifier exécutées avec diverses valeurs de paramètres
                    permettent de dire si oui ou non votre algorithme fonctionne.%s
                    """, Utils.Colors.ANSI_BLUE, Utils.Colors.ANSI_RESET);
        fabriquerMur(2, 10, 52, true);
        System.out.println("[]Tests unitaires de la fonction fabriquerMur...");
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 2, 9, false);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
    }

    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
        if (!fabriquerMur(nbSmall, nbBig, longueur, false) == b) {
            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " +
                    longueur + ") NON passant.s");
        } else
            System.err.printf("%sTest (" + nbSmall + ", " + nbBig + ", " +
                    longueur + ") passant.\n%s", Utils.Colors.ANSI_GREEN, Utils.Colors.ANSI_RESET);

    }

    static boolean fabriquerMur(int nbSmall, int nbBig, int longueur, boolean isVerbose) {
        boolean resultat = false;
        if (isVerbose) {
            System.out.printf("Vous souhaitez fabriquer un mur de longueur %d avec %d briques" +
                    " de longueur 5 et %d briques de longueur 1\n", longueur, nbBig, nbSmall);
            System.out.printf("[%sverif%s]Vérification de l'agencement...", Utils.Colors.ANSI_YELLOW, Utils.Colors.ANSI_RESET);
        }

        if (nbSmall < 1 || nbBig < 1) {
            if (isVerbose) {
                System.out.printf("%sNOK%s\n", Utils.Colors.ANSI_RED, Utils.Colors.ANSI_RESET);
                System.out.printf("[%sresult%s]%sVotre Agencement est impossible (un type de brique n'est pas utilisé)%s\n",
                        Utils.Colors.ANSI_PURPLE,
                        Utils.Colors.ANSI_RESET,
                        Utils.Colors.ANSI_RED,
                        Utils.Colors.ANSI_RESET);
            }
            return false;
        }
        int longueurBricksSum = nbSmall + nbBig * 5;
        if (longueur != longueurBricksSum) {
            if (isVerbose) {
                System.out.printf("%sNOK%s\n", Utils.Colors.ANSI_RED, Utils.Colors.ANSI_RESET);
                System.out.printf("[%sresult%s]%sVotre Agencement est impossible (longueurs totale des briques != longueur du mur)%s\n",
                        Utils.Colors.ANSI_PURPLE,
                        Utils.Colors.ANSI_RESET,
                        Utils.Colors.ANSI_RED,
                        Utils.Colors.ANSI_RESET);
            }
            return false;
        }
        if (isVerbose) {
            System.out.printf("%sOK%s\n", Utils.Colors.ANSI_GREEN, Utils.Colors.ANSI_RESET);
            System.out.printf("[%sresult%s]%sVotre Agencement est possible%s\n",
                    Utils.Colors.ANSI_PURPLE,
                    Utils.Colors.ANSI_RESET,
                    Utils.Colors.ANSI_GREEN,
                    Utils.Colors.ANSI_RESET);
        }
        return true;
    }
}


