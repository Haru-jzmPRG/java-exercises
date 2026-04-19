public class App {
    public static void main(String[] args) throws Exception {
        
        int n2 = 0;
        int n = 1;
        do {
            n2 = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero: "));

            if (n2 < 0) {
                System.out.println("El número introducido no es correcto.");
            }
        }while (n2 < 0);

        int factorial = n;

        if (n == 0) {
            System.out.println("0! = 1");
        
        }
        do {
            for (int i = 1; i <= n2; i++) {                
                factorial *= i;
                System.out.println(n + "! = " + factorial);
                n++;
            }
            
        }while (factorial <= n2);
    
    }
}
