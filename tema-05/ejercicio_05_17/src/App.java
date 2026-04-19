public class App {
    public static void main(String[] args) throws Exception {
        try {
        int n = 0;

        do {
            n = Integer.parseInt(System.console().readLine("Introduzca un número entero positivo: "));

            if (n < 0) {
                System.out.println("El número introducido no es válido."); 
                System.out.println("Debe ser un número entero positivo.");
            }
        }while (n < 0);
        
        int suma = 0;

        for (int i = n; i < n + 100; i++) {
            suma += i;
        }
        System.out.printf("La suma de los 100 números enteros a partir de %d es %d.%n", n, suma);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. Por favor, introduzca un número entero positivo.");
        } catch (NullPointerException e) {
            System.out.println("Error: No se ha podido leer la entrada.");
        }

    }
}
