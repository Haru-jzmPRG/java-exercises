public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Ingrese la altura de la U: "));

        for (int i = 1; i < altura; i++) {
            System.out.print("* ");
            for (int j = 2; j < altura; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }

        System.out.print("  ");
        for (int i = 2; i < altura; i++) {
            System.out.print("* ");
        }
    }
}
