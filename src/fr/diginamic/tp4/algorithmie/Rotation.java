package fr.diginamic.tp4.algorithmie;

import mochizukiTools.Utils;

import java.util.Arrays;

public class Rotation {
    public static int[] array = {6, 3, 7, -1, 45, 6, 8, 32, -6, 12, 3, 5};

    public static void run() {
        Utils.msgTitle("EXERCICE 9: ROTATION");
        Utils.msgInfo("CONSIGNE : \nSoit le tableau :");
        System.out.printf("%s{", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) System.out.printf(" %d,", array[i]);
            else System.out.printf(" %d", array[i]);
        }
        System.out.print("}\n");
        System.out.printf("Effectuez une rotation à droite des éléments\n%s", Utils.Colors.ANSI_RESET);
        rightRotate(array, 1, array.length);
        String result = "Nouvel agencement du tableau : " + Arrays.toString(array);
        Utils.msgResult(result);
    }

    public static void rightRotate(int[] i_array, int i_rotateNbr, int i_arraySize) {
        while (i_rotateNbr > i_arraySize) {
            i_rotateNbr = i_rotateNbr - i_arraySize;
        }
        int[] temp = new int[i_arraySize - i_rotateNbr];

        if (i_arraySize - i_rotateNbr >= 0) System.arraycopy(i_array, 0, temp, 0, i_arraySize - i_rotateNbr);

        for (int i = i_arraySize - i_rotateNbr; i < i_arraySize; i++) {
            i_array[i - i_arraySize + i_rotateNbr] = i_array[i];
        }

        if (i_arraySize - i_rotateNbr >= 0)
            System.arraycopy(temp, 0, i_array, i_rotateNbr, i_arraySize - i_rotateNbr);
    }
}
