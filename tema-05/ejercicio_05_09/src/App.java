public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa cuenta los dígitos de un número.");

        int numIntro = Integer.parseInt(System.console().readLine("Introduzca un número entero: "));

        int n = numIntro;
        int contador = 1;

        while (n > 10) {
        contador ++;
        n /= 10;
        }

        System.out.println(numIntro + " tiene " + contador + " dígito/s");
    }
}
