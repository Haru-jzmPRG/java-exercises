public class App {
    public static void main(String[] args) throws Exception {
        try {
        int altura = Integer.parseInt(System.console().readLine("Por favor Introduzca la altura de la pirámide: "));
        String caracter = System.console().readLine("Introduzca el carácter de relleno: : ");
        
        int alt = 1;
        int i = 0;
        int esapcios = altura - 1;
        int interno = 0;

        while (alt < altura ){

            for (i = 1; i <= esapcios; i++){
                System.out.print(" ");
            }

            System.out.print(caracter);
            for (i = 1; i < interno; i++){
                System.out.print(" ");
            }

            if (alt > 1){
                System.out.print(caracter);
            }
            System.out.println();
            alt++;
            esapcios--;
            interno += 2;
        }
        
        for (i = 1; i <alt*2; i++){
            System.out.print(caracter);
        }
        
        
        } catch (NumberFormatException e) {
            System.out.println("Error: La altura debe ser un número entero.");
        } catch (NullPointerException e) {
            System.out.println("Error: Entrada no válida.");
        }
    }
}
