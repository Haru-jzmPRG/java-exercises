public class App {
    public static void main(String[] args) throws Exception {
        double euro;
        System.out.print("Por favor, ingrese una cantidad en euros que quiere convertir: ");
        euro = Double.parseDouble(System.console().readLine());
        System.out.printf(euro + " euros son " + (euro * 166.386) + " pesetas");
    }
}
