public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Venta entradas CineTuring");
        int entradas = Integer.parseInt(System.console().readLine("Número de entradas: "));
        String dia = System.console().readLine("Día de la semana: ");
        
        int precioBase = dia.equals("miercoles") ? 5 : dia.equals("jueves") ? 11 : 8;
        int precio = 0;
        int total = 0;

        if (dia.equals("jueves") && entradas % 2 == 0) {
            precio = 11;
            total = (entradas/2) * precio;
        }
        else if (dia.equals("jueves") && entradas % 2 != 0) {
            int entradasParejas = entradas / 2;
            int entradaSuelta = entradas % 2;
            total = (entradasParejas * 11 + entradaSuelta * 8);

        }
        else if (dia.equals("miercoles")) {
            precio = 5;
            total = entradas * precio;
        }
        else {
            precio = 8;
            total = entradas * precio;
        }

        String tarjeta = System.console().readLine("¿Tiene tarjeta CineTuring (s/n)? ");
        if (tarjeta.equals("s")) {
            double descuento = (int) (total * 0.1);
        }

        if (dia.equals("jueves") && entradas % 2 == 0) {
            int precioParejas = (entradas / 2) * precioBase;
            System.out.printf("Entradas de parejas: " + entradas + "\n");
            System.out.printf("Precio entrada: " + precioBase + " euros\n");
            System.out.printf("Total " + precioParejas + " euros\n");
        }
        else if (dia.equals("jueves") && entradas % 2 != 0) {
            int entradasParejas = entradas / 2;
            int entradaSuelta = entradas % 2;
            int precioParejas = (entradas / 2) * precioBase;
            int precioSuelta = entradaSuelta * 8;
            int precioTotal = precioParejas + precioSuelta;
            System.out.printf("Entradas de parejas: " + entradas + "\n");
            System.out.printf("Precio entrada: " + precioBase + " euros\n");
            System.out.printf("Entradas individuales: " + entradaSuelta + "\n");
            System.out.printf("Precio entrada: 8 euros\n");
            System.out.printf("Total " + precioTotal + " euros\n");
            
        }
        else {
            System.out.printf("Entradas individuales: " + entradas + "\n");
            System.out.printf("Precio entrada: " + precioBase + " euros\n");
            System.out.printf("Total " + total + " euros\n");
        }

        System.out.printf("Total: " + total + " euros\n");
        System.out.printf("Descuento: " + (total * 0.1) + " euros\n");
        System.out.printf("Total a pagar: " + (total - (total * 0.1)) + " euros\n");
    }
}
