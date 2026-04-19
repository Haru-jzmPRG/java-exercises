public class App {
    public static void main(String[] args) throws Exception {
        try {
        int num = Integer.parseInt(System.console().readLine("Introduzca un número y le diré si es primo:  "));
        boolean esPrimo = true;

        for (int i = 2; i < num; i++){
            if ((num % i) == 0) 
                esPrimo = false;
        }
        
        if (esPrimo) {
            System.out.println("El número " + num + " es primo.");
        } else {
            System.out.println("El número " + num + " no es primo.");
        }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, introduzca un número válido.");
        } catch (NullPointerException e) {
            System.out.println("No se ha introducido ningún valor.");
        }

    }
}
