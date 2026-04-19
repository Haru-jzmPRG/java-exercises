public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("""
                1 - Porgramador junior
                2 - Porgramador senior
                3 - Jefe de proyecto
                """);

        int cargo = Integer.parseInt(System.console().readLine("Intoduzca el cargo del empleado (1-3): "));
        int sueldo = 0;

        switch (cargo) {
            case 1 -> sueldo = 950;
            case 2 -> sueldo = 1200;
            case 3 -> sueldo = 1600;
            default -> System.out.println("No ha seleccionado un cargo correcto");
        }

        int diasVisita = Integer.parseInt(System.console().readLine("¿Cuántos días ha estado de viaje visitando clientes? "));
        int dietas = diasVisita * 30;

        int sueldoBruto = sueldo + dietas;

        int estadoCivil = Integer.parseInt(System.console().readLine("Introduzca estado civil (1 - Soltero, 2 - Casado): "));
        int IRPF = 0;
        switch (estadoCivil) {
            case 1 -> IRPF = 25;
            case 2 -> IRPF = 20;
            default -> System.out.println("No ha seleccionado un estado civil correcto");
        }

        double retencion = (sueldoBruto * IRPF) / 100;
        sueldo = (int)(sueldoBruto - retencion);
                
        System.out.println("----------------------------------");
        System.out.printf("%-22s %9d %2s", "| Sueldo base", sueldo, "|\n");
        System.out.printf("%-22s %9d %2s", "| Dietas (" + diasVisita + " viajes)", dietas, "|\n");
        System.out.println("|--------------------------------|");
        System.out.printf("%-22s %9d %2s", "| Sueldo bruto", sueldoBruto, "|\n");
        System.out.printf("%-22s %9.0f %2s", "| Retención IRPF (" + IRPF + "%)", retencion, "|\n");
        System.out.println("|--------------------------------|");
        System.out.printf("%-22s %9d %2s", "| Sueldo neto", sueldo, "|\n");
        System.out.println("----------------------------------");
    }
}
