public class App {
    public static void main(String[] args) {
        
        System.out.println("SISTEMA DE AYUDAS PARA ESTUDIANTES JOVENES");
        System.out.println("===========================================\n");
        
        // Variables para almacenar los datos
        String nombre = "";
        int anioNacimiento = 0;
        double rentaFamiliar = 0;
        int miembrosFamilia = 0;
        
        try {
            // Solicitar datos al usuario
            System.out.println("Ingrese sus datos:");
            System.out.print("Nombre: ");
            nombre = System.console().readLine();
            
            System.out.print("Año de nacimiento: ");
            anioNacimiento = Integer.parseInt(System.console().readLine());
            
            System.out.println("\nEjemplos orientativos de renta familiar anual:");
            System.out.println("   Menos de 8.000 -> Renta baja (posible Umbral 1)");
            System.out.println("   Entre 8.000  y 25.000 € -> Renta media (posible Umbral 3)");
            System.out.println("   Más de 25.000 -> Renta alta (sin beca general)");

            System.out.print("Renta familiar anual (euros): ");
            rentaFamiliar = Double.parseDouble(System.console().readLine());
            
            System.out.print("Numero de miembros en la unidad familiar: ");
            miembrosFamilia = Integer.parseInt(System.console().readLine());
            
        } catch (NumberFormatException e) {
            System.out.println("\nError: Debe ingresar un numero valido");
            return;
        } catch (Exception e) {
            System.out.println("\nError al leer los datos: " + e.getMessage());
            return;
        }
        
        // Calcular edad actual
        int edadActual = 2025 - anioNacimiento;
        
        System.out.println("\n"+"ANALISIS DE AYUDAS");
        System.out.println("===========================================\n");
        System.out.printf("Estudiante: %s%n", nombre);
        System.out.printf("Edad actual: %d años%n%n", edadActual);
        
        // Variables para contar ayudas disponibles
        int ayudasDisponibles = 0;
        
        // SWITCH con flecha -> para determinar UMBRAL 1 (Renta Baja) segun miembros familia
        double umbral1 = switch (miembrosFamilia) {
            case 1 -> 8843.0;
            case 2 -> 13264.0;
            case 3 -> 17685.0;
            case 4 -> 22107.0;
            default -> 0.0; // Para mas de 4 personas no hay umbral definido
        };
        
        // SWITCH con flecha -> para determinar UMBRAL 3 (Renta Media) segun miembros familia
        double umbral3 = switch (miembrosFamilia) {
            case 1 -> 14818.0;
            case 2 -> 25293.0;
            case 3 -> 34332.0;
            case 4 -> 40773.0;
            default -> 0.0; // Para mas de 4 personas no hay umbral definido
        };
        
        // Variables para determinar tipo de beca
        boolean cumpleUmbral1 = false;
        boolean cumpleUmbral3 = false;
        String tipoBeca = "";
        
        // Validar que el numero de miembros sea valido (1-4)
        if (miembrosFamilia < 1 || miembrosFamilia > 4) {
            System.out.println("ERROR: El numero de miembros debe estar entre 1 y 4");
            System.out.println("       No se puede evaluar la Beca General\n");
        } else {
            // IF simple para validar si cumple Umbral 1
            if (rentaFamiliar <= umbral1) {
                cumpleUmbral1 = true;
                tipoBeca = "UMBRAL 1 - Renta Baja";
            }
            
            // IF simple para validar si cumple Umbral 3
            if (rentaFamiliar <= umbral3 && !cumpleUmbral1) {
                cumpleUmbral3 = true;
                tipoBeca = "UMBRAL 3 - Renta Media";
            }
        }
        
        // Operador ternario para determinar si es elegible para beca general
        boolean elegibleBecaGeneral = (cumpleUmbral1 || cumpleUmbral3) ? true : false;
        
        if (miembrosFamilia >= 1 && miembrosFamilia <= 4) {
            if (elegibleBecaGeneral) {
                System.out.printf("BECA GENERAL DEL MINISTERIO: ELEGIBLE - %s%n", tipoBeca);
                System.out.printf("   Renta familiar: %.2f euros%n", rentaFamiliar);
                System.out.printf("   Limite Umbral 1: %.2f euros - %s%n", 
                                 umbral1, cumpleUmbral1 ? "Cumple" : "No cumple");
                System.out.printf("   Limite Umbral 3: %.2f euros - %s%n", 
                                 umbral3, cumpleUmbral3 || cumpleUmbral1 ? "Cumple" : "No cumple");
                System.out.printf("   Unidad familiar: %d miembros%n", miembrosFamilia);
                
                // Operador ternario para descripcion del tipo de beca
                String descripcionBeca = cumpleUmbral1 ? 
                    "   Tipo de beca: RENTA BAJA (Mayor cuantia)" :
                    "   Tipo de beca: RENTA MEDIA (Beca basica)";
                System.out.println(descripcionBeca + "\n");
                
                ayudasDisponibles++;
            } else {
                System.out.println("BECA GENERAL DEL MINISTERIO: NO ELEGIBLE");
                System.out.printf("   Renta familiar supera todos los umbrales: %.2f euros%n", 
                                 rentaFamiliar);
                System.out.printf("   Limite Umbral 1: %.2f euros - No cumple%n", umbral1);
                System.out.printf("   Limite Umbral 3: %.2f euros - No cumple%n", umbral3);
                System.out.printf("   Unidad familiar: %d miembros%n%n", miembrosFamilia);
            }
        }
        
        // Operador ternario para determinar elegibilidad bono cultural
        boolean elegibleBonoCultural = (anioNacimiento == 2007) ? true : false;
        
        if (elegibleBonoCultural) {
            System.out.println("BONO CULTURAL JOVEN: ELEGIBLE");
            System.out.printf("   Cumple 18 años en 2025 (nacido en %d)%n", anioNacimiento);
            System.out.println("   Importe: 400 euros\n");
            ayudasDisponibles++;
        } else {
            System.out.println("BONO CULTURAL JOVEN: NO ELEGIBLE");
            System.out.printf("   No cumple 18 años en 2025 (nacido en %d)%n%n", 
                             anioNacimiento);
        }
        
        // IF simple para validar edad dentro del rango
        boolean elegibleTransporte = false;
        if (edadActual >= 18 && edadActual <= 33) {
            elegibleTransporte = true;
        }
        
        if (elegibleTransporte) {
            System.out.println("TARJETA DE TRANSPORTE JOVEN: ELEGIBLE");
            System.out.printf("   Edad valida: %d años (rango 18-33)%n%n", edadActual);
            ayudasDisponibles++;
        } else {
            System.out.println("TARJETA DE TRANSPORTE JOVEN: NO ELEGIBLE");
            System.out.printf("   Edad no valida: %d años (fuera del rango 18-33)%n%n", 
                             edadActual);
        }
        
    }
}
