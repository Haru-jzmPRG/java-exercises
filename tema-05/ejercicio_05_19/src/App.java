public class App {
    public static void main(String[] args) throws Exception {
        try {
        int altura = Integer.parseInt(System.console().readLine("Por favor Introduzca la altura de la pirámide: "));
        String caracter = System.console().readLine("Introduzca el carácter de relleno: : ");

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
        } catch (NumberFormatException e) {
            System.out.println("Error: La altura debe ser un número entero.");
        } catch (NullPointerException e) {
            System.out.println("Error: Entrada no válida.");
        }
    }
}
