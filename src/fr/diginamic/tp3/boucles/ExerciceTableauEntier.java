package fr.diginamic.tp3.boucles;

import mochizukiTools.Utils;

public class ExerciceTableauEntier {
    public static int[] entiers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void run() {
        Utils.msgTitle("EXERCICE 2 : PARCOURS D'UN TABLEAU D'ENTIERS");
        showNumberInArray(entiers, 0);
        showArrayLength(entiers);
        showlastItemInArray(entiers);
        updateItemInArray(entiers, 4, 8);
    }

    public static void showNumberInArray(int[] i_array, int i_index) {
        Utils.msgInfo("Soit le tableau suivant:");

        System.out.printf("%s{", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < i_array.length; i++) {
            if (i != i_array.length - 1)
                System.out.printf(" %d,", i_array[i]);
            else
                System.out.printf(" %d};", i_array[i]);
        }
        System.out.printf("\nAffichez l'élément %d du tableau%s\n", i_index, Utils.Colors.ANSI_RESET);

        System.out.println(i_array[i_index]);
    }

    public static void showArrayLength(int[] i_array) {
        Utils.msgInfo("Soit le tableau suivant:");
        System.out.printf("%s{", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < i_array.length; i++) {
            if (i != i_array.length - 1)
                System.out.printf(" %d,", i_array[i]);
            else
                System.out.printf(" %d};", i_array[i]);
        }
        System.out.printf("\nAffichez la longueur du tableau%s\n", Utils.Colors.ANSI_RESET);
        System.out.println(i_array.length);
    }

    public static void showlastItemInArray(int[] i_array) {
        Utils.msgInfo("Soit le tableau suivant:");
        System.out.printf("%s{", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < i_array.length; i++) {
            if (i != i_array.length - 1)
                System.out.printf(" %d,", i_array[i]);
            else
                System.out.printf(" %d};", i_array[i]);
        }
        System.out.printf("\nAffichez le dernier élément du tableau en utilisant la propriété length%s\n", Utils.Colors.ANSI_RESET);
        System.out.println(i_array[i_array.length - 1]);
    }

    public static void updateItemInArray(int[] i_array, int i_item, int i_value) {
        Utils.msgInfo("Soit le tableau suivant:");
        System.out.printf("%s{", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < i_array.length; i++) {
            if (i != i_array.length - 1)
                System.out.printf(" %d,", i_array[i]);
            else
                System.out.printf(" %d};", i_array[i]);
        }
        System.out.printf("\nModifiez la valeur de l’élément d’index 4 et donnez lui la valeur 8%s\n", Utils.Colors.ANSI_RESET);
        String str = "La valeur actuelle de l'élément " + i_item + " est " + i_array[i_item];
        Utils.msgInfo(str);
        Utils.msgInfo("Modification...");
        i_array[i_item] = i_value;
        str = "La nouvelle valeur de l'élément " + i_item + " est " + i_array[i_item];
        Utils.msgResult(str);
    }
}
