package fr.diginamic.tp4.algorithmie;

import mochizukiTools.Utils;

public class FirstLast6 {
    public static int[] array1 = {};
    public static int[] array2 = {1, 5, 8, 135, 24578};
    public static int[] array3 = {6, 3, 7, -1, 45, 6};

    public static void run() {
        System.out.println(Utils.Colors.ANSI_PURPLE + "[]EXERCICE 8 : FIRST LAST 6" + Utils.Colors.ANSI_RESET);
        System.out.printf("%s=> CONSIGNE : \nSoit le tableau 1 {", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < array1.length; i++) {
            if (i != array1.length - 1)
                System.out.printf(" %d,", array1[i]);
            else
                System.out.printf(" %d", array1[i]);
        }
        System.out.print("}\n");
        System.out.printf("%set le tableau 2 {", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < array2.length; i++) {
            if (i != array2.length - 1)
                System.out.printf(" %d,", array2[i]);
            else
                System.out.printf(" %d}\n", array2[i]);
        }
        System.out.printf("%set le tableau 3 {", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < array3.length; i++) {
            if (i != array3.length - 1)
                System.out.printf(" %d,", array3[i]);
            else
                System.out.printf(" %d}\n", array3[i]);
        }
        System.out.printf("""
                - Calculer une valeur booléenne qui contrôle le tableau de la sorte :
                    -elle vaut true si le tableau est de longueur supérieure ou égale à 1 et que le
                    premier et le dernier élément du tableau ont la même valeur
                    - elle vaut false dans les autres cas
                - Ecrire l’algo de valorisation de cette variable avec le minimum de ligne%s
                """, Utils.Colors.ANSI_RESET);

        System.out.println("Tableau1 : " + firstLast6(array1));
        System.out.println("Tableau2 : " + firstLast6(array2));
        System.out.println("Tableau3 : " + firstLast6(array3));
    }

    public static boolean firstLast6(int[] i_array) {
        if (i_array.length >= 1) {
            return i_array[0] == i_array[i_array.length - 1];
        } else
            return false;
    }
}
