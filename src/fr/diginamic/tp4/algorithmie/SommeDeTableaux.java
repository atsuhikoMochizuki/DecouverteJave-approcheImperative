package fr.diginamic.tp4.algorithmie;

import java.util.Arrays;

import mochizukiTools.Utils;

public class SommeDeTableaux {
    public static int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
    public static int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};


    public static void run() {
        System.out.println(Utils.Colors.ANSI_PURPLE + "[]EXERCICE 5 : SOMME DE TABLEAUX" + Utils.Colors.ANSI_RESET);
        sumOfTwoArrays(array1, array2);
    }

    public static void sumOfTwoArrays(int[] i_array1, int[] i_array2) {
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
        System.out.printf("\nCréer un tableau qui contient la somme des 2 précédents tableaux%s\n", Utils.Colors.ANSI_RESET);

        System.out.println("[]On ajuste les deux tableaux à la même taille...");
        int sizeMax = 0;
        if (i_array1.length < i_array2.length)
            sizeMax = i_array2.length;
        else
            sizeMax = i_array1.length;
        int[] copyArray1 = Arrays.copyOf(i_array1, sizeMax);
        int[] copyArray2 = Arrays.copyOf(i_array2, sizeMax);
        int[] resultArray = new int[sizeMax];
        for (int i = 0; i < sizeMax; i++) {
            resultArray[i] = copyArray1[i] + copyArray2[i];
            System.out.printf("copyArray1[%02d]:%3d\t<==>\tcopyArray2[%02d]:%4d\t\t==>\t\tresultArray[%02d]:%4d\n",
                    i, copyArray1[i], i, copyArray2[i], i, copyArray1[i] + copyArray2[i]);
        }
        System.out.println("Le tableau résultant de la somme des deux autres est le suivant:");
        for (int i = 0; i < sizeMax; i++)
            System.out.printf("resultArray[%02d]: %3d\n", i, resultArray[i]);
    }
}
