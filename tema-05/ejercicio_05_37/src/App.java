public class App {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(System.console().readLine("Por favor introduzca un número entero positivo: "));

        int alreves = 0;
        int digito = 0;
        int aux = n;
        int contador = 0;

        System.out.printf("El %d en decimal es el ", n);

        while (aux > 0) {
            digito = (int)(aux%10);
            alreves = alreves*10+digito;
            aux /= 10;
            contador++;
        }

        while (alreves > 0) {
            digito = (int)(alreves%10);
            
            if (digito > 0) {
                for (int i = digito; i > 0; i--) {
                    System.out.print("| ");
                }
            }
            if (digito == 0) {
                System.out.print("- ");
            }            
            
            System.out.print("- ");

            alreves /= 10;
        }

        System.out.print("en el sistema de palotes");

    }
}
