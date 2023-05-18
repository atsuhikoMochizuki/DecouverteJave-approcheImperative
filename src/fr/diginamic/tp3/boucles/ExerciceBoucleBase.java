package fr.diginamic.tp3.boucles;

import mochizukiTools.Utils;

public class ExerciceBoucleBase {
    public static void run() {
        System.out.println(Utils.Colors.ANSI_PURPLE + "[]EXERCICE 1 : BOUCLES DE BASE" + Utils.Colors.ANSI_RESET);
        showNumbers(0, 10);
        showFirstAndLastName(20, "Atsuhiko", "Mochizuki");
        showEvenNumbers(0, 100);
        showOddNumbers(0, 99);
    }

    public static void showNumbers(int i_startNumber, int i_endNumber) {
        System.out.printf("%s=> CONSIGNE : Affichez les nombres de %d à %d%s\n", Utils.Colors.ANSI_BLUE, i_startNumber, i_endNumber, Utils.Colors.ANSI_RESET);
        for (int i = i_startNumber; i <= i_endNumber; i++)
            System.out.printf("nombre: %d \n", i);
        System.out.println("\n");
    }

    public static void showFirstAndLastName(int i_displayNbr, String i_firstName, String i_lastName) {
        System.out.printf("%s=> CONSIGNE : Affichez %d fois '%s %s'%s:\n", Utils.Colors.ANSI_BLUE, i_displayNbr, i_firstName, i_lastName, Utils.Colors.ANSI_RESET);
        for (int i = 0; i < i_displayNbr; i++)
            System.out.printf("%d: %s %s\n", i, i_firstName, i_lastName);
        System.out.println("\n");
    }

    public static void showEvenNumbers(int i_startNumber, int i_endNumber) {
        System.out.printf("%s=> CONSIGNE : affichez les nombres pairs de %d à %d:%s\n", Utils.Colors.ANSI_BLUE, i_startNumber, i_endNumber, Utils.Colors.ANSI_RESET);
        for (int i = i_startNumber; i <= i_endNumber; i++)
            if (i % 2 == 0)
                System.out.printf("Nombre : %d\n", i);
        System.out.println("\n");
    }

    public static void showOddNumbers(int i_startNumber, int i_endNumber) {
        System.out.printf("%s=> CONSIGNE : affichez les nombres impairs de %d à %d:%s\n", Utils.Colors.ANSI_BLUE, i_startNumber, i_endNumber, Utils.Colors.ANSI_RESET);
        for (int i = i_startNumber; i <= i_endNumber; i++)
            if (i % 2 != 0)
                System.out.printf("Nombre : %d\n", i);
        System.out.println("\n");
    }
}