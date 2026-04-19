public class App {
    public static void main(String[] args) throws Exception {
        // int[] numeros = new int[12];

        // System.out.println("Vaya introduciendo números enteros pulsando INTRO");
        // for (int i = 0; i < 12; i++) {
        //     numeros[i] = Integer.parseInt(System.console().readLine());
        // }

        // for (int i = 0; i < 12; i++) {
        //     numeros[i] = i+1;
        //     if (numeros[i] == 11) { 
        //         numeros[i] = 0;
        //     }
        // }

        // for (int i = 0; i < 12; i++) {
        //     System.out.printf("|%3d|", i);
        // }
        // System.out.println();

        // for (int i = 0; i < 12; i++) {
        //     System.out.printf("|%3d|", numeros[i]);
        // }

        //Corrección
        final int N = 12;          // Tamaño del array
        int[] numero = new int[N]; // Array donde guardaremos los 12 números
        int i;                     // Variable índice para los bucles

        System.out.println("Vaya introduciendo números enteros y pulsando INTRO");

        // -----------------------------
        // LECTURA DE LOS 12 NÚMEROS
        // -----------------------------
        for (i = 0; i < N; i++) {
            numero[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.println();

        // -----------------------------
        // IMPRIMIR ARRAY ORIGINAL
        // -----------------------------
        System.out.println("Array original");

        // Imprime los índices del array
        for (i = 0; i < N; i++) {
            System.out.printf("|%3d ", i);
        }
        System.out.println("|");

        // Línea separadora
        for (i = 0; i < N * 5; i++) {
            System.out.print("-");
        }
        System.out.println("-");

        // Imprime los valores guardados en el array
        for (i = 0; i < N; i++) {
            System.out.printf("|%3d ", numero[i]);
        }
        System.out.println("|");


        // -----------------------------
        // ROTACIÓN A LA DERECHA DEL ARRAY
        // -----------------------------

        // Guardamos el último valor para no perderlo
        int aux = numero[N - 1];

        // Desplazamos todos los elementos hacia la derecha
        // Empezando desde el final para no sobrescribir datos
        for (i = N - 1; i > 0; i--) {
            numero[i] = numero[i - 1]; // El actual toma el valor del anterior
        }

        // Colocamos el último valor (guardado en aux) en la posición 0
        numero[0] = aux;


        // -----------------------------
        // IMPRIMIR ARRAY ROTADO
        // -----------------------------
        System.out.println("Array rotado a la derecha");

        // Imprime los índices
        for (i = 0; i < N; i++) {
            System.out.printf("|%3d ", i);
        }
        System.out.println("|");

        // Línea separadora
        for (i = 0; i < N * 5; i++) {
            System.out.print("-");
        }
        System.out.println("-");

        // Imprime los valores ya rotados
        for (i = 0; i < N; i++) {
            System.out.printf("|%3d ", numero[i]);
        }
        System.out.println("|");
    }
}
