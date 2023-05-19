package fr.diginamic.tp4.algorithmie;

import mochizukiTools.Utils;

import java.util.Arrays;

public class Rotation {
    public static int[] array = {6, 3, 7, -1, 45, 6, 8, 32, -6, 12, 3, 5};

    public static void run() {
        System.out.println(Utils.Colors.ANSI_PURPLE + "[]EXERCICE 9: ROTATION" + Utils.Colors.ANSI_RESET);
        System.out.printf("%s=> CONSIGNE : \nSoit le tableau {", Utils.Colors.ANSI_BLUE);
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1)
                System.out.printf(" %d,", array[i]);
            else
                System.out.printf(" %d", array[i]);
        }
        System.out.print("}\n");
        System.out.printf("Effectuez une rotation à droite des éléments\n%s", Utils.Colors.ANSI_RESET);
        rightRotate(array, 1, array.length);
        System.out.println("Nouvel agencement du tableau : " + Arrays.toString(array));
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
            System.arraycopy(temp, 0, i_array, 0 + i_rotateNbr, i_arraySize - i_rotateNbr);
    }
}
