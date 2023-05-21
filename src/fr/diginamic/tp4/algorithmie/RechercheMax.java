package fr.diginamic.tp4.algorithmie;

import mochizukiTools.Utils;

public class RechercheMax {
    public static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

    public static void run() {
        Utils.msgTitle("EXERCICE 3 : RECHERCHE MAX");
        searchMaxValueInArray(array);
    }

    public static void searchMaxValueInArray(int[] i_array) {
        Utils.msgInfo("CONSIGNE : Soit le tableau suivant: ");
        System.out.printf("%s{", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < i_array.length; i++) {
            if (i != i_array.length - 1) System.out.printf(" %d,", i_array[i]);
            else System.out.printf(" %d};", i_array[i]);
        }
        System.out.printf("\nRechercher le plus grand élément du tableau%s\n", Utils.Colors.ANSI_RESET);
        int maxValue = 0;
        for (int i = 0; i < i_array.length; i++) {
            if (i_array[i] > maxValue) maxValue = i_array[i];
        }
        String result = "La valeur maximale dans le tableau est : " + maxValue;
        Utils.msgResult(result);
    }
}
