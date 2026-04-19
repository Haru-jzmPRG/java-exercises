public class App {
    public static void main(String[] args) throws Exception {
        long num = Long.parseLong(System.console().readLine("Introduzca un número: "));

        double digito = 0;
        double suma = 0;
        double contador = 0;

        while (num > 0) {
            digito = (num % 10);
            suma += digito;
            contador++;
            num /= 10;
        }

        double media = suma / contador;

        System.out.printf("La media de sus digitos es %.2f", media);
    }
}
