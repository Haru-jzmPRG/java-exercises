public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor introduzca un números. El programa terminará cuando la suma de los números sea mayor que 10000.");

        int i = 0;
        int suma = 0;
        int contador = 0;

        do {
            i = Integer.parseInt(System.console().readLine());
            suma += i;
            contador++;
        } while (suma <= 10000);

        System.out.println("Ha introducido un total de " + contador + " números.");
        System.out.println("La suma de los números introducidos es " + suma + ".");
        System.out.println("La media es " + ((double)suma / contador));
        
        
    }
}
