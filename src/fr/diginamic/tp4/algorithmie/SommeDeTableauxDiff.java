package fr.diginamic.tp4.algorithmie;

import mochizukiTools.Utils;

public class SommeDeTableauxDiff {
    public static int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
    public static int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};

    public static void run() {
        System.out.println(Utils.Colors.ANSI_PURPLE + "[]EXERCICE 6 : SOMME DE TABLEAUX DIFFERENTS" + Utils.Colors.ANSI_RESET);
        SommeDeTableaux.sumOfTwoArrays(array1, array2);
    }
}
