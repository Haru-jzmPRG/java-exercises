public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura del árbol: "));

        int contador = 0;
        int aux = altura;
        for (int i = 0; i < altura; i++) {            
            if (i == 0) {
                for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
                System.out.println("*");
            } else if (i == 1 || i < altura - 2) {
                for (int j = 0; j < altura - contador; j++) {
                System.out.print(" ");
                }
                System.out.print("^");
                for (int k = 0; k < (2 * contador + 1) - 2; k++) {
                    System.out.print(" ");
                }
                System.out.println((contador > 0)? "^": "");
                contador++;
            }else if (i == altura - 2) {
                for (int j = 0; j < altura - contador; j++) {
                System.out.print(" ");
                }
                for (int k = 0; k < (2 * contador + 1); k++) {
                    System.out.print("^");
                }
                System.out.println();
            }else {
                for (int j = 0; j < aux; j++) {
                    System.out.print(" ");
                }
                System.out.print("Y");
            }
        }
    }
}
