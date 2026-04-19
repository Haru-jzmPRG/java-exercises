public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Ingrese la altura de la figura: "));


        for (int i = altura; i > 0; i--) {
            for (int j = 0; j < (i -1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
