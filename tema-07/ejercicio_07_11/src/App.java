public class App {
    public static void main(String[] args) throws Exception {
        int[] n = new int[10];
        int[] primo = new int[10];
        int[] noPrimo = new int[10];
        int i = 0;
        int j = 0;
        int primos = 0;
        int noPrimos = 0;
        boolean esPrimo = false;

        System.out.println("Introduzca 10 números seprarados por INTRO: ");

        for (i = 0; i < 10; i++) {
            n[i] = Integer.parseInt(System.console().readLine());

            esPrimo = true;
            for (j = 2; j < n[i] - 1; j++) {
                if (n[i] % j == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                primo[primos] = n[i];
                primos++;
            } else {
                noPrimo[noPrimos] = n[i];
                noPrimos++;
            }
        }
        System.out.println("Array Original: ");
        System.out.printf("| %6s |", "Indice");
        for (i = 0; i < 10; i++)
            System.out.printf(" %3d |", i);
        System.out.println();

        System.out.printf("| %6s |", "Valor");
        for (i = 0; i < 10; i++)
            System.out.printf(" %3d |", n[i]);
        System.out.println();

        System.out.println("Array con los primos al principio: ");
        System.out.printf("| %6s |", "Indice");
        for (i = 0; i < 10; i++)
            System.out.printf(" %3d |", i);
        System.out.println();

        System.out.printf("| %6s |", "Valor");
        for (i = 0; i < primos; i++)
            System.out.printf(" %3d |", primo[i]);
        for (i = 0; i < noPrimos; i++)
            System.out.printf(" %3d |", noPrimo[i]);
        System.out.println();

        
        
    }
}
