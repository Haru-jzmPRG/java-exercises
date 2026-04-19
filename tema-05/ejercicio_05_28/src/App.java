public class App {
    public static void main(String[] args) throws Exception {
        int n;
        do {
            n = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero: "));

            if (n < 0) {
                System.out.println("El número introducido no es correcto.");
            }
        }while (n < 0);

        int factorial = n;

        if (n == 0) {
            System.out.println("0! = 1");
        }else {
            for (int i = 1; i < n; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = " + factorial);   
        }
    }
}
