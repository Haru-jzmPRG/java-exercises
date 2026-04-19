public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de la figura: "));

        int espacios = 0;
        int aux = altura;

        for (int i = 0; i < altura; i++) {
             for (int k = 0; k < espacios; k++) {
                System.out.print(" ");
            }
            for (int j = aux; j > 0; j--) {
                System.out.print("*");
            }
           
            System.out.println();
            espacios++;
            aux--;
        }
    }
}
