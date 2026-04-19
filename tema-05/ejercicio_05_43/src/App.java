public class App {
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero positivo: "));
        int posicion = Integer.parseInt(System.console().readLine("Introduzca la posición a partir de la cual quiere partir el número: "));
        int digito = 0;
        int volteado = 0;
        int aux = num;
        int longitud = 0;
        int parte1 = 0;
        int parte2 = 0;

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
        while (longitud > 0) {
            if (posicion-1 > 0){
                digito = volteado % 10;
                parte1 = (parte1 * 10) + (digito);
                posicion--;
            }else {
                digito = volteado % 10;
                parte2 = (parte2 * 10) + (digito);
            }
            volteado /= 10;
            longitud--;
        }

        System.out.printf("Los número partidos son el %d y el %d.", parte1, parte2);
    }
}
