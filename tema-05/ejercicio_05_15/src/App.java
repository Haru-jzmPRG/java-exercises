public class App {
    public static void main(String[] args) throws Exception {
        try {
        int base = Integer.parseInt(System.console().readLine("Introduzca la base: "));
        double exponente = Integer.parseInt(System.console().readLine("Introduzca el exponente máximo: "));
        double potencia = 1;

        if (exponente >= 0)
            for (int i = 1; i <= exponente; i++) {
                potencia = potencia * base;
                System.out.printf("%d^%d = %.0f\n", base, i , potencia);
            }
        else {
            for (int i = 0; i <= -exponente; i++) {
                potencia /= base;
                System.out.printf("%d^-%d = %f\n", base, i , potencia);
            }
        }
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. Por favor, introduzca números enteros.");
        } catch (NullPointerException e) {
            System.out.println("Error: No se ha proporcionado ninguna entrada.");
        }        
    }
}
