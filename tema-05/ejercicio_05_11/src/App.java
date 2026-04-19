public class App {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(System.console().readLine("Introduzca un número: "));
        int contador = 0;

        System.out.printf("%4d%3s%8s%5s%7s",n,"|",n+"^2","|",n+"^3" + "\n");
        System.out.println("----------------------------");

        while (contador < 5) {
            System.out.printf("%4d%3s%8d%5s%7d\n", n, "|", n * n, "|", n * n * n);
            n++;
            contador++;
        }
    }
}
