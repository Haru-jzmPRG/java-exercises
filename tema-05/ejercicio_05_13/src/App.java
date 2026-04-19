public class App {
    public static void main(String[] args) throws Exception {
        try {
        int positivo = 0;
        int negativo = 0;

        System.out.println("Por favor, introduzca 10 números enteros (pulse INTRO entre cada número): ");

        for (int i = 0; i < 10; i++) {
            int numero = Integer.parseInt(System.console().readLine());

            if (numero >= 0) {
                positivo++;
            } else {
                negativo++;
            }
        }
        System.out.println("Ha introducido " + positivo + " números positivos y " + negativo + " números negativos.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor, introduzca solo números enteros.");
        }catch (NullPointerException e) {
            System.out.println("Error: Entrada nula detectada.");
        }
    }    
}
