public class App {
    public static void main(String[] args) throws Exception {
        double n1;
        double n2;
        
        System.out.print("Por favor, introduce el primer número: ");
        n1 = Double.parseDouble(System.console().readLine());
        System.out.print("Introduce el segundo número: ");
        n2 = Double.parseDouble(System.console().readLine());

        System.out.printf("x = " + n1 + "\n" + "y = " + n2 + "\n");
        System.out.printf("x + y = " + (n1 + n2) + "\n" + "x - y = " + (n1 - n2) + "\n" + "x / y = " + (n1 / n2) + "\n" + "x * y = " + (n1 * n2) );
    }
}
