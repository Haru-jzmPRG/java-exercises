public class App {
    public static void main(String[] args) throws Exception {
        double nIntroducido = 0;
        double contador = 0;
        double suma = 0;

        System.out.println("Este programa calcla la media de los números positivos introducidos.");
        System.out.println("Para parar, introduzca un número negativo.");
        System.out.println("Vaya introduciendo números: ");

        do {
            nIntroducido = Double.parseDouble(System.console().readLine());
            contador++;
            suma += nIntroducido;

        } while (nIntroducido >= 0);

        double media = (suma - nIntroducido) / (contador - 1);

        System.out.println("La media de los números positivos introducidos es: " + media);
    }
}
