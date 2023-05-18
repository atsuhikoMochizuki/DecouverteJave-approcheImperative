package fr.diginamic.tp4.algorithmie;

import mochizukiTools.Utils;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;

public class InversionContenu {
    public static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

    public static void run() {
        System.out.println(Utils.Colors.ANSI_PURPLE + "[]EXERCICE 2 : INVERSION CONTENU" + Utils.Colors.ANSI_RESET);
        copyArrayAndinvertOrder(array);

    }

    public static void copyArrayAndinvertOrder(int[] i_array) {
        System.out.printf("%s=> CONSIGNE : Soit le tableau suivant {", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < i_array.length; i++) {
            if (i != i_array.length - 1)
                System.out.printf(" %d,", i_array[i]);
            else
                System.out.printf(" %d};", i_array[i]);
        }
        System.out.printf("\nCréer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais\n" +
                "dans l’ordre inverse.%s\n", Utils.Colors.ANSI_RESET);
        int[] arrayCopy = new int[i_array.length];
        int i = 0, j = 0;
        for (i = i_array.length - 1, j = 0; i >= 0; i--)
            arrayCopy[j++] = i_array[i];
        System.out.println("Les valeurs des tableaux sont les suivantes :");
        for (int k = 0; k < arrayCopy.length; k++)
            System.out.printf("array[%02d]:%03d\t\t\t<==>\t\t\tcopyArray[%02d]:%03d\n", k, arrayCopy[k], k, i_array[k]);
    }
}
