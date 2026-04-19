public class App {
    public static void main(String[] args) throws Exception {

        int alreves = 0;
        int digito = 0;

        int n = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero positivo: "));

        int aux = n; 
        while (aux > 0) {
            digito = (int)( aux % 10);
            alreves = alreves*10+digito;
            aux /= 10;
        }

        if (n == alreves) {
            System.out.printf("El %d es capicúa", n);
        }else {
            System.out.printf("El %d no es capicúa", n);
        }
    }
}
