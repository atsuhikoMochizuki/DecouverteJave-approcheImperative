package fr.diginamic.tp4.algorithmie;

import mochizukiTools.Utils;

public class CalculMoyenne {
    public static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

    public static void run() {
        System.out.println(Utils.Colors.ANSI_PURPLE + "[]EXERCICE 5 : CALCUL MOYENNE" + Utils.Colors.ANSI_RESET);
        calculateAverage(array);
    }

    public static void calculateAverage(int[] i_array) {
        System.out.printf("%s=> CONSIGNE : Soit le tableau suivant {", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < i_array.length; i++) {
            if (i != i_array.length - 1)
                System.out.printf(" %d,", i_array[i]);
            else
                System.out.printf(" %d};", i_array[i]);
        }
        System.out.printf("\nQuelle est la moyenne des éléments du tableau ?%s\n", Utils.Colors.ANSI_RESET);
        int sum = 0, i = 0;
        for (i = 0; i < i_array.length; i++) {
            sum += i_array[i];
        }
        float average = (float) sum / i;
        System.out.printf("La moyenne des éléments du tableau est : %f\n", average);
    }
}
