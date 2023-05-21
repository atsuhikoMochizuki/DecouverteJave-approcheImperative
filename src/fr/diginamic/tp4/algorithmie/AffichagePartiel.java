package fr.diginamic.tp4.algorithmie;

import mochizukiTools.Utils;

public class AffichagePartiel {

    public static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

    public static void run() {
        Utils.msgTitle("EXERCICE 3 : AFFICHAGE PARTIEL");
        showOnlyUpperThan3Values(array);
        showOnlyEvenValues(array);
        showOnlyValuesWithEvenIndex(array);
        showOnlyOddValues(array);
    }

    public static void showOnlyUpperThan3Values(int[] i_array) {
        Utils.msgInfo("CONSIGNE : Soit le tableau suivant: ");
        System.out.printf("%s{", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < i_array.length; i++) {
            if (i != i_array.length - 1) System.out.printf(" %d,", i_array[i]);
            else System.out.printf(" %d};", i_array[i]);
        }
        System.out.printf("\nCombiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3%s\n", Utils.Colors.ANSI_RESET);
        for (int i = 0; i < i_array.length; i++) {
            if (i_array[i] > 3) System.out.printf("Item %d : %d\n", i, i_array[i]);
        }
    }

    public static void showOnlyEvenValues(int[] i_array) {
        Utils.msgInfo("CONSIGNE : Soit le tableau suivant: ");
        System.out.printf("%s{", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < i_array.length; i++) {
            if (i != i_array.length - 1) System.out.printf(" %d,", i_array[i]);
            else System.out.printf(" %d};", i_array[i]);
        }
        System.out.printf("\nCombiner une boucle et un test de manière à n’afficher que les entiers pairs%s\n", Utils.Colors.ANSI_RESET);
        for (int i = 0; i < i_array.length; i++) {
            if (i_array[i] % 2 == 0) System.out.printf("Item %d : %d\n", i, i_array[i]);
        }
    }

    public static void showOnlyValuesWithEvenIndex(int[] i_array) {
        Utils.msgInfo("CONSIGNE : Soit le tableau suivant: ");
        System.out.printf("%s{", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < i_array.length; i++) {
            if (i != i_array.length - 1) System.out.printf(" %d,", i_array[i]);
            else System.out.printf(" %d};", i_array[i]);
        }
        System.out.printf("\nCombiner une boucle et un test de manière à n’afficher que les valeurs correspondant\n" + "aux index pairs%s\n", Utils.Colors.ANSI_RESET);
        for (int i = 0; i < i_array.length; i++) {
            if (i % 2 == 0) System.out.printf("Item %d : %d\n", i, i_array[i]);
        }
    }

    public static void showOnlyOddValues(int[] i_array) {
        Utils.msgInfo("CONSIGNE : Soit le tableau suivant: ");
        System.out.printf("%s{", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < i_array.length; i++) {
            if (i != i_array.length - 1) System.out.printf(" %d,", i_array[i]);
            else System.out.printf(" %d};", i_array[i]);
        }
        System.out.printf("\nCombiner une boucle et un test de manière à n’afficher que les entiers impairs%s\n", Utils.Colors.ANSI_RESET);
        for (int i = 0; i < i_array.length; i++) {
            if (i_array[i] % 2 != 0) System.out.printf("Item %d : %d\n", i, i_array[i]);
        }
    }
}
