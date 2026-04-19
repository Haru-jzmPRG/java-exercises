public class App {
    public static void main(String[] args) throws Exception {
        String[] coloresConocidos = {"verde", "rojo", "azul", "gris", "naranja", "rosa", "negro", "blanco", "morado"};
        String[] palabras = new String[8];
        String[] esColor = new String[8];
        String[] noColor = new String[8];
        
        int colores = 0;
        int noColores = 0;

        System.out.println("Introduzca 8 palabras: ");
        for (int i = 0; i < 8; i++) {
            palabras[i] = System.console().readLine();
        }

        System.out.println("Array original: ");
        for (int i = 0; i < 8; i++) System.out.printf("%9d |", i);
        System.out.println();
        for (int i = 0; i < 8; i++) System.out.printf("%9s |", palabras[i]);
        System.out.println();

        System.out.println("Array resultado: ");

        // Proceso: separar colores y no colores
        for (int i = 0; i < 8; i++) {
            boolean esUnColor = false;

            // Buscar si palabras[i] está en coloresConocidos
            for (int j = 0; j < 9; j++) {
                if (palabras[i].equalsIgnoreCase(coloresConocidos[j])) {
                    esUnColor = true;
                }
            }

            if (esUnColor) {
                esColor[colores++] = palabras[i];
            } else {
                noColor[noColores++] = palabras[i];
            }
        }

        // Imprimir índices
        for (int i = 0; i < 8; i++) System.out.printf("%9d |", i);
        System.out.println();

        // Imprimir primero colores
        for (int i = 0; i < colores; i++) System.out.printf("%9s |", esColor[i]);

        // Luego no colores
        for (int i = 0; i < noColores; i++) System.out.printf("%9s |", noColor[i]);
    }
}
