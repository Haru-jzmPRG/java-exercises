public class App {
    public static void main(String[] args) throws Exception {
        int altura = 0;
        int espacios = 0;

        do {
            altura = Integer.parseInt(System.console().readLine("Introduzca la altura de la V (un número mayor o igual a 3): "));
            if (altura < 3) {
                System.out.println("Error: La altura debe ser un número mayor o igual a 3.");
            }
        }while (altura < 3);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j > 0; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < (altura - i - 1)*2; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
            espacios++;
        }
    }
}
