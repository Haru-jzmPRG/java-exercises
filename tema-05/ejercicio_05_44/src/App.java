public class App {
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero positivo: "));
        int posicion = Integer.parseInt(System.console().readLine("Introduzca la posición donde quiere insertar: "));
        int insertado = Integer.parseInt(System.console().readLine("Introduzca el dígito que quiere insertar: "));
        int digito = 0;
        int volteado = 0;
        int aux = num;
        int longitud = 0;
        int parte1 = 0;

        while (aux > 0) {
            digito = aux % 10;
            volteado = (volteado * 10) + (digito);
            aux /= 10;
            longitud++;
        }
        
        if ((longitud < 2) || ((posicion > longitud) && (posicion < longitud))) {
            System.out.println("Por favor, introduzca un número con más de 2 dígitos y que la posición no supere el número de digitos del número.");
        }
        digito = 0;
        while (posicion-1 > 0) {
            
            digito = volteado % 10;
            parte1 = (parte1 * 10) + (digito);

            posicion--;
            volteado /= 10;
            longitud--;  
        }
        int r = (parte1 * 10) + (insertado);

        digito = 0;
        posicion = 0;
        while (posicion == 0 && longitud > 0){
                digito = volteado % 10;
                r = (r * 10) + (digito);
                longitud--;
                volteado /= 10;
        }        
            
        System.out.printf("Los número resultante es %d.", r);
    }
}