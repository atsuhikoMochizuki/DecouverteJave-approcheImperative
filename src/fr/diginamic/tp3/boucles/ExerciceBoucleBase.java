package fr.diginamic.tp3.boucles;

import mochizukiTools.Utils;

public class ExerciceBoucleBase {
    public static void run() {
        Utils.msgTitle("EXERCICE 1 : BOUCLES DE BASE");
        showNumbers(0, 10);
        showFirstAndLastName(20, "Atsuhiko", "Mochizuki");
        showEvenNumbers(0, 100);
        showOddNumbers(0, 99);
    }

    public static void showNumbers(int i_startNumber, int i_endNumber) {
        String str = "CONSIGNE : Affichez les nombres de " + i_startNumber + " à " + i_endNumber;
        Utils.msgInfo(str);

        for (int i = i_startNumber; i <= i_endNumber; i++)
            System.out.printf("Nombre: %d \n", i);
    }

    public static void showFirstAndLastName(int i_displayNbr, String i_firstName, String i_lastName) {
        String str = "CONSIGNE : Affichez " + i_displayNbr + " fois " + i_firstName + " " + i_lastName;
        Utils.msgInfo(str);
        for (int i = 0; i < i_displayNbr; i++)
            System.out.printf("%d: %s %s\n", i, i_firstName, i_lastName);
    }

    public static void showEvenNumbers(int i_startNumber, int i_endNumber) {
        String str = "CONSIGNE : Affichez les nombres pairs de " + i_startNumber + " à " + i_endNumber;
        Utils.msgInfo(str);
        for (int i = i_startNumber; i <= i_endNumber; i++)
            if (i % 2 == 0)
                System.out.printf("Nombre : %d\n", i);
    }

    public static void showOddNumbers(int i_startNumber, int i_endNumber) {
        String str = "CONSIGNE : Affichez les nombres impairs de " + i_startNumber + " à " + i_endNumber;
        Utils.msgInfo(str);
        for (int i = i_startNumber; i <= i_endNumber; i++)
            if (i % 2 != 0)
                System.out.printf("Nombre : %d\n", i);
    }
}