package fr.diginamic.tp4.algorithmie;

import mochizukiTools.Utils;

import java.util.Arrays;
import java.util.Collections;

public class AffichageInverse {

    public static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

    public static void run() {
        Utils.msgTitle("EXERCICE 1 : AFFICHAGE INVERSE");
        showValuesOfArray(array);
        showValuesOfArray_invertedOrder(array);
        createCopyOfArray(array);
    }


    public static void showValuesOfArray(int[] i_array) {
        Utils.msgInfo("CONSIGNE : Soit le tableau suivant:");
        System.out.printf("%s{", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < i_array.length; i++) {
            if (i != i_array.length - 1) System.out.printf(" %d,", i_array[i]);
            else System.out.printf(" %d};", i_array[i]);
        }
        System.out.printf("\nAfficher l’ensemble des éléments du tableau grâce à une boucle%s\n", Utils.Colors.ANSI_RESET);
        for (int i = 0; i < i_array.length; i++)
            System.out.printf("Item %d : %d\n", i, i_array[i]);
    }

    public static void showValuesOfArray_invertedOrder(int[] i_array) {
        Utils.msgInfo("CONSIGNE : Soit le tableau suivant:");
        System.out.printf("%s{", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < i_array.length; i++) {
            if (i != i_array.length - 1) System.out.printf(" %d,", i_array[i]);
            else System.out.printf(" %d};", i_array[i]);
        }
        System.out.printf("\nAfficher l’ensemble des éléments dans l’ordre inverse du tableau%s\n", Utils.Colors.ANSI_RESET);
        for (int i = i_array.length - 1; i >= 0; i--)
            System.out.printf("Item %d : %d\n", i, i_array[i]);
    }

    public static void createCopyOfArray(int[] i_array) {
        Utils.msgInfo("CONSIGNE : Soit le tableau suivant:");
        System.out.printf("%s{", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < i_array.length; i++) {
            if (i != i_array.length - 1) System.out.printf(" %d,", i_array[i]);
            else System.out.printf(" %d};", i_array[i]);
        }

        System.out.printf("\nCréer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy%s\n", Utils.Colors.ANSI_RESET);
        int[] arrayCopy = Arrays.copyOf(i_array, i_array.length);
        System.out.println("Les valeurs du nouveau tableau sont les suivantes:");
        for (int i = 0; i < arrayCopy.length; i++)
            System.out.printf("item %d : %d\n", i, arrayCopy[i]);
    }
}