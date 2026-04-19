public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de la piramide maya: "));
        
        for (int i = 2; i <= altura+1; i++) {
            for (int j = 1; j <= (altura + 1) - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ( i - 1); j++) {
                System.out.print("*");
            }
            if (i % 2 == 0) {
                System.out.print("****");
            }else {
                System.out.print("    ");
            }
            for (int k = 1; k <= ( i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}
