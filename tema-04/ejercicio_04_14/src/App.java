public class App {
    public static void main(String[] args) throws Exception {

        try {
            int num = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero: "));

            String paridad = (num % 2 == 0) ? "par" : "impar";
            String divisible = (num % 5 == 0) ? "es" : "no es";

            System.out.println("El número introducicdo es " + paridad + " y " + divisible + " divisible entre 5.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor, introduzca un número entero válido.");
        } catch (Exception e) {
            System.out.println("Error: Ha ocurrido un error inesperado.");
        }
    }
}
