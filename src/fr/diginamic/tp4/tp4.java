package fr.diginamic.tp4;

import fr.diginamic.tp3.boucles.ExerciceBoucleBase;
import fr.diginamic.tp3.boucles.ExerciceBouclesEtTests;
import fr.diginamic.tp3.boucles.ExerciceTableauEntier;
import fr.diginamic.tp4.algorithmie.*;
import mochizukiTools.Utils;

public class tp4 {
    public static void run() {
        Utils.msgTitle("LANCEMENT DU TP4 : TABLEAUX, BOUCLES ET CONDITIONS NIVEAU 2");
        AffichageInverse.run();
        InversionContenu.run();
        AffichagePartiel.run();
        RechercheMax.run();
        RechercheMin.run();
        CalculMoyenne.run();
        SommeDeTableaux.run();
        SommeDeTableauxDiff.run();
        ComparaisonTableaux.run();
        FirstLast6.run();
        Rotation.run();
        FabriquerMur.run();
        InteractifTantQue.run();
        InteractifTableMult.run();
        InteractifChiffresSuivants.run();
        InteractifSommeArithmetique.run();
        InteractifPlusGrand.run();
        InteractifPlusMoins.run();
        InteractifStockageNombre.run();
        InteractifFibonacci.run();
        Interfactif21Batons.run();
    }
}