public class Lab01_BlankReciept {
    public static void main(String[] args) {
        header();
        body();
        footer();
    }

    public static void header() {
        System.out.println("CASH RECEIPT");
        System.out.println(repeatString("-", 30));
    }

    public static void body() {
        System.out.println("Charged to" + repeatString("_", 20));
        System.out.println("Received by" + repeatString("_", 19));
    }

    public static void footer() {
        System.out.println(repeatString("-", 30));
        System.out.println("© SoftUni");
    }

    public static String repeatString(String toRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + toRepeat;
        }
        return text;
    }
}
