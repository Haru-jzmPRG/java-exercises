public class App {
    public static void main(String[] args) throws Exception {
        int ancho = Integer.parseInt(System.console().readLine("Por favor, introduzca la anchura del rectángulo (como mínimo 2): "));
        int alto = Integer.parseInt(System.console().readLine("Ahora introduzca la altura (como mínimo 2): "));
        System.out.println();

        if ((ancho < 2) || (alto < 2)) {
            System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.");
        }
        
        int aux = ancho;
        int aux2 = alto;
        int espacios = aux-2;

        while (aux2 > 0) {

            if (aux2 == alto || aux2 == 1) {
                for (int i = aux; i > 0; i--){
                    System.out.print("* ");
                }
            }else {
                System.out.print("*");
                for (int i = espacios; i > 0; i--){
                    System.out.print("  ");
                }
                System.out.print(" *");               
            }
            System.out.println();
            aux2--;
        }
    }
}
