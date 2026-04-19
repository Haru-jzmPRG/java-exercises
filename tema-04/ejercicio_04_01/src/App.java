public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Por favor, introduzca un día de la semana y le diré qué asigantura toda a primera hora ese día: ");
        String dia = System.console().readLine();
        switch (dia.toLowerCase()) {
            case "lunes" -> System.out.println("Sistemas Informáticos");
            case "martes" -> System.out.println("Programación");
            case "miercoles", "miércoles" -> System.out.println("Sistemas Informáticos");
            case "jueves" -> System.out.println("IPE I");
            case "viernes" -> System.out.println("Base de Datos");
            default -> System.out.println("No tienes clase los fines de semana o dato erróneo");
        }
    }
}
