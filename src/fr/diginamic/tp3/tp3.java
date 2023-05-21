package fr.diginamic.tp3;

import fr.diginamic.tp3.boucles.ExerciceBoucleBase;
import fr.diginamic.tp3.boucles.ExerciceBouclesEtTests;
import fr.diginamic.tp3.boucles.ExerciceTableauEntier;
import mochizukiTools.Utils;
import mochizukiTools.Utils.Colors;

public class tp3 {
    public static void run() {
        Utils.msgTitle("LANCEMENT DU TP3 : TABLEAUX, BOUCLES ET CONDITIONS NIVEAU 1");
        ExerciceBoucleBase.run();
        ExerciceTableauEntier.run();
        ExerciceBouclesEtTests.run();
    }
}
