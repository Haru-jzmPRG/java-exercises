public class App {
    public static void main(String[] args) throws Exception {
        long n = Long.parseLong(System.console().readLine("Por favor; introduzca un número entero positivo: "));
        System.out.print("Dígitos pares: ");

        long num = n;
        long alreves = 0;
        int longitud = 0;
        int digito = 0;
        int sumaPares = 0;

        if (num == 0) {
            longitud = 1;
        }

        while (num > 0) {
            alreves = (alreves * 10) + (num % 10);
            num /= 10;
            longitud++;
        }

        

        for (int i = 0; i < longitud; i++) {
            digito = (int)(alreves % 10);
            if ((digito % 2) == 0) {
            System.out.print(digito + " ");
            sumaPares += digito;
        }
        alreves /= 10;
        }

        

        System.out.println("\nSuma de los dígitos pares: " + sumaPares);
    }
}
