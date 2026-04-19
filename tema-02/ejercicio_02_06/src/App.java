public class App {
    public static void main(String[] args) throws Exception {
        double baseImponible = 22.75;

        System.out.printf("Base imponible  %.2f%n", baseImponible);
        System.out.printf("IVA              %.2f%n", baseImponible * 0.21);
        System.out.println("---------------------");
        System.out.printf("Total           %.2f%n", baseImponible * 1.21);
    }
}
