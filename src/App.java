public class App {
    public static void main(String[] args) throws Exception {
        tulostaKuumerajat();
    }

    public static void tulostaKuumerajat() {
        System.out.println("Ihminen 37");
        System.out.println("Koira 39");
        System.out.println("Hevonen 38");
    }

    public static boolean onkoKuumetta(String kohde, int lampo) {
        switch (kohde.toLowerCase()) {
            case "ihminen":
                return lampo >= 38;
            case "koira":
                return lampo >= 39;
            case "hevonen":
                return lampo >= 38;

            default:
                return false;
        }
    }
}
