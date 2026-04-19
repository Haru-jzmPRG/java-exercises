public class App {
    public static void main(String[] args) throws Exception {
        try {
        int n1 = 0;
        int n2 = 0;

        do {
            n1 = Integer.parseInt(System.console().readLine("Introduzca un número entero: "));
            n2 = Integer.parseInt(System.console().readLine("Introduzca otro número entero distinto al anterior: "));
            if (n1 == n2) {
                System.out.println("Los número introducidos no son válidos, deben ser distintos.");
            }
        } while (n1 == n2);

        if (n1 > n2) {
            int aux = n1;
            n1 = n2;
            n2 = aux;
        }

        for (int i = n1; i <= n2; i += 7) {
            System.out.print(i + " ");
        }

        System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. Por favor, introduzca números enteros.");
        } catch (NullPointerException e) {
            System.out.println("Error: Entrada nula. Por favor, asegúrese de introducir un valor.");
        }
    }
}
