public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Por  favor, vaya introduciendo números enteros.");
        System.out.println("Puede terminar mediante la introducción de un número negativo.");

        int n = 0;
        int contador = 0;
        int contadorImpares = 0; 
        int impares = 0;       
        int media = 0;
        int maxPar = 0;

        do {
            n = Integer.parseInt(System.console().readLine());

            if (n >= 0) {
                contador++;
                if ((n % 2) == 1) {
                    impares += n;
                    contadorImpares++;
                } else {
                    if (n > maxPar) {
                        maxPar = n;
                    }
                }
            }            
        }while (n >= 0);

        media = impares / contadorImpares;

        System.out.println("Ha introducido " + contador + " números.");
        System.out.println("La media de los impares es " + media + ".");
        System.out.println("El máximo pares es " + maxPar + ".");

    }
}

