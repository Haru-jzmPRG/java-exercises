public class App {
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(System.console().readLine("Introduzca un número entero: "));

        int n = num;
        int alreves = 0;

        while (n > 0) {
            alreves = (alreves*10) + (n % 10);
            n /= 10;
        }

        System.out.println("Si le damos la vuelta a "+ num + " tenemos el " + alreves);
    }
}
