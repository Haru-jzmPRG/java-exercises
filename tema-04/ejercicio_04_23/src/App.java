public class App {
    public static void main(String[] args) throws Exception {
        
        double baseImponible = Double.parseDouble(System.console().readLine("Introduce la base imponible: "));

        String tipoIva = System.console().readLine("Introduce el tipo de IVA (general, reducido o superreducido): ").toLowerCase();
        int ivaNum = 0;

        switch (tipoIva) {
            case "general":
                ivaNum = 21;
                break;
            case "reducido":
                ivaNum = 10;
                break;
            case "superreducido":
                ivaNum = 4;
                break;
            default:
                System.out.println("Tipo de IVA no válido.");
                break;
        }

        double iva = (baseImponible * ivaNum) / 100;

        String descuento = System.console().readLine("Introduce el código promocional (nopro, mitad, meno5 o 5perc): ").toLowerCase();
        double descuentoNum = 0;

        switch (descuento) {
            case "nopro":
                descuentoNum = 0;
                break;
            case "mitad":
                descuentoNum = (baseImponible + iva) / 2;
                break;
            case "meno5":
                descuentoNum = 5;
                break;
            case "5perc":
                descuentoNum = (baseImponible + iva) * 0.05;
                break;
            default:
                System.out.println("Código promocional no válido.");
                break;
        }

        double total = (baseImponible + iva) - descuentoNum;

        System.out.printf("Base imponible:      %8.2f\n", baseImponible);
        System.out.printf("IVA (%2d%%):           %8.2f\n", ivaNum, iva);
        System.out.printf("Precio con IVA:      %8.2f\n", baseImponible + iva);
        System.out.printf("Descuento (%5s):  -%8.2f\n", descuento, descuentoNum);
        System.out.printf("Total:               %8.2f\n", total);  
    }
}
