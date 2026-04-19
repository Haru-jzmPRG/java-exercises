public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduzca la nota del primer control: ");
        float nota1 = Float.parseFloat(System.console().readLine());
        System.out.print("Introduzca la nota del segundo control: ");
        float nota2 = Float.parseFloat(System.console().readLine());

        float media = (nota1 + nota2) / 2;
        System.out.println("La nota media es: " + media);

        if (media < 5) {
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String recuperacion = System.console().readLine();
            if (recuperacion.equals("apto"))
                System.out.println("Tu nota de Programación es 5"); 
            else
                System.out.println("Tu nota de Programación es " + media); }
        else 
            System.out.println("Tu nota de Programación es " + media);

    }
}
