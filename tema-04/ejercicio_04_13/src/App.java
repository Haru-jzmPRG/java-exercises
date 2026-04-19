public class App {
    public static void main(String[] args) throws Exception {
        
        try {

            System.out.println("Este programa ordena tres numeros enteros introducidos por teclado");
            System.out.println("Por favor, introduzca tres numeros y pulsando INTRO despues de cada uno");

            int n1 = Integer.parseInt(System.console().readLine());
            int n2 = Integer.parseInt(System.console().readLine());
            int n3 = Integer.parseInt(System.console().readLine());

            if (n1 <= n2 && n1 <= n3) {
                // n1 es el menor
                if (n2 <= n3) {
                    System.out.println(n1 + ", " + n2 + ", " + n3);
                } else {
                    System.out.println(n1 + ", " + n3 + ", " + n2);
                }
            } else if (n2 <= n1 && n2 <= n3) {
                // n2 es el menor
                if (n1 <= n3) {
                    System.out.println(n2 + ", " + n1 + ", " + n3);
                } else {
                    System.out.println(n2 + ", " + n3 + ", " + n1);
                }
            } else {
                // n3 es el menor
                if (n1 <= n2) {
                    System.out.println(n3 + ", " + n1 + ", " + n2);
                } else {
                    System.out.println(n3 + ", " + n2 + ", " + n1);
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Por favor, introduzca un numero valido");
            return;
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
            return;
        }
    }
}
