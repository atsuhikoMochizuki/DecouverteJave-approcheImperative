package mochizukiTools;

public class Params {
    /*Informations App*/
    public static final String APP_ASCII_LOGO = """
             _____    __                                _              _    __      __    \s
            |  __ \\  /_/                               | |            | |  /\\ \\    / /\\   \s
            | |  | | ___  ___ ___  _   ___   _____ _ __| |_ ___       | | /  \\ \\  / /  \\  \s
            | |  | |/ _ \\/ __/ _ \\| | | \\ \\ / / _ | '__| __/ _ \\  _   | |/ /\\ \\ \\/ / /\\ \\ \s
            | |__| |  __| (_| (_) | |_| |\\ V |  __| |  | ||  __/ | |__| / ____ \\  / ____ \\\s
            |_____/ \\___|\\___\\___/ \\__,_| \\_/ \\___|_|   \\__\\___|  \\____/_/    \\_\\/_/    \\_\\""";
    public static final String APP_TITLE = "Approche Impérative";
    public static final String APP_DESCRIPTION = """
            Découverte du langage Java sous l'angle de la programmation impérative,
            au travers 4 séances de Travaux Pratiques:
                1 : Installation du JDK 11 et exécution d'un premier programme
                2 : Installation de l'IDE IntelliJ et première application
                3 : Tableaux, boucles et conditions niveau 1
                4 : Tableaux, boucles et conditions niveau 2
            """;
    public static final String APP_AUTHOR = "Atsuhiko Mochizuki";
    public static final int APP_MAJOR_VERSION = 1;
    public static final int APP_MINOR_VERSION = 0;
    public static final int APP_REVISION_VERSION = 0;
    public static final String DATE = "18/05/2023";
    public static final String APP_REPO = "https://github.com/atsuhikoMochizuki/DecouverteJava_approcheImperative.git";


    public static void welcomePrompt() {
        Utils.clearConsole();
        System.out.println(Utils.Colors.ANSI_BLUE + APP_ASCII_LOGO + Utils.Colors.ANSI_RESET);
        System.out.println(Utils.Colors.ANSI_GREEN + APP_TITLE.toUpperCase() + " v" + APP_MAJOR_VERSION + "." + APP_MINOR_VERSION + "." + APP_REVISION_VERSION + Utils.Colors.ANSI_RESET);
        System.out.println(Utils.Colors.ANSI_PURPLE + "By " + APP_AUTHOR + " - " + DATE + Utils.Colors.ANSI_RESET);
        System.out.println(Utils.Colors.ANSI_BLUE + "Repository : " + APP_REPO + Utils.Colors.ANSI_RESET);
        System.out.println("\n" + APP_DESCRIPTION);
        System.out.println("========================================================================================");
    }
}
