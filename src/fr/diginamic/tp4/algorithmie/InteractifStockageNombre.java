package fr.diginamic.tp4.algorithmie;

import mochizukiTools.ArrayHelper;
import mochizukiTools.Utils;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class InteractifStockageNombre {
    public static void run() {
        Utils.msgTitle("EXERCICE 17 : INTERACTIF STOCKAGE NOMBRE");
        Utils.msgInfo("""
                CONSIGNE :Faire un programme avec le menu suivant :
                            -1 : Ajouter un nombre
                            -2 : Afficher les nombres existants
                    Description:
                        Demander à l’utilisateur de choisir une option dans le menu puis :
                            -Si l’utilisateur sélectionne l’option 1, le programme demande un nombre à l’utilisateur puis
                                l’ajoute à un tableau.
                            -Si l’utilisateur sélectionne l’option 2, le programme affiche le contenu du tableau.
                            -Si le tableau est plein, écrire un algorithme pour agrandir le tableau""");
        storageNumbers();
    }

    public static void storageNumbers() {
        boolean exitRequest = false;
        int[] array = new int[0];
        String menu = """
                ______                             _   _                 _              \s
                    / ____| |                           | \\ | |               | |             \s
                   | (___ | |_ ___  _ __ __ _  __ _  ___|  \\| |_   _ _ __ ___ | |__   ___ _ __\s
                    \\___ \\| __/ _ \\| '__/ _` |/ _` |/ _ \\ . ` | | | | '_ ` _ \\| '_ \\ / _ \\ '__|
                    ____) | || (_) | | | (_| | (_| |  __/ |\\  | |_| | | | | | | |_) |  __/ |  \s
                   |_____/ \\__\\___/|_|  \\__,_|\\__, |\\___|_| \\_|\\__,_|_| |_| |_|_.__/ \\___|_|  \s
                                               __/ |      Stockez vos nombres en toute sécurité                                          \s
                                              |___/                                           \s
                    1 - Ajouter un nombre
                    2 - Afficher les nombres existants
                    q - Quitter""";
        Utils.msgInfo(menu);
        while (true) {
            Utils.msgPrompt("Entrez un choix (1:AjoutNbre / 2: AfficherTableau / q: quit) :");
            int userMenuChoice = inputStdin_int_optionQuit();
            switch (userMenuChoice) {
                case -1:
                    exitRequest = true;
                    break;
                case 1:
                    Utils.msgPrompt("Entrez la nouvelle valeur à insérer dans le tableau:");
                    int userIntInput = inputStdin_int_optionQuit();
                    array = ArrayHelper.pushInt(array, userIntInput);
                    break;
                case 2:
                    String str = "Valeur du tableau : " + Arrays.toString(array);
                    Utils.msgInfo(str);
                    break;
                default:
                    Utils.beep();
            }
            if (exitRequest)
                break;
        }
    }

    static public int inputStdin_int_optionQuit() {
        String userInput = null;
        int returnValue = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            boolean badInput = false;
            try {
                userInput = scanner.nextLine();
                if (userInput.equals("q")) {
                    Utils.msgInfo("Sortie du programme");
                    return -1;
                } else
                    returnValue = Integer.parseInt(userInput);
            } catch (InputMismatchException exception) {
                Utils.msgWarning("L'entrée n'est pas un nombre");
                java.awt.Toolkit.getDefaultToolkit().beep();
                badInput = true;
            }
            if (!badInput)
                break;
        }
        return returnValue;
    }
}
