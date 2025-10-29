import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Valitse kohde. Kirjoita ihminen, koira tai hevonen.");
        String kohde = scan.nextLine();
        System.out.println("Anna lampotila.");
        int lampo = Integer.parseInt(scan.nextLine());

        tulostaKuumerajat();
        onkoKuumetta(kohde, lampo);

    }

    public static void tulostaKuumerajat() {
        System.out.println("Ihminen 37");
        System.out.println("Koira 39");
        System.out.println("Hevonen 38");
    }

    public static boolean onkoKuumetta(String kohde, int lampo) {
        switch (kohde.toLowerCase()) {

            case "ihminen":
                if (lampo >= 38) {
                    System.out.println("Kohteella on kuumetta.");
                } else {
                    System.out.println("Kohteella ei ole kuumetta.");
                }
                return lampo >= 38;

            case "koira":
                if (lampo >= 39) {
                    System.out.println("Kohteella on kuumetta.");
                } else {
                    System.out.println("Kohteella ei ole kuumetta.");
                }
                return lampo >= 39;

            case "hevonen":
                if (lampo >= 38) {
                    System.out.println("Kohteella on kuumetta.");
                } else {
                    System.out.println("Kohteella ei ole kuumetta.");
                }
                return lampo >= 38;

            default:
                return false;
        }
    }
}
