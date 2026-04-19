public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Ingrese la altura de la L: "));

        for (int i = 1; i < altura; i++) {
            System.out.println("*");
        }

        for (int i = 0; i < altura / 2 + 1; i++) {
            System.out.print("* ");
        }
    }
}
