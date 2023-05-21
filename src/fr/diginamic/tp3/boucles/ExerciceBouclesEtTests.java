package fr.diginamic.tp3.boucles;

import mochizukiTools.Utils;

public class ExerciceBouclesEtTests {
    public static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

    public static void run() {
        Utils.msgTitle("EXERCICE 3 : BOUCLES COMBINEES AVEC DES TESTS");

        System.out.printf("%sL'exercice utilisera le tableau suivant : {", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1)
                System.out.printf(" %d,", array[i]);
            else
                System.out.printf(" %d}\n", array[i]);
        }

        showItemsOfArray(array);
        showItemsOfArray_invertedOrder(array);
        showItemsOfArrayUpperThan(array, 3);
        showEvenItemsInArray(array);
        showItemsWithEvenIndex(array);
        showOddItemsInArray(array);
    }

    public static void showItemsOfArray(int[] array) {
        Utils.msgInfo("Afficher l’ensemble des éléments du tableau grâce à une boucle");
        for (int i = 0; i < array.length; i++)
            System.out.printf("Item %d: %d\n", i, array[i]);
    }

    public static void showItemsOfArray_invertedOrder(int[] array) {
        Utils.msgInfo("CONSIGNE : => Afficher l’ensemble des éléments dans l’ordre inverse du tableau");
        int startIter = array.length;
        for (int i = startIter - 1; i != -1; i--)
            System.out.printf("Item %d : %d\n", i, array[i]);
    }

    public static void showItemsOfArrayUpperThan(int[] i_array, int i_downLimit) {
        String str = "Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à " + i_downLimit;
        Utils.msgInfo(str);
        for (int i = 0; i < i_array.length; i++)
            if (i_array[i] > 3)
                System.out.printf("Item %d : %d\n", i, array[i]);
    }

    public static void showEvenItemsInArray(int[] i_array) {
        Utils.msgInfo("CONSIGNE: Combiner une boucle et un test de manière à n’afficher que les entiers pairs");
        for (int i = 0; i < i_array.length; i++)
            if (i_array[i] % 2 == 0)
                System.out.printf("Item %d : %d\n", i, i_array[i]);
    }

    public static void showItemsWithEvenIndex(int[] i_array) {
        Utils.msgInfo("CONSIGNE: Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs");
        for (int i = 0; i < i_array.length; i++)
            if (i % 2 == 0)
                System.out.printf("Item %d : %d\n", i, i_array[i]);
    }

    public static void showOddItemsInArray(int[] i_array) {
        Utils.msgInfo("CONSIGNE: CONSIGNE : Combiner une boucle et un test de manière à n’afficher que les entiers impairs");
        for (int i = 0; i < i_array.length; i++)
            if (i_array[i] % 2 != 0)
                System.out.printf("Item %d : %d\n", i, i_array[i]);
    }
}
