public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca un número positivo (de 5 cifras como máximo)");
        int num = Integer.parseInt(System.console().readLine());
        int primera = 0;

        if (num < 10) {
            primera = num;}
        else if (num < 100) {
            primera = num / 10; }
        else if (num < 1000) {
            primera = num / 100; }
        else if (num < 10000) {
            primera = num / 1000; }
        else if (num < 100000) {
            primera = num / 10000; }
        
        System.out.print("La primera cifra del numero introducido es: " + primera);
    }
}
