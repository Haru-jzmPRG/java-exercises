public class App {
    public static void main(String[] args) throws Exception {
        long n1 = Long.parseLong(System.console().readLine("Por favor, introduzca un número: "));
        long n2 = Long.parseLong(System.console().readLine("Introduzca otro número: "));

        long pares = 0;
        long impares = 0;
        long alreves1 = 0;
        long alreves2 = 0;
        int longitud = 0;

        if (n1 == 0 || n2 == 0) {
            longitud = 1;
        }
        // voltear los números
        while (n1 > 0) {
            alreves1 = (alreves1 * 10) + (n1% 10);
            n1 /= 10;
            longitud++;
        }
        while (n2 > 0) {            
            alreves2 = (alreves2 * 10) + (n2% 10);
            n2 /= 10;
        }

        int digito = 0;

        for (int i = 0; i < longitud; i++) {
            
            digito = (int)(alreves1 % 10);
            if ((digito % 2) == 0) {
                pares = pares * 10 + digito;
            } else {
                impares = impares * 10 + digito;
            }
            
            digito = (int)(alreves2 % 10);
            if ((digito % 2) == 0) {
                pares = pares * 10 + digito;
            } else {
                impares = impares * 10 + digito;
            }

            alreves1 /=  10;
            alreves2 /= 10;
        }
        
        System.out.println("El número formado por los digitos pares es: " + pares);
        System.out.println("El número formado por los digitos impares es: " + impares);

    }
}

