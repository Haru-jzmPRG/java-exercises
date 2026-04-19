public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo: ");

        int numero;
        int contadorNoPrimos = 0;
        int sumaNoPrimos = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean esPrimo;

        do {
            numero = Integer.parseInt(System.console().readLine());
            esPrimo = true; 

            if (numero <= 1) {
                esPrimo = false; 
            } else {
                for (int i = 2; i <= numero / 2; i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (!esPrimo) {
                contadorNoPrimos++;
                sumaNoPrimos += numero;

                if (numero > max) max = numero;
                if (numero < min) min = numero;
            }

        } while (!esPrimo); 

        float media = (contadorNoPrimos > 0) ? (float) sumaNoPrimos / contadorNoPrimos : 0;

        System.out.printf("Ha introducido %d números no primos.%n", contadorNoPrimos);
        if (contadorNoPrimos > 0) {
            System.out.printf("Máximo: %d%n", max);
            System.out.printf("Mínimo: %d%n", min);
            System.out.printf("Media: %.2f%n", media);
        }
    }
}
