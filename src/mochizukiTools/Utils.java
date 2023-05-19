package mochizukiTools;

public class Utils {

    public static class Colors {
        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_BLACK = "\u001B[30m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_BLUE = "\u001B[34m";
        public static final String ANSI_PURPLE = "\u001B[35m";
        public static final String ANSI_CYAN = "\u001B[36m";
        public static final String ANSI_WHITE = "\u001B[37m";
    }


    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            System.out.println("ca merde");
        }
    }

    public static void msgRequest(String i_str) {
        System.out.printf("[%srequest%s]%s\n", Colors.ANSI_PURPLE, Colors.ANSI_RESET, i_str);
    }

    public static void msgWarning(String i_str) {
        System.out.printf("[%swarning%s]%s\n", Colors.ANSI_YELLOW, Colors.ANSI_RESET, i_str);
    }

    public static void msgSuccess(String i_str) {
        System.out.printf("[%ssuccess%s]%s\n", Colors.ANSI_GREEN, Colors.ANSI_RESET, i_str);
    }


}
