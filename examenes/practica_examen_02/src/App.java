public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Por favor; introduzca la altura del reloj de arena:"));

        int mitad_superior = altura / 2;
        int mitad_inferior = altura / 2 + 1;
        
        // Pirámide superior (invertida y vacía)
        int i = 0;
        while (i < mitad_superior) {
            // Imprimir espacios a la izquierda
            int j = 0;
            while (j < i) {
                System.out.print(' ');
                j++;
            }
            
            if (i == 0) {
                // Primera línea completamente llena (tapa superior)
                int k = 0;
                while (k < altura) {
                    System.out.print('*');
                    k++;
                }
            } else if (i == mitad_superior - 1) {
                // Centro del reloj (un solo asterisco)
                System.out.print('*');
            } else {
                // Borde izquierdo
                System.out.print('*');
                
                // Espacios del medio
                int m = 0;
                while (m < altura - 2 * i - 2) {
                    System.out.print(' ');
                    m++;
                }
                
                // Borde derecho
                System.out.print('*');
            }
            
            System.out.println();
            i++;
        }
        
        // Pirámide inferior (normal y vacía)
        i = 0;
        while (i < mitad_inferior) {
            // Espacios a la izquierda
            int j = 0;
            while (j < mitad_superior - 1 - i) {
                System.out.print(' ');
                j++;
            }
            
            if (i == 0) {
                // Primera línea del inferior (un solo asterisco, centro)
                System.out.print('*');
            } else if (i == mitad_inferior - 1) {
                // Última línea completamente llena (tapa inferior)
                int k = 0;
                while (k < altura) {
                    System.out.print('*');
                    k++;
                }
            } else {
                // Borde izquierdo
                System.out.print('*');
                
                // Espacios del medio
                int m = 0;
                while (m < 2 * i + 1) {
                    System.out.print(' ');
                    m++;
                }
                
                // Borde derecho
                System.out.print('*');
            }
            
            System.out.println();
            i++;
        }
    }
}
