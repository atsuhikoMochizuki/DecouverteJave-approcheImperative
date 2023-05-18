package fr.diginamic.tp4.algorithmie;

import mochizukiTools.Utils;

import java.util.Arrays;

public class ComparaisonTableaux {
    public static int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
    public static int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

    public static void run() {
        System.out.println(Utils.Colors.ANSI_PURPLE + "[]EXERCICE 7 : COMPARAISON DE TABLEAUX" + Utils.Colors.ANSI_RESET);
        compareTwoArrays(array1, array2);
    }

    public static int compareTwoArrays(int[] i_array1, int[] i_array2) {
        System.out.printf("%s=> CONSIGNE : Soit le tableau 1 {", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < i_array1.length; i++) {
            if (i != i_array1.length - 1)
                System.out.printf(" %d,", i_array1[i]);
            else
                System.out.printf(" %d}\n", i_array1[i]);
        }
        System.out.printf("%set le tableau 2 {", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < i_array2.length; i++) {
            if (i != i_array2.length - 1)
                System.out.printf(" %d,", i_array2[i]);
            else
                System.out.printf(" %d}", i_array2[i]);
        }
        System.out.printf("\nEcrire le code permettant de compter le nombre d’éléments en commun dans ces 2\n" +
                "tableaux%s\n", Utils.Colors.ANSI_RESET);

        int[] cleanArray1 = ArrayCleaner(i_array1);
        int[] cleanArray2 = ArrayCleaner(i_array2);

        int commonElemNbr = 0;
        if (cleanArray1.length > cleanArray2.length) {
            int i = 0, j = 0;
            for (i = 0; i < cleanArray1.length; i++) {
                for (j = 0; j < cleanArray2.length; j++) {
                    if (cleanArray1[i] == cleanArray2[j])
                        commonElemNbr++;
                }
            }
        } else {
            int i = 0, j = 0;
            for (i = 0; i < cleanArray2.length; i++) {
                for (j = 0; j < cleanArray1.length; j++) {
                    if (cleanArray2[i] == cleanArray1[j])
                        commonElemNbr++;
                }
            }
        }
        System.out.println("=> Nombre d'éléments en commun dans les deux tableaux: " + commonElemNbr);
        return commonElemNbr;
    }

    public static int[] ArrayCleaner(int[] i_array) {
        System.out.println("[]Création d'un nouveau tableau exempts de doublons");
        System.out.println("[]Tableau brut : " + Arrays.toString(i_array));
        System.out.println("[]Nettoyage...");

        Arrays.sort(i_array);
        int len = i_array.length;
        len = removeDuplicate(i_array, len);
        int[] cleanArray1 = new int[len];
        System.arraycopy(i_array, 0, cleanArray1, 0, len);

        System.out.println("[]Nouveau tableau: " + Arrays.toString(cleanArray1));
        return cleanArray1;
    }


    public static int removeDuplicate(int[] arrNumbers, int num) {
        if (num == 0 || num == 1)
            return num;
        int[] arrTemporary = new int[num];
        int b = 0;
        for (int a = 0; a < num - 1; a++) {
            if (arrNumbers[a] != arrNumbers[a + 1])
                arrTemporary[b++] = arrNumbers[a];

        }
        arrTemporary[b++] = arrNumbers[num - 1];
        if (b >= 0) System.arraycopy(arrTemporary, 0, arrNumbers, 0, b);
        return b;
    }


}
