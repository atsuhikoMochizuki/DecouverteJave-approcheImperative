package fr.diginamic.tp4;

import fr.diginamic.tp3.boucles.ExerciceBoucleBase;
import fr.diginamic.tp3.boucles.ExerciceBouclesEtTests;
import fr.diginamic.tp3.boucles.ExerciceTableauEntier;
import fr.diginamic.tp4.algorithmie.AffichageInverse;
import fr.diginamic.tp4.algorithmie.AffichagePartiel;
import fr.diginamic.tp4.algorithmie.InversionContenu;
import mochizukiTools.Utils;

public class tp4 {
    public static void run() {
        System.out.println(Utils.Colors.ANSI_YELLOW + "[]LANCEMENT DU TP4 : TABLEAUX, BOUCLES ET CONDITIONS NIVEAU 2" + Utils.Colors.ANSI_RESET);
        AffichageInverse.run();
        InversionContenu.run();
        AffichagePartiel.run();
    }
}