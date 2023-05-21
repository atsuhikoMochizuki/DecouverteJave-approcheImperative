package fr.diginamic.tp4.algorithmie;

import mochizukiTools.Utils;

public class RechercheMin {
    public static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

    public static void run() {
        Utils.msgTitle("EXERCICE 4 : RECHERCHE MIN");
        searchMinValueInArray(array);
    }

    public static void searchMinValueInArray(int[] i_array) {
        Utils.msgInfo("CONSIGNE : Soit le tableau suivant");
        System.out.printf("%s{", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < i_array.length; i++) {
            if (i != i_array.length - 1)
                System.out.printf(" %d,", i_array[i]);
            else
                System.out.printf(" %d};", i_array[i]);
        }
        System.out.printf("\nRechercher le plus petit élément du tableau%s\n", Utils.Colors.ANSI_RESET);
        int minValue = 0xFFFF;
        for (int i = 0; i < i_array.length; i++) {
            if (i_array[i] < minValue)
                minValue = i_array[i];
        }
        String result = "La valeur minimale dans le tableau est :" + minValue;
        Utils.msgResult(result);
    }
}
