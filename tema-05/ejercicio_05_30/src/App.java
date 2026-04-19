public class App {
    public static void main(String[] args) throws Exception {

        int horaTotal = 0;
        String dia1 = "";
        int hora1 = 0;
        String dia2 = "";
        int hora2 = 0;
        int diaNum1 = 0;
        int diaNum2 = 0;

        
        do {
            System.out.println("Por favor introduzca el primer día con su hora");   

            while (diaNum1 == 0) {
                dia1 = System.console().readLine("Día: ");
                diaNum1 = switch (dia1) {
                        case "lunes" , "1" -> 1;
                        case "martes" , "2" -> 2;
                        case "miercoles" , "miércoles", "3" -> 3;
                        case "jueves", "4" -> 4;
                        case "viernes", "5" -> 5;
                        case "sabado", "sábado", "6" -> 6;
                        case "domingo", "7" -> 7;
                        default -> 0;
                    };

                if (diaNum1 == 0) { 
                    System.out.println("No ha introducido correctamente el día de la semana.");
                    System.out.println("Los días validos son: lunes, martes, miércoles, jueves, viernes, sábado y domingo");
                }
            }
            hora1 = Integer.parseInt(System.console().readLine("Hora: "));
            
            System.out.println("Por favor introduzca el día día con su hora");

            while (diaNum2 == 0){ 
                dia2 = System.console().readLine("Día: ");
                diaNum2 = switch (dia2) {
                        case "lunes" , "1" -> 1;
                        case "martes" , "2" -> 2;
                        case "miercoles" , "miércoles", "3" -> 3;
                        case "jueves", "4" -> 4;
                        case "viernes", "5" -> 5;
                        case "sabado", "sábado", "6" -> 6;
                        case "domingo", "7" -> 7;
                        default -> 0;
                    };           
                if (diaNum2 == 0){ 
                    System.out.println("No ha introducido correctamente el día de la semana.");
                    System.out.println("Los días validos son: lunes, martes, miércoles, jueves, viernes, sábado y domingo");
                }
            }

            hora2 = Integer.parseInt(System.console().readLine("Hora: "));

            if (diaNum2 < diaNum1) {
                System.out.println("El segundo día debe ser posterior al primero.");
            } else {
                horaTotal = ((diaNum2-diaNum1) * 24) - (hora1-hora2);            
            }
        }while(diaNum1>diaNum2);

        System.out.printf("Entre las %d:00h del %s y las %d:00h del %s hay %d hora/s", hora1, dia1, hora2, dia2, horaTotal);
    }
}
