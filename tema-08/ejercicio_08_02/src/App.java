package src;
public class App {
    public static void main(String[] args) throws Exception {
        int opcion = -1;
        Bicicleta bici = new Bicicleta();
        Coche coche = new Coche();
        Vehiculo vehiculo = new Vehiculo();

        do {
            System.out.println("""
                                1. Anda con la bicicleta
                                2. Haz el caballito con la bicicleta
                                3. Anda con el coche
                                4. Quema rueda con el coche
                                5. Ver kilometraje de la bicicleta
                                6. Ver kilometraje del coche
                                7. Ver kilometraje total
                                8. Salir 
                            """);
            System.out.println("Elige una opción (1-8): ");
            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:
                    int km = Integer.parseInt(System.console().readLine("¿Cuántos kilómetros quiere recorrer? "));
                    bici.setrecorreBici(km);
                    break;
                case 2:
                    bici.hacerCaballito();
                    break;
                case 3:
                    km = Integer.parseInt(System.console().readLine("¿Cuántos kilómetros quiere recorrer? "));
                    coche.setrecorreCoche(km);
                    break;
                case 4:
                    coche.quemarRueda();
                    break;
                case 5:
                    System.out.println("Kilómetros recorridos: " + bici.getKmBici());
                    break;
                case 6:
                    System.out.println("Kilómetros recorridos: " + coche.getKmCoche());
                    break;
                case 7:
                    vehiculo.setKilometrosTotales(bici.getKmBici() + coche.getKmCoche());
                    System.out.println("Kilómetros totales: " + vehiculo.getKilometrosTotales());
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        }while (opcion != 8);
    }
}
