public class App {
    public static void main(String[] args) throws Exception {
        int n1;
        int n2;
        System.out.println("Este progrma multiplica dos números enteros.");
        System.out.print("Por favor, introduzca el prier número: ");
        n1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el segundo número: ");
        n2 = Integer.parseInt(System.console().readLine());
        System.out.printf( n1 + " * " + n2 + " = " + (n1*n2));
    }
}
