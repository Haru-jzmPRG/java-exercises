public class App {
    public static void main(String[] args) throws Exception {
        try {
        int penultimo = 0;
        int ultimo = 1;
        
        System.out.println("Este programa muestra los n primeros números de la serie Fibonacci.");
        int n = Integer.parseInt(System.console().readLine("Por favor, introduzca n: "));

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(penultimo + " ");
            } else if (i == 1) {
                System.out.print(ultimo + " ");
            } else {
                int siguiente = penultimo + ultimo;
                System.out.print(siguiente + " ");
                penultimo = ultimo;
                ultimo = siguiente;
            }
        }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, introduce un número válido.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
