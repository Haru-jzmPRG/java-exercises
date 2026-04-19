public class App {
    public static void main(String[] args) throws Exception {
        String sabor = System.console().readLine("Elija un sabor (manzana, fresa o chocolate): ");
        int precio = 0;
        float precioNom = 2.75f;
        float precioN = 2.5f;

        if (sabor.equals("manzana")) {
            precio = 18;
            System.out.printf( "Tarta chocolate " + sabor + ": ");
        } else if (sabor.equals("fresa")) {
            precio = 16;
            System.out.printf( "Tarta chocolate " + sabor + ": ");
        } else if (sabor.equals("chocolate")) {
            String tipoChocolate = System.console().readLine("¿Qué tipo de chocolate desea? (negro o blanco): ");
            precio = tipoChocolate.equals("negro") ? 14 : tipoChocolate.equals("blanco") ? 15 : 0;
            System.out.printf("Tarta chocolate " + tipoChocolate + ": " + precio + "\n");
        } else {
            precio = 0;
        }

        String nata = System.console().readLine("¿Quiere nata? (si o no): ");
        if (nata.equals("si")) {
            System.out.println("Con nata: " + precioN);
        }

        String nombre = System.console().readLine("¿Quiere ponerle un nombre? (si o no): ");
        if (nata.equals("si")) {
            System.out.println("Con nombre: " + precioNom);
        }

        float total = precio + precioN + precioNom;
        System.out.println("Total: " + total);
    }
}
