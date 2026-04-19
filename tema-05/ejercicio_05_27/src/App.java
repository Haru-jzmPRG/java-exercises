public class App {
    public static void main(String[] args) throws Exception {
        
        int n = Integer.parseInt(System.console().readLine("Introduzca un número mayor que 1: "));

        int cuenta = 0;
        int suma = 0;

        for (int i = 1; i < n; i++) {
            if ((i % 3) == 0) {
                System.out.print(i + " ");
                cuenta++;
                suma += i;
            }
            
        }
        
        System.out.println("Desde 1 hasta " + n + " hay " + cuenta + " multiplos de 3 y suman" + suma + ".");
    }
}
