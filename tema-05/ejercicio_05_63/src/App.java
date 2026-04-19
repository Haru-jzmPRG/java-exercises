public class App {
    public static void main(String[] args) throws Exception {
        int altura1 = Integer.parseInt(System.console().readLine("Introduzca la altura de la primera pirámide: "));
        int altura2 = Integer.parseInt(System.console().readLine("Introduzca la altura de la segunda pirámide: "));

        int central = 0;
        int saltos = 0;
        int aux1 = altura1;
        int aux2 = altura2;
        int fila = 1;
        int fila2 = 1;

        if (altura1 >= altura2) {
            central = altura1;
            saltos = altura1 - altura2;
            while (aux1 > 0) {
                for (int i = 1; i <= (altura1-fila); i++)
                    System.out.print(" ");
                for (int i = 0; i < (2*fila-1);i++)
                    System.out.print("*");
                for (int i = 0; i < (2 * (central - fila) + 1);i++)
                    System.out.print(" ");
                if (saltos > 0) {
                    System.out.println();
                }else {
                    for (int i = 0; i < (2*fila2-1);i++)
                    System.out.print("*");
                    fila2++;
                    System.out.println();
                }
                aux1--;
                saltos--;
                fila++;    
            }
        }else {
            central = altura2;
            saltos = altura2 - altura1;
            int delante = 0;
            while (aux2 > 0) {                
                if (saltos > 0) {
                     for (int i = 0; i <= delante; i++)
                        System.out.print(" ");
                    for (int i = 0; i < (2 * (central - fila) + 1); i++)
                        System.out.print(" ");
                    for (int i = 0; i < (2 * fila - 1); i++)
                        System.out.print("*");
                    System.out.println();
                    delante++;
                }else {
                    fila2 = fila - (altura2 - altura1);
                    for (int i = 1; i <= (altura1 - fila2); i++)
                        System.out.print(" ");
                    for (int i = 0; i < (2 * fila2 - 1); i++)
                        System.out.print("*");
                    for (int i = 0; i <= (2 * (central - fila) + 1); i++)
                        System.out.print(" ");
                    for (int i = 0; i < (2*fila-1);i++)
                    System.out.print("*");
                    System.out.println();
                }
                aux2--;
                saltos--;
                fila++;    
            }
        }

        
    }
}
