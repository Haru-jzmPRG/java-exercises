public class App {
    public static void main(String[] args) throws Exception {
        try { 
        System.out.println("Cálculo de una potencia");

        double base = Double.parseDouble(System.console().readLine("Introduce la base: "));
        int exponente = Integer.parseInt(System.console().readLine("Introduce el exponente: "));
        
        double resultado = 1;

        if (exponente >= 0) {
            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }
        } else {
            for (int i = 0; i < -exponente; i++) {
                resultado /= base;
            }
        }
        System.out.printf("%.0f^%d es %.2f%n", base, exponente, resultado);
        } catch (NumberFormatException e) {
        System.out.println("Error: Entrada no válida. Por favor, introduce números válidos para la base y el exponente.");
        } catch (Exception e) {
        System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
