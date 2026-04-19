public class App {
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura (número impar o mayor a 5): "));

        if (num % 2 == 0 || num < 5) {
            System.out.println("La altura introducida no es correcta.");
        }

        int fila = 1;
        int ancho = 5;
        int aux = num;

        while (aux > 0) {
            if (fila == 1 || fila == num || fila == ((num / 2) + 1)) {
                for (int i = ancho; i > 0; i--) {
                    System.out.print("M");
                }
                System.out.println();
            }else {                
                System.out.print("M");
                for (int i = 1; i <= ancho-2; i++) {
                    System.out.print(" ");
                }
                System.out.print("M");
                System.out.println();                
            }
            aux--;
            fila++;

        }
    }
}
