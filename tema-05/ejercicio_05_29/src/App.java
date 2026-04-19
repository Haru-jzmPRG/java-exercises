public class App {
    public static void main(String[] args) throws Exception {
        
        int n1 = Integer.parseInt(System.console().readLine("Introduzca un número positivo (relativamente grande): "));
        int n2 = Integer.parseInt(System.console().readLine("Introduzca otro número (relativamente pequeño): "));

        System.out.println("Los números positivos menores que " + n1 + " que no son divisibles entre " + n2 + " son los siguientes: ");

        for (int i = 1; i < n1; i++) {
            if (i % n2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
