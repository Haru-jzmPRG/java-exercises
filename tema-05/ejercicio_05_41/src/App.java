public class App {
    public static void main(String[] args) throws Exception {
        long n = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero positivo: "));

        long n1 = n;
        int digitos = 0;
        long pares = 0;
        long impares = 0;
        long alreves = 0;
        int longitud = 0;

        while (n1 > 0) {
            alreves = (alreves * 10) + (n1 % 10);
            n1 /= 10;
            longitud++;
        }

        for (int i = 0; i < longitud; i++) {
            
            digitos = (int)(alreves % 10);
            if ((digitos % 2) == 0) {
                pares++;
            } else {
                impares++;
            }
            alreves /= 10;
        }

        System.out.printf("El número %d contiene %d dígitos pares y %d dígitos impares", n, pares, impares);
    }
}
