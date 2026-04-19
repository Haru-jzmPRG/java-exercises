public class App {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(System.console().readLine("Introduzca un número entero: "));
        int digito = Integer.parseInt(System.console().readLine("Introduzca un dígito: "));

        int numero = n;

        numero = numero * 10 +1;

        int alreves = 0;
        int posicion = 1;

        System.out.println("Contando de izquierda a derecha, el " + digito + " aparece dentro de " + n + " en las siguientes posiciones: ");
        

        while (numero > 0) {
            alreves = (alreves * 10) + (numero % 10);
            numero /=10;
        }

        while (alreves != 1) {
            if ((alreves % 10) == digito) {
                System.out.print(posicion + " ");
        }
        
            alreves /= 10;
            posicion++;
        }
        System.out.println();
        
        
    }
}
