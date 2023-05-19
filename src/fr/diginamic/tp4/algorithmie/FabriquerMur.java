package fr.diginamic.tp4.algorithmie;

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
        fabriquerMur(2, 22, 22);

    }

    static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        boolean resultat = false;
        System.out.printf("Vous souhaitez fabriquer un mur de longueur %d avec %d briques" +
                " de longueur 5 et %d briques de longueur 1\n", longueur, nbBig, nbSmall);
        System.out.printf("[%sverif%s]Longueur du mur > 5...", Utils.Colors.ANSI_YELLOW, Utils.Colors.ANSI_RESET);
        if (longueur > nbBig) {
            System.out.printf("%sOK%s\n", Utils.Colors.ANSI_GREEN, Utils.Colors.ANSI_RESET);
            System.out.printf("[%sverif%s]Longueur du mur > 1...", Utils.Colors.ANSI_YELLOW, Utils.Colors.ANSI_RESET);
            if (longueur > nbSmall)
                System.out.printf("%sOK%s\n", Utils.Colors.ANSI_GREEN, Utils.Colors.ANSI_RESET);
            else {
                System.out.printf("%sNOK%s\n", Utils.Colors.ANSI_RED, Utils.Colors.ANSI_RESET);
                System.out.printf("[%sresult%s]%sVotre Agencement est impossible%s\n",
                        Utils.Colors.ANSI_PURPLE,
                        Utils.Colors.ANSI_RESET,
                        Utils.Colors.ANSI_RED,
                        Utils.Colors.ANSI_RESET);
                return false;
            }
        } else {
            System.out.printf("%sNOK%s\n", Utils.Colors.ANSI_RED, Utils.Colors.ANSI_RESET);
            System.out.printf("[%sresult%s]%sVotre Agencement est impossible%s\n",
                    Utils.Colors.ANSI_PURPLE,
                    Utils.Colors.ANSI_RESET,
                    Utils.Colors.ANSI_RED,
                    Utils.Colors.ANSI_RESET);
            return false;
        }
        System.out.printf("[%sverif%s]Agencement possible des 2 types de briques...", Utils.Colors.ANSI_YELLOW, Utils.Colors.ANSI_RESET);
        if (longueur % nbBig == 0) {
            System.out.printf("%sNOK%s\n", Utils.Colors.ANSI_RED, Utils.Colors.ANSI_RESET);
            System.out.printf("[%sresult%s]%sVotre Agencement est impossible%s\n",
                    Utils.Colors.ANSI_PURPLE,
                    Utils.Colors.ANSI_RESET,
                    Utils.Colors.ANSI_RED,
                    Utils.Colors.ANSI_RESET);
            return false;
        } else
            System.out.printf("%sOK%s\n", Utils.Colors.ANSI_GREEN, Utils.Colors.ANSI_RESET);
        System.out.printf("[%sverif%s]Cohérence du nbre de briques de longueur 1...", Utils.Colors.ANSI_YELLOW, Utils.Colors.ANSI_RESET);

        if (nbSmall != longueur - (nbBig * 5)) {
            System.out.printf("%sNOK%s\n", Utils.Colors.ANSI_RED, Utils.Colors.ANSI_RESET);
            System.out.printf("[%sresult%s]%sVotre Agencement est impossible%s\n",
                    Utils.Colors.ANSI_PURPLE,
                    Utils.Colors.ANSI_RESET,
                    Utils.Colors.ANSI_RED,
                    Utils.Colors.ANSI_RESET);
            return false;
        }
        System.out.printf("%sOK%s\n", Utils.Colors.ANSI_GREEN, Utils.Colors.ANSI_RESET);
        System.out.printf("[%sresult%s]%sVotre Agencement est possible%s\n",
                Utils.Colors.ANSI_PURPLE,
                Utils.Colors.ANSI_RESET,
                Utils.Colors.ANSI_GREEN,
                Utils.Colors.ANSI_RESET);
        return true;
    }
}

