package utils;

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
    public static final String APP_SUBTITLE = "Travaux pratiques";
    public static final String APP_AUTHOR = "Atsuhiko Mochizuki";
    public static final int APP_MAJOR_VERSION = 1;
    public static final int APP_MINOR_VERSION = 0;
    public static final int APP_REVISION_VERSION = 0;
    public static final String DATE = "18/05/2023";


    public static void welcomePrompt() {
        Utils.clearConsole();
        System.out.println("\n");
        System.out.println(Utils.Colors.ANSI_BLUE + APP_ASCII_LOGO + Utils.Colors.ANSI_RESET);
        System.out.println(Utils.Colors.ANSI_GREEN + APP_TITLE.toUpperCase() + Utils.Colors.ANSI_RESET);
        System.out.println(Utils.Colors.ANSI_PURPLE + APP_SUBTITLE + Utils.Colors.ANSI_RESET);
        System.out.println(Utils.Colors.ANSI_PURPLE + "Version " + APP_MAJOR_VERSION + '.' + APP_MINOR_VERSION + '.' + APP_REVISION_VERSION + Utils.Colors.ANSI_RESET);
        System.out.println(Utils.Colors.ANSI_PURPLE + "By " + APP_AUTHOR + Utils.Colors.ANSI_RESET);
        System.out.println(Utils.Colors.ANSI_PURPLE + DATE + Utils.Colors.ANSI_RESET);
        System.out.println("========================================================================================");
    }

}
